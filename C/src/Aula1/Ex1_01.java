package Aula1;

import java.util.Scanner;

public class Ex1_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            double n1 = sc.nextDouble();
            String op = sc.next();
            double n2 = sc.nextDouble();
            double result = 0;
            switch (op){
                case "+":
                    result = n1 + n2;
                    break;
                case "-":
                    result = n1 - n2;
                    break;
                case "*":
                    result = n1 * n2;
                    break;
                case "/":
                    result = n1 / n2;
                    break;    
            }
            System.out.printf("%f %s %f = %f\n",n1,op,n2,result);
        }else{
            System.exit(0);
        }
    }
}
