import java.util.Scanner;

public class PangramQ6 {

	public static void main(String[] args) {
		String s = "The five boxing wizards jump quickly";
		String s1 = s.toLowerCase().replace(" ", "");
		char[] c = s1.toCharArray();
		int[] a = new int[26];
		boolean flag = true;

		for (int i = 0; i < c.length; i++) {
			a[c[i] - 97]++;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				System.out.println("String isn't a Pangram");
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("String is a Pangram");

	}
}
