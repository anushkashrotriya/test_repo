package assignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		 int a , b ,c=0;
		      int choice;
		      Scanner x = new Scanner(System.in);
		      
		      
		      
		      while(true)
		      {
		         System.out.println("1. Addition ");
		         System.out.println("2. Subtraction");
		         System.out.println("3. Multiplication");
		         System.out.println("4. Division");
		         System.out.println("5. Exit");
		         System.out.print("Enter Your Choice (1-5): ");
		         choice = x.nextInt();
		         
		         switch(choice)
		         {
		            case 1:
		               System.out.print("\nEnter any Two Number: ");
		               a = x.nextInt();
		               b = x.nextInt();
		               c = a+b;
		               break;
		            case 2:
		               System.out.print("\nEnter any Two Number: ");
		               a = x.nextInt();
		               b = x.nextInt();
		               c = a-b;
		               break;
		            case 3:
		               System.out.print("\nEnter any Two Number: ");
		               a = x.nextInt();
		               b = x.nextInt();
		               c = a*b;
		               break;
		            case 4:
		               System.out.print("\nEnter any Two Number: ");
		               a = x.nextInt();
		               b = x.nextInt();
		               c = a/b;
		               break;
		            case 5:
		               return;
		            default:
		               System.out.println("\nInvalid choice!");
		               break;
		         }
		         System.out.println("\nResult = " +c+ "\n");
		      }
		   }


		
	}


