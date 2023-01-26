
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        int wordCount = 0;
        boolean isWord = false; 
        int endOfLine = in.length() - 1; 
        char[] characters = in.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            // if the char is a letter, word = true.
            if (Character.isLetter(characters[i]) && i != endOfLine) { isWord = true;

          // if char isn't a letter and there have been letters before, 
          // counter goes up. 
        } else if (!Character.isLetter(characters[i]) && isWord) {
            wordCount++; 
            isWord = false;

        // last word of String; if it doesn't end with a non letter, it 
        // wouldn't count without this.
         } else if (Character.isLetter(characters[i]) && i == endOfLine) { wordCount++; } }
        
        return wordCount;
    }
}
