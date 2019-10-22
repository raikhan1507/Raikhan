package testTask;

import org.junit.Assert;
import org.junit.Test;
import solution.Task1;


public class Test1 extends Task1 {

   @Test
    public void happyPath1() {
       String str ="The cow jumped over the moon";
       int expectedMaxLength=6;
       String expectedLongestWord="jumped";

       Assert.assertTrue("Happy path test 1 failed, expected word length doesn't match",
               expectedMaxLength==Integer.parseInt(Task1.longestWord(str).substring(0, str.indexOf(" "))));
       Assert.assertTrue("Happy path test 1 failed, expected longest word doesn't match",
               expectedLongestWord.equalsIgnoreCase(Task1.longestWord(str).substring(2)));
   }

   @Test
   public void happyPath2(){
      String allEquals="moon moon moon";
      int expectedMaxLength=4;
      String expectedLongestWord ="moon";

      Assert.assertTrue("Happy path test 2 failed, expected word length doesn't match",
              expectedMaxLength==Integer.parseInt(Task1.longestWord(allEquals).substring(0,1)));
      Assert.assertTrue("Happy path test 2 failed, expected word length doesn't match",
              expectedLongestWord.equalsIgnoreCase(Task1.longestWord(allEquals).substring(2)));
   }

   @Test
   public void negativeScenario1(){
      String sentenceIsEmpty="";

      Assert.assertTrue(Task1.longestWord(sentenceIsEmpty).equalsIgnoreCase("Your sentence is empty"));

   }

   @Test
   public void negativeScenario2(){
      String sentenceNull=null;
     Assert.assertTrue(Task1.longestWord(sentenceNull).equalsIgnoreCase("Your sentence is null"));

   }
   @Test
   public void negativeScenario3(){
      String sentenceContainsChar="The1, cow7484! #jumped";
      int expectedMaxLength=6;
      String expectedLongestWord ="jumped";
      Assert.assertTrue("Negative scenario 3 failed, expected word length doesn't match",
              expectedMaxLength==Integer.parseInt(Task1.longestWord(sentenceContainsChar).substring(0,1)));
      Assert.assertTrue("Negative scanario 3 failed, expected longest word doesn't match",
              expectedLongestWord.equalsIgnoreCase(Task1.longestWord(sentenceContainsChar).substring(2)));

   }

   @Test
   public void negativeScenario4(){
      String sentenceContainsSpaces="    ";
      int expectedMaxLength=0;
      String expectedLongestWord ="";
      Assert.assertTrue(expectedMaxLength == Integer.parseInt("" + Task1.longestWord(sentenceContainsSpaces).charAt(0)));
   }

}
