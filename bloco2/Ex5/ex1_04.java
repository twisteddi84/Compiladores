package bloco2.Ex5;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ex1_04 {
    public static void main(String[] args) throws FileNotFoundException {
        //myListener mylistener = new myListener();
        HashMap<Integer, String> definicoes = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Write the list of numbers: ");
        String[] numbers = sc.nextLine().split(" ");
        System.out.print("List of numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            String[] numeros_split = numbers[i].split("-");
            for (int j = 0; j < numeros_split.length; j++) {
                if (definicoes.containsKey(Integer.parseInt(numeros_split[j])))
                    System.out.print(definicoes.get(Integer.parseInt(numeros_split[j])) + " ");
                else
                    System.out.print(numeros_split[j] + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
