import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = sc.nextInt();
        if(numero%2==0){
            System.out.println("Ele é par");
        }
        else{
            System.out.println("Ele é ímpar");
        }
        }
    }