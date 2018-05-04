public enum Book{
	JHTP("Java How to Program","2012","d"),
	CHTP("C How to Program","2008","s");
	private final String title;
	private final String copyrightYear;
	private Book(String bookTitle,String year,String s) {
		title = bookTitle;
		copyrightYear = year;
	}
	public String getTitle() {return title;}
	public String getCopyrightYear() {
		return copyrightYear;
	}
	
}
