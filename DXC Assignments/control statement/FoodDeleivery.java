package example;
import java.util.*;
public class FoodDeleivery {

  public static void main(String[] args) {
  char type;
  int dist,quantity,total=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Character: ");
  
  
  type=sc.next().charAt(0);
  
  System.out.println("Enter the Quantity: ");
  quantity=sc.nextInt();
  System.out.println("Enter the Distance: ");
  dist=sc.nextInt();
  
 if((type=='N' || type=='V') && quantity>=1 && dist>0){
     if(type=='V'){
         if(dist<=3){
        total=12*quantity+0; 
        System.out.println(total);
         }
         else if(dist>3 && dist<=6){
             total=((12*quantity)+((dist-1)*1)+1);
              System.out.println(total);
             
         }
         else{
             total=((12*quantity)+((dist-6)*2)+3);
              System.out.println(total);
         }
     }
     else if(type=='N'){
         if(dist<=3){
        total=15*quantity+0; 
        System.out.println(total);
         }
         else if(dist>3 && dist<=6){
             total=((15*quantity)+((dist-1)*1)+1);
              System.out.println(total);
             
         }
         else{
             total=((15*quantity)+((dist-6)*2)+3);
              System.out.println(total);
         }
         
     }
     else{
         System.out.println("-1");
     }
 }
  }
}
