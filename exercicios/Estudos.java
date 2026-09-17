import java.util.Scanner;

public class Estudos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da tabuada: ");
        int tabuada = sc.nextInt();
        int contador = 1;
        while(contador<11){
            System.out.println("Tabuada do "+tabuada+":"+tabuada+"X"+contador+"="+ tabuada*contador);
            contador++;
        }

    }

}