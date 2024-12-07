import java.util.Scanner;


public class temperatureConverter {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("Hello welcome to Temperature Converter");
        Scanner input = new Scanner(System.in);

        // Takes user's input on what kind of conversion they'll be doing and stores it
        System.out.println("What would you like to do? ");
        System.out.println("1 - To change from Celsius to Fahrenheit");
        System.out.println("2 - To change from Fahrenheit to Celsius ");
        int conversionType = input.nextInt();

        // Takes the temperature the user want's to convert
        // The try and catch handles errors if a user instead of a number
        double temperature = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.println("What's the measure of the temperature you'd like to?");
            try {
                temperature = input.nextDouble();
                isValid = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please input a number");
                input.next();
            }

        }


        // These are the formulae for the conversion
        double fahrenheit = (temperature * 9 / 5) + 32;
        double celsius = (temperature - 32) * 5 / 9;


        // Checks which conversion type the user chose and prints its corresponding value
        if (conversionType == 1) {
            System.out.println(temperature + " is " + fahrenheit + "℉");
        } else if (conversionType == 2) {
            System.out.println(temperature + " is " + celsius + "℃");
        }
    }
}