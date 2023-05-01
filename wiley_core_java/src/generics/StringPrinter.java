package generics;

public class StringPrinter {
	String valToPrint;

	public StringPrinter(String valToPrint) {
		super();
		this.valToPrint = valToPrint;
	}
	
	public void print() {
		System.out.println(valToPrint);
	}
}
