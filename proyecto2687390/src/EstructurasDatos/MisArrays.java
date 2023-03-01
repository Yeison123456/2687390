package EstructurasDatos;

import java.util.Scanner;

public class MisArrays {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        //Declaración e inicializacion de un array
        int [] vector1;
        vector1=new int[10];
        // en una sola linea int[] vector1=new int[10];
        //Rellenar vector
        int[] vector={30,50,25,85,12,6,32,41,23,63};//crea un nuevo vector
        vector[6]=32; //Posicion por posición

         /*for(int p=0; p<vector.length;p++){
            System.out.print(vector[p]+"  ");
        }*/
        //Mostrar datos de array con for mejorado
        for (int i : vector) {
            System.out.println(i);            
        }

        //Rellear de forma dinamica
        for(int p=0;p<vector1.length;p++){
            System.out.println("Digite el dato de la posición "+p);
            vector1[p]=lectura.nextInt();
        }

        for (int i : vector1) {
            System.out.println(i);
        }
            lectura.close();
    }
}
