package solution;

public class Task1 {
    public static void main(String[] args) {

        System.out.println(longestWord("moon moon moon."));

    }

    public static String longestWord(String sentence){
        if( sentence == null || sentence.isEmpty()){
            return "Your sentence is emty or sentence length is 0 ";
            }
        //to make sure string is not empty

        String[] wordsList = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        String longestWord = wordsList[0];

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
