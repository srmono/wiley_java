package SerializationConcepts;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableObj {

	public static void main(String[] args) {
		Book b1 = new Book(108, "Java Essentials");
		
		try (
				FileOutputStream fos = new FileOutputStream("books.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos)
			){
			oos.writeObject(b1);
			fos.close();
			System.out.println("Task completed");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
