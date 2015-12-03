/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfilemanager;

import java.util.List;

/**
 *
 * @author Peter Zarafield
 */
public class TextBasedFileReader {
    
    TextBasedFile file;
    
    List<String> fileText;

    public TextBasedFileReader() {
    }
    
    /**
     * This method takes an instance of the TextBasedFile object and 
     * returns the text of the file as a List<String>
     * @param file - TextBasedFile file
     * @return 
     */
    public List<String> getFileText(TextBasedFile file){
        fileText = file.getFileText();
        
        return fileText;
    }
    
}
