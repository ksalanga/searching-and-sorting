import java.util.*;

public class SearchAndSort {
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What algorithm would you like to execute?");
		String algorithm = in.nextLine();
		System.out.println("What type of data?");
		String type = in.nextLine();
		System.out.println("How is it stored?");
		String stored = in.nextLine();
		
		
		
		switch(algorithm.toLowerCase()) {
		case "bubble":
			;
			break;
		case "selection":
			break;
		case "insertion":
			break;
		case "merge":
			break;
		case "linear":
			break;
		case "binary":
			break;
		default:
			System.out.print("Please select a valid sort!");
			break;
		}
		
		in.close();
	}
	
	public int[] bubble(int[] n) {
		return n * bubble(n);
	}
}