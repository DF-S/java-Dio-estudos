import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao auto-atendimento bank-bank");
        System.out.println("");
        
        // Criando um objeto CadastroCliente
        CadastroCliente cadastro = new CadastroCliente();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite quanto deseja depositar:");
        double saldo = scanner.nextDouble();

        // Atribuindo os valores aos atributos do objeto cadastro
        cadastro.setNome(nome);
        cadastro.setAgencia(agencia);
        cadastro.setNumero(numero);

        cadastro.setSaldo(saldo);

        System.out.println("Dados do Cliente:");
        cadastro.imprimirDadosCliente();
    }
}
