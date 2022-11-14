import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = sc.nextLine();
		String s2 = s1.toLowerCase().replace(" ", "");
		char[] c = s2.toCharArray();
		int[] count = new int[s2.length()];
		char maxChar = s2.charAt(0);
		int max;

		for (int i = 0; i < c.length; i++) {
			count[i] = 1;
			for (int j = i + 1; j < c.length; j++) {

				if (c[i] == c[j] && c[i] != ' ') {

					count[i]++;
					c[j] = ' ';
				}
			}

		}
		max = count[0];
		for (int i = 0; i < count.length; i++) {

			if (max < count[i]) {
				max = count[i];
				maxChar = c[i];
			}

		}
		System.out.println(maxChar);

	}

}
