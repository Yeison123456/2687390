import java.util.Scanner;

public class BudgetTwo {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int spent, budget, totals, op, counter;

        counter=0;
        op=1;
        budget=100000;
        totals=0;
        while(op==1 && counter<=2){
        System.out.println("Ingrese el gasto");
        spent=lectura.nextInt();
        budget=budget-spent;
        totals=totals+spent;
        System.out.println("El gasto fue de "+ spent +" y su presupuento es de "+budget);
        
        System.out.println("¿Desea registrar otro gasto? 1.Si 2.No");
        op=lectura.nextInt();
        counter=counter+1;
        if(counter>=3){
            System.out.println("supero los limites de los gastos");
        }  

        }

        System.out.println("El total de sus gastos fue de "+ totals +" y el presupuesto que le queda es de "+budget);
        


        lectura.close();
    }
}
