package Assessment3;

import java.util.*;
public class Movespl_char3 {


   public static void main(String args[]) {
      String input;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String: ");
      input=sc.nextLine();
      String regex = "[^a-zA-Z0-9]";
      String spec = "";
      String data = "";
      for(int i=0; i< input.length(); i++) {
         char ch = input.charAt(i);
         if(String.valueOf(ch).matches(regex)) {
            spec = spec + ch;
         } else {
            data = data + ch;
         }
      }
      System.out.println("After the moveSpecialCharacter: "+data+spec);
   }
}

