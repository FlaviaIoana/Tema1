import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;  
public class CSVReaderInJava { 
	
	
	public static void main(String[] args) throws IOException { 
		
		List<Student> students = readStudentsFromCSV("C:\\\\Users\\\\flavia\\\\eclipse-workspace\\\\Laborator1\\\\Facultate\\\\studenti-automatica.txt"); 
		for (Student a : students) { 
			System.out.println(a); 
			} 
		List<Student> studentss = readStudentsFromCSV("C:\\\\Users\\\\flavia\\\\eclipse-workspace\\\\Laborator1\\\\Facultate\\\\studenti-calculatoare.txt"); 
		for (Student b : students) { 
			System.out.println(b); 
			} 
		students.addAll(studentss);
		Collections.sort(students, (a, b) -> {
            int GPAcompare = Double.compare(b.getMedie(),a.getMedie());
            int firstNameCompare = a.getNume().compareTo(b.getNume());
            int secondNameCompare = a.getPrenume().compareTo(b.getPrenume());

            if (GPAcompare == 0 && firstNameCompare == 0) return secondNameCompare;
            else if (GPAcompare == 0) return firstNameCompare;
            else return GPAcompare;
        });
		

		
		try(BufferedWriter outputFile = new BufferedWriter(new FileWriter("C:\\\\Users\\\\flavia\\\\eclipse-workspace\\\\Laborator1\\\\Facultate\\\\fisier-final.txt"))) {
			for(Student student : students) {
				outputFile.write(student.toString());
				outputFile.newLine();
			}

		}
		}
	private static List<Student> readStudentsFromCSV(String fileName) { 
		List<Student> students = new ArrayList<>(); 
		Path pathToFile = Paths.get(fileName); 
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) { 
			String line = br.readLine(); 
			while (line != null) {  
				String[] attributes = line.split(","); 
				Student student = createStudent(attributes); 
				students.add(student);  
				line = br.readLine(); 
				} 
			} catch (IOException ioe) { 
				ioe.printStackTrace(); 
				} 
		return students; 
		}
	private static Student createStudent(String[] metadata) {
		String nume = metadata[0];
		String prenume = metadata[1];
		String email = metadata[2];
		int credite = Integer.parseInt(metadata[3]);
		double medie = Double.parseDouble(metadata[4]);
		return new Student(nume, prenume, email, credite, medie);
		} 
	}

