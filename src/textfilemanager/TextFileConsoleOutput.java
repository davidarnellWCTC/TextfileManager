
package textfilemanager;

import java.util.List;

/**
 *This class inherits from the TextFileMonitorOutput Class and is
 * responsible for outputing specified text from a TextBasedFile object
 * to the console.
 * @author Peter Zarafield
 */
public class TextFileConsoleOutput implements TextFileMonitorOutput{

    private String textLine;
    private List<String> textFile;
    private int line;
    
    @Override
    public void printEntireFile(TextBasedFile file) {
        this.textFile = file.getFileText();
        
        for (String s: textFile){
            System.out.println(s);
        }
    }

    @Override
    public void printSingleLineFromFile(TextBasedFile file, int line) {
        this.textFile = file.getFileText();
        
        System.out.println(textFile.get(line));
    }
    
}
