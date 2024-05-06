import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro parametro: ");
            int parametroUm = terminal.nextInt();
            System.out.print("Digite o segundo parametro: ");
            int parametroDois = terminal.nextInt();
            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e) {
                System.out.println("O SEGUNDO NUMERO DEVE SER MAIOR QUE O PRIMEIRO ");
            }
        } catch (Exception e) {
            System.out.println("DIGITE NUMEROS INTEIROS");
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        for (int i= parametroUm ; i <= parametroDois; i++) {

            System.out.print(" " + i);
        }
    }

}
