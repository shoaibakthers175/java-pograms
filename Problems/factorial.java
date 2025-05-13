import java.util.Scanner;

public class factorial {

  public static int input() {
    Scanner num = new Scanner(System.in);
    System.out.println("enter the number:");
    int s = num.nextInt();
    return s;
  }

  public int fact(int number) {
    int i = 1;
    int result = 1;
    if (number == 0) {
      System.out.println("the factorail of" + number + "is :1");
      return 1;
    }

    while (i <= number) {
      result *= i;
      i++;
    }
    System.out.println("the factorail of " + number + " is: " + result);
    return result;

  }

  public static void main(String[] args) {

    int userinput = input();
    factorial obj = new factorial();
    obj.fact(userinput);
  }

}
