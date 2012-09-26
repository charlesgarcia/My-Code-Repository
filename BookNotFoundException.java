package library.borrow.exceptions;

public class BookNotFoundException extends Exception{

	public BookNotFoundException() {
		super("The book you are looking is not found in the database.");
	}
	
}