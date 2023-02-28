import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int numberOne,
        numberTwo,
        addition,
        subtraction,
        multiplication,
        operation;

        double root1, root2, power, division;

        System.out.println("Ingrese el primer numero");
        numberOne=lectura.nextInt();    
        System.out.println("Ingrese el segundo numero");
        numberTwo=lectura.nextInt();  
        System.out.println("Escoge la operacion que deseas: 1.Suma  2.Resta  3.Multiplicacion  4.Division   5.Potencia   6.Raiz cuadrada");
        operation=lectura.nextInt();



        switch(operation){
            case 1:
            addition= numberOne+numberTwo;
            System.out.println("La suma de los dos numero es " + addition);
            break;
            case 2:
            subtraction= numberOne-numberTwo;
            System.out.println("La resta entre los dos numero es " + subtraction);
            break;
            case 3:
            multiplication= numberOne*numberTwo;
            System.out.println("La multiplicacion entre los dos numero es " + multiplication);
            break;
            case 4:
            division= numberOne/numberTwo;
            System.out.println("La division entre los dos numero es " + division);
            break;
            case 5:
            power= Math.pow(numberOne, numberTwo);
            System.out.println("La potencia entre los dos numero es " + power);
            break;
            case 6:
            root1= Math.sqrt(numberOne);
            root2= Math.sqrt(numberTwo);
            System.out.println("La raiz cuadrada del primer numero es " + root1);
            System.out.println("La raiz cuadrada del segundo numero es " + root2);
            break;
            default:
            System.out.println("La opcion no es valida");
            break;
        }
        lectura.close();
        
    }
    
}
