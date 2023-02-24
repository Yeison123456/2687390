import java.util.Scanner;
 public class LoopPractice { public static void main(String[] args) { 
    Scanner lectura = new Scanner(System.in); 
    int contadorH, contadorM; 
    String genero; 
    contadorH = 0; contadorM = 0;
    for(int x=1; x<=10; x++){ 
        System.out.println(" Digita si eres hombre o mujer "); 
        genero = lectura.nextLine(); 
        if(genero.equalsIgnoreCase("Hombre")){ 
            contadorH = contadorH+1; }
        else if(genero.equalsIgnoreCase("Mujer")){
         contadorM = contadorM+1; } } 
         System.out.println(" Total de hombres en el grupo es " + contadorH); 
         System.out.println(" Total de mujeres en el grupo es " + contadorM); 
         lectura.close();
         } }