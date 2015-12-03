/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfilemanager;

import java.io.File;

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
        
        File data = new File(File.separatorChar + "temp" + File.separatorChar
                + "test.txt");
        
        TextBasedFile file1 = new TextBasedFile(data);
        
    }
    
}
