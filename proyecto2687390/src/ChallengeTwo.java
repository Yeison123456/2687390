import java.util.Scanner;

public class ChallengeTwo {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double amount, total, cash, returned;

        System.out.println("Ingrese la cantidad de objetos");
        amount = lectura.nextDouble();

        total = amount * 10000;
        
        
        System.out.println("El dinero total a pagar es de " + total);
        
        System.out.println("Ingrese la cantidad de dinero con el que vas a pagar");
        cash = lectura.nextDouble();
        
        returned = cash - total;

        System.out.println("El total a pagar es de " + total + "mil, se recibe " + cash + "mil y el cambio es de "
                + returned + "mil.");

        lectura.close();

    }
}
