package lesson.pkg10;

import java.io.BufferedWriter;
import java.io.IOException;

public class MyFileWriter {
    
    String strContent = "This is the content to write into file\n";

        // If the file doesn't exists, create and write to it
		// If the file exists, truncate (remove all content) and write to it
        try (FileWriter writer = new FileWriter("app.log");
             BufferedWriter bw = new BufferedWriter(writer)) {

            bw.write(strContent);

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

    private MyFileWriter(String applog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
