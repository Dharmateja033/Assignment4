import java.util.Scanner;

public class PrintDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a string to print duplicates");
		String s1 = sc.nextLine();
		char[] c = s1.toCharArray();
		int count;

		for (int i = 0; i < c.length; i++) {
			count = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;
					c[j] = ' ';
				}
			}
			if (count > 1 && c[i] != ' ')
				System.out.print(c[i] + " ");

		}

	}

}
