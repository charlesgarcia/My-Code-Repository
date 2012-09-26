package library.borrow.exceptions;

public class AllBooksBorrowedException extends Exception{

	public AllBooksBorrowedException() {
		super("All books are borrowed. Please choose or try another book.");
	}
}