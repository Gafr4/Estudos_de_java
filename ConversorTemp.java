import java.util.Scanner;

public class ConversorTemp {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = temp.nextDouble();
        
        double celsius = (fahrenheit - 32) * 5/9;

        System.out.println("Sua temperatura em °C: " + celsius + "°C");

        temp.close();
    }
}