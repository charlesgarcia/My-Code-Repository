package libraryclerk.assistant.system;

import library.borrow.exceptions.AllBooksBorrowedException;
import library.borrow.exceptions.BookNotFoundException;
import library.borrow.exceptions.PendingBorrowedBookException;

public class BorrowBook {

	public void enterIdBorrower (String booktitle, int id)
		throws AllBooksBorrowedException, BookNotFoundException, PendingBorrowedBookException {
		
		if (booktitle.equals("JAVA")) {
			throw new AllBooksBorrowedException();
		}
		else if (booktitle.equals("Comics")) {
			throw new BookNotFoundException();
		}
		else if (id == 11090537) {
			throw new PendingBorrowedBookException();
		}
		else {
			System.out.println("You borrowed " + booktitle + ". Your id number is " + id + ". Please return the book with 5 days.");
		}
	}
}
