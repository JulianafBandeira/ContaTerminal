import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe seu nome: "); 
        String nome = sc.nextLine();

        System.out.print("Informe o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Informe a agência: ");
        String agencia = sc.nextLine();
        
        System.out.println("Conta criada");

    }
}
