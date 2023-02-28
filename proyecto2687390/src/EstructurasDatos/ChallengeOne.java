package EstructurasDatos;

import java.util.Scanner;

public class ChallengeOne {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);

        double suma, promedio;
        int cantidad;
        System.out.println("Cuantas notas son?");
        cantidad=lectura.nextInt();
        double notas [] = new double[cantidad];

        
        suma=0;

         for(int p=0;p<notas.length;p++){
            System.out.println("Digite la primera nota "+p);
            notas[p]=lectura.nextDouble();
            suma=suma+notas[p];
        }
        for (double i : notas) {
            System.out.println(i);
        } 
        
        promedio=suma/cantidad;

        if(promedio<30){
            System.out.println("Reprobaste con un promedio de "+promedio);
        }
        else if(promedio<=40 || promedio>=30){
            System.out.println("Pasaste raspando con un promedio de "+promedio);
        }
        else{
            System.out.println("Aprobaste con buenos resultados");
        }
        
    }
}
