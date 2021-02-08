package lesson.pkg10;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;


public class Lesson10 {

    public static void main(String[] args) {
        
        String strFilename = null ;
        
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

		int returnValue = jfc.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
                        try {
                            strFilename = selectedFile.getCanonicalPath();
                        } catch (IOException ex) {
                            System.out.println("Exception while getting cannonical path!");
                            ex.printStackTrace(System.out);
                        }
                        FileReader reader = new FileReader();
                        if (null != strFilename)
                            reader.ReadFileLineByLine_java8(strFilename);
                        
                        // System.out.println(selectedFile.getAbsolutePath());
		}
                

    }
    
}
