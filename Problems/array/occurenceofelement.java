package Problems.array;

import java.util.Scanner;

public class occurenceofelement {

public static int occurence(int[] num,int target)
{
  int count=0;
  
  for (int i : num) {
    if (i==target) {
      count+=1;
    }
    
  }

  return count;
}
  public static void main(String[] args) {
    int[] num=sumandaverage.inputarr();
    Scanner tar=new Scanner(System.in);
    System.out.println("enter the target element: ");
    int target=tar.nextInt();
    int occr=occurence(num, target);

    System.out.println("the " +5+ target+ " number occured " +occr+ " times");


  }
}
