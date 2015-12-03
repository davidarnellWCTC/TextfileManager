
package textfilemanager;

import java.util.List;
import java.util.*;

/**
 *
 * @author Peter Zarafield
 */
public class FormatCsvToString implements TextFormatter{

    /**
     * This method takes a CSV file and removes all of the commas
     * @param l - List<String> that will be formatted
     * @return 
     */
    @Override
    public List<String> stringListFormatter(List<String> l) {
        List<String> originalText = l;
        
        List<String> formattedText = new ArrayList<>();
        
        for (String s : originalText) {

                String newLine = s.replace(",", "");

                formattedText.add(newLine);
            }
        
        return formattedText;        
    }

    @Override
    public String stringFormatter(String s) {
        String originalText = s;
        String formattedText;
        
        formattedText = s.replace(",", "");
        
        return formattedText;
    }
    
}
