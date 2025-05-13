import java.util.Scanner;

public class sumOfOddNo {
  
public static int input(){
      Scanner num=new Scanner(System.in);
      System.out.println("enter the number upto which you want sum of odd number:");
      int s=num.nextInt();
      return s;
    }


public static void sumodd(int number)
{
  int sum=0;
  for(int i=0;i<=number;i++)
  {
    if(i%2!=0)
    {
      sum+=i;
    }
  }
  System.out.println("the sum of odd number is :"+sum);
}



public static void main(String[] args) {
    
   int userinput=input();
    sumOfOddNo obj =new sumOfOddNo();
   obj.sumodd(userinput); 
  }












}
