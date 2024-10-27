import java.util.Scanner;
import Operacoes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo a calculadora");
        System.out.println("Que operação vc deseja realizar?\n1-add\n2-subtract\n3-multiply\n4-divide");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        
        System.out.println("Que numero vc quer usar primeiro?");
        int a = in.nextInt();
        
        System.out.println("Que numero vc quer usar segundo?");
        int b = in.nextInt();

        float result = 0;

        if(option == 1) {
            result = Operacoes.somar(a,b);
        } else if(option == 2) {
            result = Operacoes.subtrair(a,b);
        } else if(option == 3) {
            result = Operacoes.multiplicar(a,b);
        } else {
            result = Operacoes.dividir(a,b);
        }

        System.out.println(result);
    }
}
