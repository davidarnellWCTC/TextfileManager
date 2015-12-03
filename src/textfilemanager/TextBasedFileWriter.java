
package textfilemanager;

import java.util.List;

/**
 *
 * @author Peter Zarafield
 */
public class TextBasedFileWriter {
    
    private TextBasedFile file;
    
    private List<String> textToWriteToFile;
    
    /**
     * This method concatinates a new List<String> object to the existing one
     * in a TextBasedFile object
     * @param textToAdd - a List<String> containing a list of String objects 
     * to add to the existing TextBasedFile object
     * @param file - TextBasedFile file object the text is being added to
     */
    public void addTextToFile(List<String> textToAdd, TextBasedFile file){
        //List<String> existingText = file.getFileText();
        
        List<String> combinedText = file.getFileText();
        
        for (String s : textToAdd){
            combinedText.add(s);
        }
        
        file.chageFileText(combinedText);
        
    }
    
    public void replaceTextInFile(List<String> replacementText, TextBasedFile file){
        // The method called replaces the text in the file.
        file.chageFileText(replacementText);
    }
    
}
