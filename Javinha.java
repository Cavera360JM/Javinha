import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, insira seu e-mail:");
        String email = scanner.nextLine();
        
        if (isValidEmail(email)) {
            System.out.println("E-mail válido. Por favor, insira sua senha:");
            
            // Verifica se há uma próxima linha disponível antes de tentar lê-la
            if (scanner.hasNextLine()) {
                String senha = scanner.nextLine();
                
                if (isValidPassword(senha)) {
                    System.out.println("Senha válida. Acesso concedido!");
                } else {
                    System.out.println("Senha inválida. Acesso negado.");
                }
            } else {
                System.out.println("Nenhuma senha fornecida. Acesso negado.");
            }
        } else {
            System.out.println("E-mail inválido. Por favor, insira um e-mail válido.");
        }
        
        scanner.close();
    }
    
    public static boolean isValidEmail(String email) {
        // Lógica de validação de e-mail (pode ser uma expressão regular ou outra lógica)
        return email.contains("@");
    }
    
    public static boolean isValidPassword(String senha) {
        // Lógica de validação de senha (pode ser verificação de comprimento, caracteres especiais, etc.)
        return senha.length() >= 8;
    }
}

