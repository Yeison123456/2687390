package EstructurasDatos;

import java.util.Scanner;

public class ChallengeOne2 {
    public static void main(String[] args) {

        Scanner lectura=new Scanner(System.in);
        
        int cantidad;
        System.out.println("¿Cuantos competidores son?");
        cantidad=lectura.nextInt();
        String nombres [] = new String[cantidad+1];
        double tiempos [] = new double[cantidad];

        for(int p=0;p<nombres.length;p++){
            System.out.println("Digite el nombre del competidor "+p);
            nombres[p]=lectura.nextLine();
        }

        
        
        for(int p=0;p<tiempos.length;p++){
            System.out.println("Digite el tiempo que obtuvo el competidor "+ (p+1));
            tiempos[p]=lectura.nextDouble();
        }
        
        
        for (String i : nombres) {
            System.out.println(i + " ");
        } 

        for (double i : tiempos) {
            System.out.println(i + "  ");
        } 

        double menor;
        menor= tiempos [0];

        for (int p=0; p<tiempos.length; p++) {
            if(tiempos [p] < menor){
                    menor=tiempos[p];
                    
            }
        }

       System.out.println("El tiempo menor es de: " + menor);

       lectura.close();
        


    }
}
