class Book{
	private String name;
	private String author;
	private boolean isBookLendedOut;
	private int identifier;
	
	public Book( String name, String author, boolean isBookLendedOut, int identifier) {
		this.name = name;
		this.author = author; 
		this.isBookLendedOut = isBookLendedOut;
		this.identifier = identifier;
		
	}

	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		 return name;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public String getAuthor(){
		 return author;
	}
	
	public void setIsBookLendedOut(boolean isBookLendedOut){
		this.isBookLendedOut = isBookLendedOut;
	}
	
	public boolean getIsBookLendedOut(){
		 return isBookLendedOut;
	}
	
	public void setIdentifier(int identifier){
		this.identifier = identifier;
	}
	
	public int getIdentifier(){
		return identifier;
	}
}
