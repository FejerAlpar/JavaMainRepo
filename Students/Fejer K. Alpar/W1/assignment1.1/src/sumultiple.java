
public class sumultiple {
	public static void main(String[] args) {
		System.out.println("Sum of multiples of 3 or 5 below 1000 is " + sum(1000));
	}

	public static int sum(int a) {
	int i,sum=0;
	for (i=3; i<a; i++)
		if (i % 3 == 0 || i % 5 == 0) sum+=i;
	return sum;
	}
}