import java.util.Scanner;

public class LoopChallenge {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        double nota, acumulador, promedio;

        acumulador=0;
        for(int x=1; x<=4; x++){
            System.out.println("Digite las notas obtenidas de los talleres de 1.0 a 5.0");
            nota=lectura.nextDouble();

            acumulador=acumulador+nota;
        }

        promedio=acumulador/4;

        if(promedio<=2.9){ 
            System.out.println("Reprobaste la asignatura con un promedio de "+promedio);
        } 
        else if(promedio>=3.0 && promedio<=4.0){
            System.out.println("Pasaste raspando la materia con un promedio de "+promedio);
        } 
        else{
            System.out.println("Aprobaste con buenos resultados con un promedio de "+promedio);
        }
        lectura.close();
    }
}
