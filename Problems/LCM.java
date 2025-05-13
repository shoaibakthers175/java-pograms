import java.util.Scanner;

public class LCM {
  public static int input(){
      Scanner num=new Scanner(System.in);
      System.out.println("enter the number:");
      int s=num.nextInt();
      return s;
    }


  public static int gcd(int a,int b)
  {
    if(b==0){
      return a;
    }
    return gcd(b,a%b);
  }
  


public static int lcm(int a,int b){
  return (a*b)/gcd(a,b);
}
 public static void main(String[] args) {
   int num1=input();
   int num2=input();
   
   int result=lcm(num1, num2);

   System.out.println("LCM of " + num1 + " and " + num2 + " is: " + result);
 }



}