import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        mostrarMenu();
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        if (opcao == 1) {
            System.out.println("Digite o primeiro numero: ");
            int primeiro = sc.nextInt();
            System.out.println("Digite o segundo numero: ");
            int segundo = sc.nextInt();
            int resultado = somar(primeiro, segundo);
            System.out.println(resultado);
        } else if (opcao == 2) {
            System.out.println("Digite o primeiro numero: ");
            int primeiro = sc.nextInt();
            System.out.println("Digite o segundo numero: ");
            int segundo = sc.nextInt();
            int resultado = subtrair(primeiro, segundo);
            System.out.println(resultado);
        }
    }

    public static void mostrarMenu() {
        System.out.println("=== MINHA CALCULADORA ===");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Sair");
    }

    public static int somar(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        return resultado;
    }
    public static int subtrair(int numero1, int numero2) {
        int resultado = numero1 - numero2;
        return resultado;
    }
}
