import java.util.Scanner;

public class LastWorld {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		int operations = scanner.nextInt();
		
		for(int i = 0; i < operations; i++) {
			int startIndex = scanner.nextInt();
			int length = scanner.nextInt();
			
			input = input.substring(startIndex, startIndex + length);
		}
		System.out.println(input);
	}

}
