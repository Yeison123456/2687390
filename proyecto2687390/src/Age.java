import java.util.Scanner;

public class Age {
public static void main(String[] args) {
    int age;

        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingresa la edad");
        age = lectura.nextInt();
        if( age>=18 ){
            System.out.println("Bienvenido siga");
        }
        else{
            System.out.println("Pa la casa!!!");
        }

        lectura.close();
}
}