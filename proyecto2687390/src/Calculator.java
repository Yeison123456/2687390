import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int numberOne,
        numberTwo,
        suma,
        resta,
        multiplicacion,
        operacion;

        double raiz1, raiz2, potencia, division;

        System.out.println("Ingrese el primer numero");
        numberOne=lectura.nextInt();    
        System.out.println("Ingrese el segundo numero");
        numberTwo=lectura.nextInt();  
        System.out.println("Escoge la operacion que deseas: 1.Suma  2.Resta  3.Multiplicacion  4.Division   5.Potencia   6.Raiz cuadrada");
        operacion=lectura.nextInt();



        switch(operacion){
            case 1:
            suma= numberOne+numberTwo;
            System.out.println("La suma de los dos numero es " + suma);
            break;
            case 2:
            resta= numberOne-numberTwo;
            System.out.println("La resta entre los dos numero es " + resta);
            break;
            case 3:
            multiplicacion= numberOne*numberTwo;
            System.out.println("La multiplicacion entre los dos numero es " + multiplicacion);
            break;
            case 4:
            division= numberOne/numberTwo;
            System.out.println("La division entre los dos numero es " + division);
            break;
            case 5:
            potencia= Math.pow(numberOne, numberTwo);
            System.out.println("La potencia entre los dos numero es " + potencia);
            break;
            case 6:
            raiz1= Math.sqrt(numberOne);
            raiz2= Math.sqrt(numberTwo);
            System.out.println("La raiz cuadrada del primer numero es " + raiz1);
            System.out.println("La raiz cuadrada del segundo numero es " + raiz2);
            break;
            default:
            System.out.println("La opcion no es valida");
            break;
        }
        lectura.close();
        
    }
    
}
