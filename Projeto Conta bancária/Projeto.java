import java.util.Scanner; // Importa a classe Scanner, usada para receber dados do usuário

public class Projeto {
    public static void main(String[] args) {
        // Cria um Scanner para ler informações digitadas no console
        Scanner sc = new Scanner(System.in);

        // Define o saldo inicial da conta
        double salario = 2500;

        // Exibe os dados iniciais do cliente
        System.out.println("Dados iniciais do cliente:\n" +
                "\n" +
                "Nome: Jacqueline Oliveira\n" +
                "Tipo conta: Corrente\n" +
                "Saldo inicial: R$ 2500,00");

        // Variável responsável por armazenar a opção escolhida pelo usuário
        int i = 1;

        // Mantém o programa funcionando enquanto a opção escolhida não for 4
        while (i!=4) {

            // Exibe o menu de operações disponíveis
            System.out.println("Operações\n" +
                    "\n" +
                    "1- Consultar saldos\n" +
                    "2- Receber valor\n" +
                    "3- Transferir valor\n" +
                    "4- Sair:");

            // Recebe a opção escolhida pelo usuário
            i = sc.nextInt();;

            // Opção 1: consulta o saldo atual
            if (i == 1) {
                System.out.println(salario);


                // Opção 2: adiciona um valor ao saldo
            } else if (i == 2) {
                System.out.println("Qual seria o valor: ");

                // Recebe o valor que será adicionado
                double add = sc.nextDouble();

                // Soma o valor recebido ao saldo
                salario = add+salario;

                // Exibe o novo saldo
                System.out.println("Seu novo saldo é de: " + salario);

                // Opção 3: realiza uma transferência
            } else if (i == 3) {
                System.out.println("Qual seria o valor :");

                // Recebe o valor que será transferido
                double sub = sc.nextDouble();

                // Verifica se o usuário possui saldo suficiente
                if(sub>salario){
                    System.out.println("Nao é possivel realizar essa operacao");
                }
                else {
                    // Subtrai o valor transferido do saldo
                    salario=salario-sub;

                    // Exibe o novo saldo
                    System.out.println("Seu novo saldo é de: " + salario);

                }

                // Opção 4: encerra o programa
            } else if (i == 4) {
                System.out.println("Muito obrigado!");

            }

            // Verifica se a opção digitada não corresponde às opções esperadas
            else if(i!=4){
                System.out.println("Inválido");

            }

        }
    }
}