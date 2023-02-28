import java.util.Scanner;

public class ChallengerTwo {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double amount, totals, cash, returned;

        System.out.println("Ingrese la cantidad de objetos");
        amount = lectura.nextDouble();

        totals = amount * 10000;
        
        
        System.out.println("El dinero total a pagar es de " + totals);
        
        System.out.println("Ingrese la cantidad de dinero con el que vas a pagar");
        cash = lectura.nextDouble();
            while(cash<=totals){
                System.out.println("No te alcanza para pagar la compra, digita un precio mas alto o igual que "+ totals);
                System.out.println("¿Con cuanto dinero piensa pagar?");
                cash=lectura.nextInt();
             }
        
        returned = cash - totals;

        System.out.println("El total a pagar es de " + totals + "mil, se recibe " + cash + "mil y el cambio es de "
                + returned + "mil.");

        lectura.close();

    }
}
