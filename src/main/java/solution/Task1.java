package solution;

public class Task1 {
    public static void main(String[] args) {

        System.out.println(longestWord(" "));

    }

    public static String longestWord(String sentence){
        if( sentence == null) return "Your sentence is null";
        if(sentence.isEmpty()) return "Your sentence is empty";

        //to make sure string is not empty

        sentence = sentence.replaceAll("[^a-zA-Z ]", "");

        String[] wordsList = sentence.toLowerCase().split("\\s+");
        for (String str: wordsList) {
            if(str == null) return "Your array is populated with empty strings";
        }

        String longestWord = "";

        //remove characters in String that are not alphanumeric
        //split string into array

        for(int i = 0; i <= wordsList.length-1; i++){
            if( longestWord.length() <= wordsList[i].length() ) {
                longestWord = wordsList[i];
                //if space it's the end of the word
                // save the first length in a variable
                // compare the longest word saved to current value
            }
        }

        return longestWord.length() + " " + longestWord;
    }

          // return longest word length and word


}
