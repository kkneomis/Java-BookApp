
public class BookApp {
	
	public static void main(String[] args){
		Book myBook = new Book("Twilight", "Not Me", "A book about love and sht", 32.122, true);
		System.out.println(myBook.getDisplayText());
		
		Book myOtherBook = new Book("Java1001");
		System.out.println(myOtherBook.getDisplayText());
		
	}

}
