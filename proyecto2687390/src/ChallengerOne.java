import java.util.Scanner;

public class ChallengerOne {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        double temperaturaEnFahrenheit, temperaturaEnCentigrados;

        System.out.println("Ingrese la temperatura en Fahrenheit ");
        temperaturaEnFahrenheit = lectura.nextDouble();

        temperaturaEnCentigrados = (temperaturaEnFahrenheit - 32) / 1.8;

        System.out.println("La temperatura en centigrados es " + temperaturaEnCentigrados);

        lectura.close();
    }
}