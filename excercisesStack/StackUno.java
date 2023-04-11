package Stack.excercisesStack;


import java.util.Scanner;
import java.util.Stack;

public class StackUno {

    public static void main(String[] args) {

        Stack<Integer> pilaUno = new Stack<>();
        Stack<Integer> pilaDos = new Stack<>();
        Stack<Integer> pilaTres = new Stack<>();


        Scanner mete = new Scanner(System.in);
        System.out.println("introduce el tamano que quieras en la pilaUno y pilaDos");
        int cantidadPila = mete.nextInt();
        System.out.println("Esta es Pila 1");
        for (int i = 1; i <= cantidadPila; i++) {
            System.out.println("Introduce el valor " + i);
            int numero = mete.nextInt();
            pilaUno.push(numero);
        }

        System.out.println("Esta es Pila 2");

        for (int i = 1; i <= cantidadPila; i++) {
            System.out.println("Introduce el valor " + i);
            int numero = mete.nextInt();
            pilaDos.push(numero);
        }



        for (int i = 1; i <= cantidadPila; i++) {
            int datoUno = pilaUno.peek();
            int datoDos = pilaDos.peek();
            int datoTres = datoUno + datoDos;
            pilaTres.push(datoTres);
            pilaUno.pop();
            pilaDos.pop();
        }
        System.out.println("\nPila 3");
        for (int i = 0; i < pilaTres.size(); i++) {
            System.out.println(pilaTres.get(i));

        }







    }
}