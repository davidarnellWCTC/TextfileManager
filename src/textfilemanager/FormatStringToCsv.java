
package textfilemanager;

import java.util.List;
import java.util.*;

/**
 *
 * @author Peter Zarafield
 */
public class FormatStringToCsv implements TextFormatter{

    /**
     * This method adds a comma to each space after each word
     * @param l - List<String> That will be formatted
     * @return 
     */
    @Override
    public List<String> stringListFormatter(List<String> l) {
        return l;
    }

    /**
     * This method adds a comma after each word in a String
     * @param s
     * @return 
     */
    @Override
    public String stringFormatter(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
