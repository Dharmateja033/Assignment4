import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a string to remove duplicates");
		String s1 = sc.nextLine();
		char[] c = s1.toCharArray();

		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					c[j] = ' ';
				}
			}
			if ( c[i] != ' ')
				System.out.print(c[i]);
		}

	}

}
