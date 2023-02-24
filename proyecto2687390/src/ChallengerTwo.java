import java.util.Scanner;

public class RetoTwo {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double cantidad, total, efectivo, devueltas;

        System.out.println("Ingrese la cantidad de objetos");
        cantidad = lectura.nextDouble();

        total = cantidad * 10000;
        
        
        System.out.println("El dinero total a pagar es de " + total);
        
        System.out.println("Ingrese la cantidad de dinero con el que vas a pagar");
        efectivo = lectura.nextDouble();
        
        devueltas = efectivo - total;

        System.out.println("El total a pagar es de " + total + "mil, se recibe " + efectivo + "mil y el cambio es de "
                + devueltas + "mil.");

        lectura.close();

    }
}
