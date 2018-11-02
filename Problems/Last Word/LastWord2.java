import java.util.Scanner;

public class LastWord2 {

	public static void main(String[] args) {

		long start = System.nanoTime();

		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		int operations = scanner.nextInt();

		for(int i = 0; i < operations; i++) {
			int startIndex = scanner.nextInt();
			int length = scanner.nextInt();

			input = input.substring(startIndex, startIndex + length);
		}
		System.out.println(input);
		System.out.println("Time to run: " + (System.nanoTime() - start) + " nanoseconds");
	}

}
