import java.util.Scanner;

public class Media {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double x = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double y = sc.nextDouble();

double media = (x+y)/2;
        System.out.println("Sua nota será: "+ media);
sc.close();
    }
}
