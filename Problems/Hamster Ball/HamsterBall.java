
public class HamsterBall implements Comparable<HamsterBall> {

	int number;
	double circumference;
	
	@Override
	public int compareTo(HamsterBall otherBall) {
		if(circumference < otherBall.circumference) return -1;
		else if(circumference == otherBall.circumference) return 0;
		else return 1;
	}
	
	@Override
	public String toString() {
		return "(" + number + ", " + circumference + ")";
	}
}
