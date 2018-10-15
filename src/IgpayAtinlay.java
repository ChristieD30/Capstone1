import java.util.Scanner;
import java.util.regex.Pattern;

public class IgpayAtinlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String contYN;
		Scanner input = new Scanner(System.in);
		String pigLatin;
        StringBuffer sb = new StringBuffer();
		
				
	
		do {
			System.out.println("Please enter a word to be turned into Pig Latin.");
			String userWord = input.nextLine();
			userWord = userWord.toLowerCase();

			
				pigLatin = setPigLatin(userWord);
				System.out.println(pigLatin);
			

			System.out.println("Would you like to translate another word? Y/N");
			contYN = input.nextLine();
		
		} while (contYN.equalsIgnoreCase("y"));
		
		input.close();
		String goodBye = "Thank you for using this program.";
		System.out.println(goodBye);
				
	}

	public static String setPigLatin(String words) {

	

		char firstLett = words.charAt(0);
		

		if (firstLett == 'a' || firstLett == 'e' || firstLett == 'i' || firstLett == 'o' || firstLett == 'u') {
			String words2 = "way";
			words = words.concat(words2);

		} else {
			words = getConsonants(words);

		
		 }
		return words;

	}

	public static String getConsonants(String words) {
		String vowels = "aeiou";

		for (int i = 0; i < words.length(); i++) {

			if (vowels.contains("" + words.charAt(i))) {

				String prefix = words.substring(0, i);

				String suffix = words.substring(i);

				words = suffix + prefix + "ay";

				break;
			}
		}
		return words;
	}

}
