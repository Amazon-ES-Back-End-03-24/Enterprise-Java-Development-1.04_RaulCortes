import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        //------------------------TAREA 1--------------------------------------------
        int a = 12;
        int b = 6;
        int c = 2;
        int d = 10;

        int[] notas = {a,b,c,d};


        int mayor = getMayor(notas);
         System.out.println("El número mayor es el " + mayor);

        int menor = getMenor(notas);
        System.out.println("El número menor es el " + menor);

        System.out.println("La diferencia entre los dos números es " + (mayor-menor));

        //------------------------------TAREA 2-------------------------------------

        Arrays.sort(notas);
        System.out.println(Arrays.toString(notas));
        System.out.println(notas[1]);






        //-----------------------------TAREA 3---------------------------------------

        int variable1 = 5;
       int variable2 = 10;

         int resultado = (variable1 * variable1) + (((variable2 * 4) /5 - variable1) * ((variable2 * 4) /5 - variable1));

       System.out.println(resultado);




    }

    private static int getMayor(int[] notas) {
        int mayor = notas[0];

        for (int i = 1; i < notas.length; i++){
            if (notas[i] > mayor){
                mayor = notas[i];
            }
        }
        return mayor;
    }

    private static int getMenor(int[] notas) {
        int menor = notas[0];

        for (int i = 1; i < notas.length; i++){
            if (notas[i] < menor){
                menor = notas[i];
            }
        }
        return menor;
    }

}