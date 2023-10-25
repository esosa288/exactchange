import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {

      Scanner scnr = new Scanner (System.in);

      char userLetter;

      String userWord;

      userLetter = scnr.next().charAt(0);

      userWord = scnr.nextLine();
      
      int wordCount = 0;

      for (int i = 0; i < userWord.length(); i++) {

         if (userWord.charAt(i) == userLetter){

            wordCount++;

         }}

      if (wordCount ==1) {

         System.out.println(wordCount + " " + userLetter);

      }

      else {

         System.out.println(wordCount + " " + userLetter + "'s");
   }
}
}
