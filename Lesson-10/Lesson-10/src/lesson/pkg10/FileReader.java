package lesson.pkg10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    
    public String[] ReadFileLineByLine_java8(String filename) {
        String strContent = null;
        //read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(filename))) {
                        //System.out.println(stream);
                        
                        String[] lines = (String[])stream.toArray();
                        for (int i = 0; i < lines.length; ++i)
                            System.out.println(lines[i]);
                    
			//stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
        
    }
}
