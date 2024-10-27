import java.util.Scanner;

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

        float result = 1;

        if(option == 1) {
            result = Operacoes.soma(a,b);
        } else if(option == 2) {
            result = Operacoes.subtracao(a,b);
        } else if(option == 3) {
            result = Operacoes.multiplicacao(a, b);
        } else {
            result = Operacoes.divisao(a, b);
        }

        System.out.println(result);
    }
}
