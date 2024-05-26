package controlesimplessaque;

import java.util.Scanner;

public class ControleSimplesDeSaque{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o seu limite de saque: ");

        double limitedesaque = scanner.nextDouble();
        
        for (int i = 1; ; i++){

            System.out.println("digite o valor do saque: ");
            
            double valorsaque = scanner.nextDouble();
        
            if (valorsaque <= limitedesaque && valorsaque > 0){

                limitedesaque -= valorsaque;

                System.out.println("Saque realizado. Limite restante: " + limitedesaque);
                
            }else if (valorsaque >= limitedesaque || limitedesaque == 0){

                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            } else {

                System.out.println("Transacoes encerradas.");
                break;
            } 
        }
        scanner.close();
    }
}