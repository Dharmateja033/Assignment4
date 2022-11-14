import java.util.Scanner;

public class UniqueCharQ7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = sc.nextLine();
		String s2 = s1.toLowerCase().replace(" ", "");
		char[] c = s2.toCharArray();
		int count = 1;

		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {

				if (c[i] == c[j]) {

					count++;
					break;
				}
			}
		}
		if (count == 1)
			System.out.println("Characters in the string are unique");
		else
			System.out.println("Characters in the string are not unique");

	}

}
