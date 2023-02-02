package example;
import java.util.*;
public class Rabbitnchicken {
    public static void main(String[] args) {
        int head,leg,r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Heads: ");
        head=sc.nextInt();
        System.out.println("Legs: ");
        leg=sc.nextInt();
        if(leg%2!=0 || head>leg || head==0 )
        {
            System.out.println("The Number of Chickens and Rabbits cannot be found.");
        }
        else{
        r=(leg+(-2*head))/2;
        c=head-r;
        System.out.println("Chickens = "+c);
        System.out.println("Rabbits = "+r);
        }
        
    } 
}
