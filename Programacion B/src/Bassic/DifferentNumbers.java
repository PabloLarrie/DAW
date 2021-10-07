package Bassic;
import java.util.*;

public class DifferentNumbers {
/*   Write a Java functifinal_liston that takes a sequence of numbers and
     determines whether all the numbers are different from each other.*/

    public static void main (String[] args){

        Scanner scc = new Scanner(System.in);
        System.out.println("Porfavol, intlodusca el índice de la tabla: ");
        int indice = scc.nextInt();
        List<Integer> arrayed = new ArrayList<>();

        for (int i = 0; i < indice; i++){
            System.out.println("Porfavol, intlodusca el valor de la tabla " + (i + 1) + "/" + indice + ": ");
            arrayed.add(scc.nextInt());
        }

        System.out.println(arrayed);


        Set<Integer> setedList = Set.copyOf(arrayed);
        System.out.println(setedList);
        if (arrayed.size() > setedList.size()){
            System.out.println("Su lista contiene elementos repetidos.");
        }else {
            System.out.println("Su lista no contiene elementos repetidos.");

        }

    }

}
