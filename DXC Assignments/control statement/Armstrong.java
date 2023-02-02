package example;
import java.util.*;
public class Armstrong {


    public static void main(String[] args) {
        int num,sum=0,count=0,temp,rem=0;
        System.out.println("Enter the number;");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        temp=num;
        while(temp>0){
           rem=temp%10;
           sum=sum+(int)Math.pow(rem,count);
           temp=temp/10;
        }
        if(num==sum){
        System.out.println(" "+num+" is a Armstrong number.");
        }
        else{
            System.out.println(" "+num+" is not a Armstrong Number.");
            
    }
}
}

