package SerializationConcepts;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializableObj {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("books.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Book b = (Book) ois.readObject();
			System.out.println("Book code: "+ b.bookCode);
			System.out.println("Book name: "+ b.bookName);
			
			ois.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
