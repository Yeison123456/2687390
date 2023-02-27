import java.util.Scanner;

public class ChallengerOne {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        double temperatureF, temperatureC;

        System.out.println("Ingrese la temperatura en Fahrenheit ");
        temperatureF = lectura.nextDouble();

        temperatureC = (temperatureF - 32) / 1.8;

        System.out.println("La temperatura en centigrados es " + temperatureC);

        lectura.close();
    }
}