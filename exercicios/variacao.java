import java.util.Scanner;

public class variacao {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        double x = sc.nextDouble();
        int y = (int) x;
        System.out.println("Double normal: "+ x);
        System.out.println("Convertido: "+ y);
sc.close();
    }
}
