
public class PalindromeCode {

	public static void main(String[] args) {

		String s1 = "2552";
		char[] c =s1.toCharArray();
		String reverse = "";

		for (int i = c.length - 1; i >= 0; i--) {
			reverse = reverse + c[i];
		}
		if (s1.equals(reverse))
			System.out.print("Given string is a palindrome");
		else
			System.out.print("Given string is not a palindrome");
	}
}
