import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HamsterBalls1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double tapeLength = scanner.nextDouble();
		int totalBalls = scanner.nextInt();
		
		ArrayList<HamsterBall> balls = new ArrayList<>(totalBalls);
		
		for(int i = 0; i < totalBalls; i++) {
			
			int number = scanner.nextInt();
			int radius = scanner.nextInt();
			
			double circum = radius * 2 * Math.PI;
			
			HamsterBall ball = new HamsterBall();
			ball.number = number;
			ball.circumference = circum;
			
			balls.add(ball);
		}
		Collections.sort(balls);
		
		int tapedBalls = 0;
		
		for(int i = 0; i < totalBalls; i++) {
			HamsterBall ball = balls.get(i);
			
			for (int j = 0; j < ball.number; j++)
			{
				if (tapeLength - ball.circumference < 0)
				{
					System.out.println(tapedBalls);
					return;
				}
				else
				{
					tapeLength = tapeLength - ball.circumference;
					tapedBalls++;
				}
			}
			
			}
		System.out.println(tapedBalls);
	}
}
