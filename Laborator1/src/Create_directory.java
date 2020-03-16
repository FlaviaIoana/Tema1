import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Create_directory {
	 public static void main(String[] args) {

	        File file = new File("C:\\Users\\flavia\\eclipse-workspace\\Laborator1\\Facultate");
	        if (!file.exists()) {
	            if (file.mkdir()) {
	                System.out.println("Directory is created!");
	            } else {
	                System.out.println("Failed to create directory!");
	            }
	        }
//	        boolean flag = false;
//
//	     // create File object
//	  //   File stockFile = new File("C:\\Users\\flavia\\eclipse-workspace\\Laborator1\\Facultate\\ceva.txt");
//
//	     try {
//	         flag = stockFile.createNewFile();
//	     } catch (IOException ioe) {
//	          System.out.println("Error while Creating File in Java" + ioe);
//	     }
//
//	     System.out.println("stock file" + stockFile.getPath() + " created ");
//
}
}
