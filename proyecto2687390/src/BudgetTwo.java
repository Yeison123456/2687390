import java.util.Scanner;

public class BudgetTwo {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int spent, budget, totals, op, contador;

        contador=0;
        op=1;
        budget=100000;
        while(op==1 && contador<=2){
        System.out.println("Ingrese el gasto");
        spent=lectura.nextInt();
        budget=budget-spent;
        System.out.println("El gasto fue de "+ spent +" y su presupuento es de "+budget);
        
        System.out.println("¿Desea registrar otro gasto? 1.Si 2.No");
        op=lectura.nextInt();
        contador=contador+1;
        if(contador>=3){
            System.out.println("supero los limites de los gastos");
        }

        

        }

        


        lectura.close();
    }
}
