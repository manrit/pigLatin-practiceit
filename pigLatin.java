/* Write a method called pigLatin that accepts as a parameter a Scanner representing an input file. 
Your method should, preserving line breaks, print out the input file's text in a simplified version of Pig Latin, 
a silly English variant where the first letter of each word is moved to the end. Our rules for translating a word to 
Pig Latin are as follows:

If the word starts with a vowel (a, e, i, o, or u), append "yay". For example, "elephant" becomes "elephantyay".
If the word starts with a consonant, move the consonant to the end, and append "ay". For example, "welcome" becomes "elcomeway".
*/

public static void pigLatin(Scanner input){
		while (input.hasNextLine()) {
			String line = input.nextLine();
			String data[] = line.trim().split(" ");
      
			for (int i = 0; i < data.length; i++) {
				String new_word = "";
				String word = data[i];
				char first_char = Character.toLowerCase(word.charAt(0));
				if (first_char == 'a' || first_char == 'e' || first_char == 'i' || first_char == 'o'
						|| first_char == 'u') {
					new_word = word + "yay";
				}
				else {
					new_word = word.substring(1, word.length()) + word.charAt(0) + "ay";
				}
				System.out.print(new_word.toLowerCase() + " ");
			}
			System.out.println();
		}
	}
