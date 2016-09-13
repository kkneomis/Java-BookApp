
public class Book {

	private String title;
	private String author;
	private String description;
	private double price;
	private boolean isInStock;
	
	
	public Book(String book_title, String book_author, String book_description, double book_price, boolean book_isInStock){
		title = book_title;
		author= book_author;
		description = book_description;
		price = book_price;
		isInStock = book_isInStock;
	}
	
	public Book(String id){
		String[] book = getBook(id);
		title = book[1];
		author = book[2];
		description = book[3];
	}
	
	/*
	public void getDisplayText(){
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Description: " + description);
	}
	*/
	
	public String getDisplayText(){
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Description: " + description);
		return title + ", " + author + ", " + description;
	}
	
	
	public String getTitle () {
		return title;
	}
	
	public void setTitle (String new_title) {
		title = new_title;
	}
	
	public String getAuthor () {
		return author;
	}
	
	public void setAuthor (String new_author) {
		author = new_author;
	}
	
	public String getDescription () {
		return description;
	}
	
	public void setDescription (String new_description) {
		description = new_description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double new_price) {
		price = new_price;
	}
 	
	public boolean getIsInStock(){
		return isInStock;
	}
	
	public void setIsInStock(boolean status){
		isInStock = status;
	}
	
	public double getPrice(double quantity){
		if(isInStock == true){
			return price * quantity;
		} else {
			System.out.println("Out of Stock");
			return 0;
		}
		
	}
	
	
	public static String[] getBook(String input){
		String[] output = {input, "No title", "No Author", "No Description", "No Price"};
		
		if(input.equals("Java1001")){
			output[1] = "Head First Java";
			output[2] = "Kathy Sierra and Bert Bates";
			output[3] = "Easy to read Java workbook";
			output[4] = "47.50";
		} else if (input.equals("Java1002")){
			output[1] = "Thinking in Java";
			output[2] = "Bruce Eckel";
			output[3] = "Details about Java under the hood";
			output[4] = "20.00";
		} else if (input.equals("Orcl1003")){
			output[1] = "OCP: Oracle Certified Professional Java SE";
			output[2] = "Jeanne Boyarsky";
			output[3] = "Everything you need to know in one place";
			output[4] = "45.00";
		} else if (input.equals("Python1004")){
			output[1] = "Automate the Boring Stuff with Python";
			output[2] = "Al Sweigart";
			output[3] = "Fun with Python";
			output[4] = "10.50";
		} else if (input.equals("Zombie1005")){
			output[1] = "The Maker's Guide to the Zombie Apocalypse";
			output[2] = "Simon Monk";
			output[3] = "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi";
			output[4] = "16.50";
		} else if (input.equals("Rasp1006")){
			output[1] = "Raspberry Pi Projects for the Evil Genius";
			output[2] = "Donald Norris";
			output[3] = "A dozen fiendishly fun projects for the Raspberry Pi!";
			output[4] = "14.75";
		} 
			
		return output;
	
	}
	
	
}//end Book class
