import java.util.Scanner;

public class NumberTwo {
    public static void main(){
        int number;

        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingresa el numero");
        number = lectura.nextInt();

        if( number>0 ){
            System.out.println("El numero es positivo");
        }
        else if( number==0){
            System.out.println("El numero es neutro");
        }
        else {
            System.out.println("El numero es negativo");
        }


        lectura.close();
    }
}