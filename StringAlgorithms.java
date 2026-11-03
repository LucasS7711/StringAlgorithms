public class StringAlgorithms {
    public static String printCharacters(String word) {
        String toReturn = "";
        int count = 0;
        while (count < word.length()) {
           toReturn += word.substring(count, count + 1) + "\n";
           count++;
        }
        return toReturn;
    }
    public static String reverseWord(String word) {
        String toReturn = "";
        int count = word.length();
        while (count > 0 ) {
           toReturn += word.substring(count - 1, count);
           count--;
        }
        return toReturn;
    }


    /**
     * Challenge 3:
     * Write a method that takes a String 'sentence' and returns
     * the sentence with the first letter of each word capitalized.
     */
    public static String capitalizeString(String sentence) {
        /*String toReturn = "";
        int count = 1;
        String temp = "";
        while (count < sentence.length()) {
           if (sentence.substring(count - 1, count) == " ") {
              temp = sentence.substring(count, count + 1);
              toReturn += temp.toUpperCase();
           } else {
           toReturn +=  sentence.substring(count, count + 1);
           
           }
           count++;
        }
        return toReturn;*/
        return "";
    }


    /**
     * Challenge 4:
     * Write a method that takes a String 'word' and returns true
     * if the word is a palindrome (ignoring case), false otherwise.
     */
    public static boolean detectPalindrome(String word) {
        // TODO: Implement this method
        return false;
    }


    /**
     * Challenge 5:
     * Write a method that takes a String 'word' and returns the
     * first character that appears exactly once. If no such
     * character exists, return a space ' '.
     */
    public static char firstUniqueChar(String word) {
        // TODO: Implement this method
        return ' ';
    }


    /**
     * Main method:
     * Test each method at least once.
     */
    public static void main(String[] args) {

        // TODO: Add test calls for each challenge method
        
        System.out.println("Testing printCharacters:" + printCharacters("hello"));
        // Example:
        // System.out.println(printCharacters("hello"));

        System.out.println("\nTesting reverseWord:" + reverseWord("hello"));
        // Example:
        // System.out.println(reverseWord("hello"));

        System.out.println("\nTesting capitalizeString:" + capitalizeString("gavin acherberger is a short boy"));
        // Example:
        // System.out.println(capitalizeString("the quick brown fox"));

        System.out.println("\nTesting detectPalindrome:");
        // Example:
        // System.out.println(detectPalindrome("racecar"));

        System.out.println("\nTesting firstUniqueChar:");
        // Example:
        // System.out.println(firstUniqueChar("swiss"));
    }
}
