import java.util.Scanner;

public class temparetureConverter{


    public static double celsiusToFahrenheit(double celsius){
        return(celsius * 9/ 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return(fahrenheit - 32)* 5 / 9;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input the temperature you like to convert? (eg., 45F,102C etc..)");
        String temp = sc.nextLine();


        double degree = Double.parseDouble(temp.substring(0, temp.length()-1));
        char scale = temp.charAt(temp.length()-1);


        if(scale == 'C'|| scale == 'c'){
            double result = celsiusToFahrenheit(degree);
            System.out.printf("The Temperature in Fahrenheit is %.2f degrees.%n", result);

        }else if (scale =='F' || scale =='f') {
            double result = fahrenheitToCelsius(degree);
            System.out.printf("The Temperature in celsius is %.2f degrees.%n", result);
            
        }else{
            System.out.println("input proper conversion.");
        }
    }
}