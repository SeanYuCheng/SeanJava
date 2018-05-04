
public class booktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Book book:Book.values())
		{
			System.out.printf("%-10s%-45s%s\n", book, book.getTitle(),book.getCopyrightYear());
		}

	}

}
