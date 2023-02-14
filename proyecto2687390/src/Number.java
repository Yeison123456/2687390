import java.util.Scanner;

public class Number {
public static void main(String[] args) {
    int numberOne, numberTwo, suma, resta;

        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingresa el primer numero");
        numberOne = lectura.nextInt();

        System.out.println("Ingresa el segundo numero");
        numberTwo = lectura.nextInt();

 


        if( numberOne>numberTwo ){
            suma= numberOne + numberTwo;
            System.out.println("El numero mayos es " + numberOne + "y el numero nemor es " + numberTwo +",la resta entre estos dos numero es " + suma);
        }
        else{
            resta= numberOne - numberTwo;
            System.out.println("El numero mayos es " + numberTwo + "y el numero nemor es " + numberOne +",la resta entre estos dos numero es " + resta);
        }

        lectura.close();
    }
}
       
