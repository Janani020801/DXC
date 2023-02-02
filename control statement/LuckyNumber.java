package example;


import java.util.*;
public class LuckyNumber {

   public static void main(String[] args) {
       int n,digit=0,rem=0,sq=0,sum=0,rev=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number: ");
       n=sc.nextInt();
       int num=n;
       while(num!=0){
           rem=num%10;
           rev=rev*10+rem;
           num=num/10;
           digit++;
           
       }
       System.out.println(digit);
      
       for(int i=1;i<=digit;i++){
           rem=rev%10;
           rev=rev/10;
           if(i%2==0){
               sq= rem*rem;
              sum=sum+sq;
           }
       }
       if(sum%9==0){
      
           System.out.println("The number "+n+" is a lucky number.");
       }
       else
       {
            System.out.println("The number "+n+" is not lucky number.");
       }
  } 
}
