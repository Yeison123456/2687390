import java.util.Scanner;
 public class LoopPractice { public static void main(String[] args) { 
    Scanner lectura = new Scanner(System.in); 
    int counterH, counterM; 
    String gender; 
    counterH = 0; counterM = 0;
    for(int x=1; x<=10; x++){ 
        System.out.println(" Digita si eres hombre o mujer "); 
        gender = lectura.nextLine(); 
        if(gender.equalsIgnoreCase("Hombre")){ 
            counterH = counterH+1; }
        else if(gender.equalsIgnoreCase("Mujer")){
         counterM = counterM+1; } } 
         System.out.println(" Total de hombres en el grupo es " + counterH); 
         System.out.println(" Total de mujeres en el grupo es " + counterM); 
         lectura.close();
         } }