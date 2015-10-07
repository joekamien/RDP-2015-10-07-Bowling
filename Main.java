import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//read in input
		Scanner scanner = new Scanner (System.in); 
		String string;
		while ((string = scanner.nextLine()) != null){
			//split input into array
			String[] split = string.split("\\s+");
			//System.out.println(Arrays.toString(split));
			if (split.length != 10){
				System.err.println("Error in input for line: " + string);
				System.err.println("Expected 10 frames separated by spaces.");
				continue;
			}
			try{
				//generate frames
				Frame[] frame = new Frame[10];
				frame[9] = new Frame(split[9], null);
				for (int i = 8; i >= 0; i --){
					frame[i] = new Frame(split[i], frame[i+1]);
				}
				
				//generate total value
				int sum = 0;
				for(int i = 0; i < frame.length; i++){
					sum += frame[i].getScore();
				}
				System.out.println(sum);
			}catch (Exception e){
				System.err.println("There was an error calculating the total score for frame:");
				System.err.println(string);
				e.printStackTrace();
			}
			
		}
		scanner.close();
	}

}
