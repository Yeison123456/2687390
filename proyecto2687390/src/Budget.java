import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double broad, length, area, budget;

        System.out.println("Ingrese el ancho");
        broad = lectura.nextDouble();

        System.out.println("Ingrese el largo");
        length = lectura.nextDouble();

        area = broad * length;

        budget = 45.000 * area;

        System.out.println("La superficie a cubrir tiene " + broad + " metros de ancho por " + length
                + " metros de largo, " + "con " + area +
                "  metros cuadrados. " + "El presupuesto del proyecto es " + budget);

        lectura.close();

    }
}
