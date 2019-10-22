package testTask;

import org.junit.Assert;
import org.junit.Test;
import solution.Task1;

import java.sql.SQLOutput;

public class Test1 extends Task1 {

   @Test
    public void happyPath() {
       String str ="The cow jumped over the moon";
       int expectedMaxLength=6;
       String expectedLongestWord="jumped";

       Assert.assertTrue(expectedMaxLength==Integer.parseInt(Task1.longestWord(str).substring(0,1)));
       Assert.assertTrue(expectedLongestWord.equals(Task1.longestWord(str).substring(2)));
   }

   @Test
   public void happyPath2(){
      String allEquals="moon moon moon";
      int expectedMaxLength=4;
      String expectedLongestWord ="moon";

      Assert.assertTrue(expectedMaxLength==Integer.parseInt(Task1.longestWord(allEquals).substring(0,1)));
      Assert.assertTrue(expectedLongestWord.equals(Task1.longestWord(allEquals).substring(2)));
   }

   @Test
   public void negativePath(){
      String sentenceIsEmpty="";
      System.out.println(longestWord(sentenceIsEmpty));



   }
}
