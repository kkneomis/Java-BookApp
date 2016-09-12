
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
	
	public void getDisplayText(){
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Description: " + description);
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
	
	
	
}//end Book class
