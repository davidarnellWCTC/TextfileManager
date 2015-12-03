
package textfilemanager;

import java.io.File;
import java.io.IOException;

/**
 *This interface is used for handling text based files such as CSV or String
 * @author darnell
 */
public interface TextFileHandler {
    
    public File createFile(String path, String fileName) throws IOException ;
    
    public File getFile(String path, String fileName) throws IOException ;
    
}
