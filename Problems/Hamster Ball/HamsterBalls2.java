import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HamsterBalls2 {
	
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
			
			int n = (int)(tapeLength / ball.circumference);
			if (n == 0)
			{
				break;
			}
			if (n > ball.number) n = ball.number;
			tapeLength = tapeLength - n * ball.circumference;
			tapedBalls += n;
		}
		System.out.println(tapedBalls);
	}
}
