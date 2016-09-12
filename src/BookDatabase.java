import java.util.Arrays;
import java.util.Scanner;

public class BookDatabase {
	
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the book ID");
		String input = keyboard.nextLine();
		
		String[] output = process(input);
		
		System.out.println("SKU: " + output[0]);
		System.out.println("Title: " + output[1]);
		System.out.println("Author: " + output[3]);
		System.out.println("Description: " + output[3]);
		System.out.println("Price: " + output[4]);
		
		
	}
	
	public static String[] process(String input){
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

}
