import java.util.Scanner;

public class Number {
public static void main(String[] args) {
    int numberOne, numberTwo, addition, subtraction;

        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingresa el primer numero");
        numberOne = lectura.nextInt();

        System.out.println("Ingresa el segundo numero");
        numberTwo = lectura.nextInt();

 


        if( numberOne>numberTwo ){
            addition= numberOne + numberTwo;
            System.out.println("El numero mayos es " + numberOne + "y el numero nemor es " + numberTwo +",la resta entre estos dos numero es " + addition);
        }
        else{
            subtraction= numberOne - numberTwo;
            System.out.println("El numero mayos es " + numberTwo + "y el numero nemor es " + numberOne +",la resta entre estos dos numero es " + subtraction);
        }

        lectura.close();
    }
}
       
