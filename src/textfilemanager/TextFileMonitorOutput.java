
package textfilemanager;

/**
 *
 * @author Peter Zarafield
 */
public interface TextFileMonitorOutput {
    
    public void printEntireFile(TextBasedFile file);
    
    public void printSingleLineFromFile(TextBasedFile file, int line);
    
}
