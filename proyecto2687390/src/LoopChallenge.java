import java.util.Scanner;

public class LoopChallenge {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        double note, accumulator, average;

        accumulator=0;
        for(int x=1; x<=4; x++){
            System.out.println("Digite las notas obtenidas de los talleres de 1.0 a 5.0");
            note=lectura.nextDouble();

            accumulator=accumulator+note;
        }

        average=accumulator/4;

        if(average<=2.9){ 
            System.out.println("Reprobaste la asignatura con un promedio de "+average);
        } 
        else if(average>=3.0 && average<=4.0){
            System.out.println("Pasaste raspando la materia con un promedio de "+average);
        } 
        else{
            System.out.println("Aprobaste con buenos resultados con un promedio de "+average);
        }
        lectura.close();
    }
}
