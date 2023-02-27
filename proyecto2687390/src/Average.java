import java.util.Scanner;

public class Average {
    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double note1, note2, note3, attendance, average;
        
        System.out.println("Ingrese la primera nota");
        note1=lectura.nextDouble();
        System.out.println("Ingrese la segunda nota");
        note2=lectura.nextDouble();
        System.out.println("Ingrese la tercera nota");
        note3=lectura.nextDouble();
        System.out.println("Ingrese el porcentaje de asistencia");
        attendance=lectura.nextDouble();
        

        average=(note1+note2+note3)/3;

        if(average>=3.5 && attendance>=70){
            System.out.println("Su promedio de notas fue de "+average+" por lo tanto, aprobaste :D" );
        }
        else{
            System.out.println("Su promedio de notas fue de "+average+"lo cual no supera el 3.5 para aprobar, por lo tanto, no aprobaste :(");
        }


        lectura.close();
    }
}
