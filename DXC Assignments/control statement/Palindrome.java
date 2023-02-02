package example;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int num,sum=0,temp,rem;
        System.out.println("Enter the number;");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(num!=0){
           rem=num%10;
           sum=(sum*10)+rem;
           num=num/10;
        }
        if(temp==sum){
        System.out.println(" "+temp+" is a Palindrome.");
        }
        else{
            System.out.println(" "+temp+" is not a Palindrome.");
            
    }
}
}
