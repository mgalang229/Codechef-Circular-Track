import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int a = fs.nextInt(), b = fs.nextInt(), m = fs.nextInt();
			int first = ((b % m) - (a % m) + m) % m;
			int second = ((a % m) - (b % m) + m) % m;
			System.out.println(Math.min(first, second));
		}
		fs.close();
	}
}
