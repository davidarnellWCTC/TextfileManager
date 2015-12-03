
package textfilemanager;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Peter Zarafield
 */
public class TextFileManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //File data = new File(File.separatorChar + "temp" + File.separatorChar + "test2.txt");
        
        //TextBasedFile file1 = new TextBasedFile(data);
        
        TextFileHandler tfh = new PlainTextFileHandler();
        
        try {
            File file = tfh.createFile("E:/temp/", "test3");
        } catch (IOException ex) {
            Logger.getLogger(TextFileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
