import java.util.Scanner;

public class muliplication {
  
  public static int input(){
      Scanner num=new Scanner(System.in);
      System.out.println("enter the number:");
      int s=num.nextInt();
      return s;
    }


  public void mul(int number){
   System.out.println("the muliplication of the number is:");
   for (int i=0; i<=10 ;i++) {
         System.out.println(number+ " x " +i+ "=" +(number*i));

   }
  }
  public static void main(String[] args) {
    
   int userinput=input();
    muliplication obj =new muliplication();
   obj.mul(userinput); 
  }
}
