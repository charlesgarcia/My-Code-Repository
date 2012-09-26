package library.borrow.exceptions;

public class PendingBorrowedBookException extends Exception{

	public PendingBorrowedBookException() {
		super("You cannot borrow a book. Please return the previous book borrowed before borrowing a new one!");
	}
}
