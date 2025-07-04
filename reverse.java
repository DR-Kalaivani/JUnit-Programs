package ex2.strrev;
publicclass reverse {
public String reverseWord(String word) {
	if (word == null) {
		returnnull; // Return null for null input
		}
		StringBuilder reversed = new StringBuilder(word);
		returnreversed.reverse().toString(); // Return the reversed string
		}
}
