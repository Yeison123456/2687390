import java.util.Scanner;

public class Average {
    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double nota1, nota2, nota3, asistencia, promedio;
        
        System.out.println("Ingrese la primera nota");
        nota1=lectura.nextDouble();
        System.out.println("Ingrese la segunda nota");
        nota2=lectura.nextDouble();
        System.out.println("Ingrese la tercera nota");
        nota3=lectura.nextDouble();
        System.out.println("Ingrese el porcentaje de asistencia");
        asistencia=lectura.nextDouble();
        

        promedio=(nota1+nota2+nota3)/3;

        if(promedio>=3.5 && asistencia>=70){
            System.out.println("Su promedio de notas fue de "+promedio+" por lo tanto, aprobaste :D" );
        }
        else{
            System.out.println("Su promedio de notas fue de "+promedio+"lo cual no supera el 3.5 para aprobar, por lo tanto, no aprobaste :(");
        }


        lectura.close();
    }
}
