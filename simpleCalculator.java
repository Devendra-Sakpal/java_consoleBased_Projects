//Simple Calculator project  

import java.util.Scanner;

public class simpleCalculator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean continueCalculation=true;

        while(continueCalculation){  //used to allow the user to perform multiple calculations
        System.out.println("Calculator");
        System.out.println("Select a operation:");
        System.out.println("1.Addition(+)");
        System.out.println("2.Substraction(-)");
        System.out.println("3.Multiplicatin(*)");
        System.out.println("4.Division(/)");
        System.out.println("5.reset");
        System.out.println("6.exit");
        System.out.println(" enter your choice 1-6");
        int choice = sc.nextInt();

         //exit
         if(choice==6){
            System.out.println("thank you for using the calculator");
            break;   
        }
        //reset
        if(choice==5){
            System.out.println("calculator reset. Start Over.....");
            continue;
        }

        // Check for valid operation choice
        if (choice < 1 || choice > 4) {
            System.out.println("Invalid choice. Please select a valid operation.");
            continue; // Skip to the next input of the loop
        }
        //for this
        System.out.println("enter first number");
        double num1=sc.nextDouble();

        System.out.println("enter second number");
        double num2=sc.nextDouble();


        double result=0; //output are stored
        
        switch (choice) {
            case 1:
                result= num1 + num2;
                System.out.println("Addition:"+" "+ result);
                System.out.println("-------------END-------------");
                System.out.println(" ");
                break;
            case 2:
                result= num1 - num2;
                System.out.println("Substraction:"+ " "+ result);
                System.out.println("-------------END-------------");
                System.out.println(" ");

                break;
            case 3:
                result = num1 * num2;
                System.err.println("Multiplication:"+ " "+ result);
                System.out.println("-------------END-------------");
                System.out.println(" ");

                break;
            case 4:
                if(num2!=0){
                    result= num1 / num2;
                    System.out.println("result:"+" "+ result);
                    System.out.println("-------------END-------------");
                    System.out.println(" ");
                    
                }else{
                    System.out.println("Error:unExceptedInput Zero");
                }
                
                break;
        
            }
        }

    }
}