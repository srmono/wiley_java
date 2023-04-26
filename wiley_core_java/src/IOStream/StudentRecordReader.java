package IOStream;

import java.util.*;
import java.io.*;

public class StudentRecordReader {
	DataInputStream dataInput;
	
	public StudentRecordReader(String inputFile) throws FileNotFoundException {
		dataInput = new DataInputStream(new FileInputStream(inputFile));
	}
	
	//data in byte
	public List<Student> readAll() throws IOException {
		List<Student> listStudent = new ArrayList<>();
		
		try {
			while(true) {
				String name  = dataInput.readUTF();
				boolean gender = dataInput.readBoolean();
				int age = dataInput.readInt();
				float grade = dataInput.readFloat();
				
				System.out.println("Name: " + name);
				
				Student student = new Student(name, gender, age, grade);
				
				listStudent.add(student);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		dataInput.close();
		return listStudent;
	}
	

	public static void main(String[] args) {
//		if(args.length < 1) {
//			System.out.println("Please provide output file");
//			System.exit(0);
//		}
		
		String inputFile = "I:\\Training\\Wiley\\resources\\java_concepts\\wiley_core_java\\data\\students.dat";
		
		try {
			StudentRecordReader reader = new StudentRecordReader(inputFile);
			List<Student> listOfStudents = reader.readAll();
			
			for(Student student: listOfStudents) {
				System.out.print(student.getName() + "\t");
				System.out.print(student.getGender() + "\t");
				System.out.print(student.getAge() + "\t");
				System.out.println(student.getGrade());
			}
			
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
	}
}








