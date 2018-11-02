import java.util.Scanner;

public class LastWord1 {

	public static void main(String[] args) {

		long start = System.nanoTime();

		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		int operations = scanner.nextInt();

		int totalStart = 0;
		int lastLength = 0;

		for(int i = 0; i < operations; i++) {
			int startIndex = scanner.nextInt();
			int length = scanner.nextInt();

			if (i == operations - 1)
				lastLength = length;
			totalStart += startIndex;

		}
		System.out.println(input.substring(totalStart, totalStart + lastLength));
		System.out.println("Time to run: " + (System.nanoTime() - start) + " nanoseconds");
	}

}
