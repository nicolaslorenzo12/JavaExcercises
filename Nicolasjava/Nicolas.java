public class Nicolas{
	public static void main (String [] args) {
		Book book1 = new Book("War and Peace","Leo Tolstoy", true, 1);
		Book book3 = book1;
		Book book2 = new Book("whatever","adsfj;", true, 2);
		
		book1 = book2;
		book1.setAuthor("Martijn");
		book1 = new Book("asdf","other;", true, 2);
		
		//int x = 1;
		//int y = 5 ;
		//int s = x + y;
		//x = y;
		//x = 2;
		
		
		System.out.println(book1.getAuthor());
		System.out.println(book2.getAuthor());
	}
}