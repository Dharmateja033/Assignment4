import java.util.Arrays;
import java.util.Scanner;

public class AnagramQ5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String s1 = sc.nextLine().toLowerCase().replace(" ", "");
		System.out.println("Enter second string");
		String s2 = sc.nextLine().toLowerCase().replace(" ", "");
		char[] c = s2.toCharArray();
		char[] c1 = s1.toCharArray();
		char temp, temp1;

		if (s1.length() != s2.length()) {
			System.out.println("Strings are not Anagrams");
		} else {
			for (int i = 0; i < c.length; i++) {
				for (int j = 1; j < c.length - i; j++) {
					if (c[j] < c[j - 1]) {
						temp = c[j];
						c[j] = c[j - 1];
						c[j - 1] = temp;
					}
				}
			}
			for (int i = 0; i < c1.length; i++) {
				for (int j = 1; j < c1.length - i; j++) {
					if (c1[j] < c1[j - 1]) {
						temp1 = c1[j];
						c1[j] = c1[j - 1];
						c1[j - 1] = temp1;
					}
				}
			}
			
			if (Arrays.equals(c1, c))
				System.out.println("Strings are Anagrams");
			else
				System.out.println("Strings are not Anagrams");
		}

	}

}
