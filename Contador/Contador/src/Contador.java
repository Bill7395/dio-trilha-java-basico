import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitação dos parâmetros
            System.out.println("Por favor, digite o primeiro número:");
            int parametro1 = scanner.nextInt();
            System.out.println("Por favor, digite o segundo número:");
            int parametro2 = scanner.nextInt();

            // Verificação dos parâmetros e execução do contador
            contar(parametro1, parametro2);

        } catch (ParametrosInvalidosException e) {
            // Captura e exibição da exceção customizada
            System.err.println(e.getMessage());
        } catch (Exception e) {
            // Captura e exibição de outras exceções
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            // Fechamento do Scanner
            scanner.close();
        }
    }

    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        // Verificação se o segundo parâmetro é maior que o primeiro
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Cálculo e impressão dos números incrementados
        int quantidade = parametro2 - parametro1;
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
