import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = sc.nextLine();
		String s2 = s1.toLowerCase();
		char[] c = s2.toCharArray();
		int vowel = 0;
		int consonant = 0;
		int sChar = 0;

		for (int i = 0; i <= c.length - 1; i++) {
			if (c[i] == 97 || c[i] == 101 || c[i] == 105 || c[i] == 111 || c[i] == 117) {
				vowel++;
			} else if ((c[i] >= 97 && c[i] <= 122)
					&& (c[i] != 97 || c[i] != 101 || c[i] != 105 || c[i] != 111 || c[i] != 117)) {
				consonant++;
			} else if ((c[i] >= 33 && c[i] <= 47) || (c[i] >= 58 && c[i] <= 64) || (c[i] >= 91 && c[i] <= 96)
					|| (c[i] >= 123 && c[i] <= 126))
				sChar++;
		}
		System.out.println("No of vowels in the string            : " + vowel);
		System.out.println("No of consonants in the string        : " + consonant);
		System.out.println("No of specialCharacters in the string : " + sChar);
	}

}
