import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    int num1, num2, sum;
    char c;

    System.out.print("Enter the first number: ");
    num1 = userInput.nextInt();

    System.out.print("Enter the second number: ");
    num2 = userInput.nextInt();

    System.out.println("\nWhat would you like to do?\nA to add\nS to subtract\nM to multiply\nD to divide\n");
    System.out.print("Enter choice: ");
    c = userInput.next().charAt(0);

    switch (c) {

    case 'A':
      sum = num1 + num2;
      System.out.println(num1 + " plus " + num2 + " is " + sum);
      break;

    case 'S':
      sum = num1 - num2;
      System.out.println(num1 + " minus " + num2 + " is " + sum);
      break;

    case 'M':
      sum = num1 * num2;
      System.out.println(num1 + " multiplied by " + num2 + " is " + sum);
      break;

    case 'D':
      if (num2 <= 0) {
        System.out.println("**Error** Cannot divide by zero.");
        break;
          
      } else {

        sum = num1 / num2;
        System.out.println(num1 + " divided by " + num2 + " is " + sum);
        break;

      }
    default:
      System.out.println("**Error** Invalid choice, please choose options: A/S/M/D only(Case sensitive).");

    }

  }

}
