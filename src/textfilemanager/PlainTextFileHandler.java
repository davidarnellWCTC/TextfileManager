/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfilemanager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author darnell
 */
public class PlainTextFileHandler implements TextFileHandler {
    
    private final String EXTENSION = ".txt";

    public PlainTextFileHandler() {
    }
        
/**
 * Creates a new Plain Text File.
 * Do NOT include the file extension in the fileName
 * @param path
 * @param fileName
 * @return 
 */
    @Override
    public File createFile(String path, String fileName) throws IOException {
        
        //Path filePath = Paths.get(path);
        
        File file = new File(path + fileName + EXTENSION);
        
        return file;
    }

    /**
     * Returns the requested plain text file
     * @param path
     * @param fileName
     * @return
     * @throws IOException 
     */
    @Override
    public File getFile(String path, String fileName) throws IOException {
        
//        try{
//        File file = new File(path + fileName + EXTENSION);
//        } catch(IOException ioe){
//            System.out.println("File not found");
//        } finally {
//            //file.close();
//        }
        //file.g
        
        File file = null;
        
        Path filePath = Paths.get(path + fileName + EXTENSION);
        
        if (Files.exists(filePath)){
            file = new File(path + fileName + EXTENSION);
        } else {
            System.out.println(fileName + " does not exist");
            throw new IOException("The " + fileName + " file does not exist");            
        }

        return file;
    }
    
}
