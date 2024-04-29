import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int Numero;
        String Agencia;
        String Cliente;
        double Saldo;


        System.out.println("Olá, qual o seu nome? ");
        Cliente = scanner.next();
        System.out.println("Qual sua agência? ");
        Agencia = scanner.next();
        System.out.println("Qual seu número? ");
        Numero = scanner.nextInt();
        System.out.println("Qual sua saldo? ");
        Saldo = scanner.nextDouble();
        

        System.out.println("Olá " + Cliente + " , obrigado por criar uma conta em nosso banco, sua agência é "+ Agencia + " , conta " + Numero + " E seu saldo " + Saldo + " Já esta disponível para saque");
        
        
        
        

    }
}
