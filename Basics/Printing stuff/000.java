import java.util.*;

class Hello {
	public static int conv(int x) {
		return x - (x % 2);
	}

	public static void main(String args[]) {
		Scanner clo = new Scanner(System.in);
		int d = clo.nextInt();
		for (int i = 1; i <= d; i++) {
			System.out.println("The integer " + i + " is " + conv(i));
		}
	}
}
