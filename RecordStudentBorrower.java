package dlscsb.lrc.student;

import libraryclerk.assistant.system.BorrowBook;

import library.borrow.exceptions.AllBooksBorrowedException;
import library.borrow.exceptions.BookNotFoundException;
import library.borrow.exceptions.PendingBorrowedBookException;

import java.util.Scanner;

public class RecordStudentBorrower {

	
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter book title: ");
			String booktitle = scanner.nextLine();

			System.out.print("Enter id number: ");
			int id = scanner.nextInt();
			
			BorrowBook bb = new BorrowBook();
			
			bb.enterIdBorrower(booktitle, id);
			
		} catch (AllBooksBorrowedException abbe) {
			System.err.println(abbe.getMessage());
		} catch (BookNotFoundException bnfe) {
			System.err.println(bnfe.getMessage());
		} catch (PendingBorrowedBookException pbbe) {
			System.err.println(pbbe.getMessage());
			
		}
	}

}
