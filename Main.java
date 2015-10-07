import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//read in input
		Scanner scanner = new Scanner (System.in); 
		String string;
		while ((string = scanner.nextLine()) != null){
			//split input into array
			String[] split = string.split("\\s+");
			System.out.println(Arrays.toString(split));
			if (split.length != 10){
				System.err.println("Error in input for line: " + string);
				System.err.println("Expected 10 frames separated by spaces.");
				continue;
			}
		}
		scanner.close();
	}

}
