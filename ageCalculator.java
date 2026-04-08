import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ageCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter birth year(yyyy):");
        int year = sc.nextInt();

        System.out.println("Enter birth month(mm):");
        int month = sc.nextInt();

        System.out.println("Enter birth day(dd):");
        int day = sc.nextInt();

        //creating a localdate object for birth date
        LocalDate birthDate= LocalDate.of(year , month , day);

        //getting the current date
        LocalDate currenDate= LocalDate.now();

        //calculating age
        Period age = Period.between(birthDate , currenDate);

        //display age   
        System.out.println("your age is: " + age.getYears() +" "+ "years," + age.getMonths() +" "+ "months, and"+" " + age.getDays() +" "+ "days.");
        

        sc.close();
    }

}