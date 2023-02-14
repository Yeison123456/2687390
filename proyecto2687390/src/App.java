import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
            int numberOne, numberTwo, resultado;
        System.out.println("Ingrese el primer número");
            numberOne= lectura.nextInt();
        System.out.println("Ingrese el segundo número");
            numberTwo= lectura.nextInt();

            resultado = numberOne + numberTwo;

        System.out.println("La suma de los numeros es "+ resultado );

            lectura.nextLine(); //Limpieza de buffer//

        String name;
        System.out.println("Ingrese su nombre");
            name= lectura.nextLine();
        System.out.println("El nombre ingresado es "+ name);
        


        lectura.close(); 
    }
}
