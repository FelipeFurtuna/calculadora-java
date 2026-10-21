import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          int opcao = 1;
          do {
              mostrarMenu();
              opcao = sc.nextInt();
              if (opcao == 0) {
                  System.out.println("Encerrando a calculadora obrigado por utilizar...");
                  System.out.println("finalizado!");
                  break;
              }  else if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {
                  System.out.println("⚠\uFE0FOPÇÃO INVALIDA INSIRA NOVAMENTE ⚠\uFE0F");
                  continue;
              }

               double primeiro = lerNumero(sc, "Digite o primeiro numero: ");//metodo pra ler numeros

               double segundo = lerNumero(sc, "Digite o segundo numero: "); // metodo pra ler numeros

              if (opcao == 1) {
                  double resultado = somar(primeiro, segundo);
                  System.out.println(resultado);
              } else if (opcao == 2) {
                  double resultado = subtrair(primeiro, segundo);
                  System.out.println(resultado);
              } else if (opcao == 3) {
                  double resultado = multiplicar(primeiro, segundo);
                  System.out.println(resultado);
              } else if (opcao == 4) {
                  //if dentro da opcao dividir nao confundir com os outros ifs de escolha de opcao
                  if (segundo == 0) {
                      System.out.println("⚠\uFE0F Não é possivel dividir! ⚠\uFE0F ");
                      System.out.println("TENTE NOVAMENTE SUA OPERAÇÂO");
                      System.out.println("-----------------------------");
                      //fim do if
                  } else {
                      double resultado = dividir(primeiro, segundo);
                      System.out.println(resultado);
                  }
              }
          }   while (opcao !=0);
    }

    public static void mostrarMenu() {
            System.out.println("=== MINHA CALCULADORA ===");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
    }

    public static double somar(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        return resultado;
    }
    public static double subtrair(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        return resultado;
    }
    public static double multiplicar (double numero1, double numero2) {
        double resultado = numero1 * numero2;
        return resultado;
    }
    public static double dividir (double numero1, double numero2) {
        double resultado = numero1 / numero2;

        return resultado;
    }
    public static double lerNumero (Scanner sc, String texto) {
        System.out.println(texto);
        double numerolido = sc.nextDouble();
        return numerolido;

    }

}
