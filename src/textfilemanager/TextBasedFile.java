
package textfilemanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 *
 * This class instantiates an instance of a text based file.
 * The text based file is passed in through a constructor and then each line is 
 * saved, un altered, to a List<String>.
 * 
 * @author Peter Zarafield
 */
public class TextBasedFile {
    
    private File file;
    
    private List<String> fileText = new ArrayList<>();;
    
    private String fileName;
    private String filePath;

    /**
     * The TextBasedFile constructor accepts a file to instantiate the class.
     * The text for the file is saved, automatically, to a List<String> object
     * where each line of unchanged text represents a different object within the List.
     * @param file - File file the constructor sets to instantiate this class
     */
    public TextBasedFile(File file) {
        this.file = file;
        
        this.fileName = file.getName();
        
        setFileText(file);
    }

    public File getFile() {
        return file;
    }

    /**
     * The setFile(File file) method replaces the existing file in this class.
     * When the file is set, the existing List<String> containing the file data
     * is automatically reset.
     * @param file - File file saved to the class through this method
     */
    public void setFile(File file) {
        this.file = file;
        
        // the contents of the fileText are automatically updated
        setFileText(file);
    }
    
    public void chageFileText(List<String> newFileText){
        this.fileText = newFileText;
    }

    /**
     * The getFileText returns the existing unchanged text from the File file object
     * in this class. Each line in the text based file is a separate object within
     * the List.
     * @return List<String>
     */
    public List<String> getFileText() {
        return fileText;
    }

    // This class is responsible for setting the text saved to the List<String>
    // External classes should not have the permissions to modify this data.
    private void setFileText(File file) {
        
        this.file = file;

        List<String> fileContents = new ArrayList<>();

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            String line = in.readLine();
            while (line != null) {
                //System.out.println(line);
                //line = in.readLine();  // strips out any carriage return chars
                fileContents.add(line);
                line = in.readLine();
            }
        } catch (IOException ioe) {
            System.out.println("There were errors reading the contents of the file.");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }     
        
        this.fileText = fileText;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * This method finds the absolute file path of the file in this class
     * @return - String value of the absolute file path 
     */
    public String getFilePath() {
        filePath = this.file.getAbsolutePath();
        return filePath;
    }

    // I'll get back to this when I can get it to work.
    public void setFilePath(String filePath) {
        
        Path path = Paths.get(filePath);
        
        //file.
        
        //this.file.
        
        this.filePath = filePath;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.file);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TextBasedFile other = (TextBasedFile) obj;
        if (!Objects.equals(this.file, other.file)) {
            return false;
        }
        return true;
    }

    /**
     * This method returns the file.getName() for the file
     * @return - String fileName 
     */
    @Override
    public String toString() {
        return fileName;
    }
    
    
    
    
    
}
