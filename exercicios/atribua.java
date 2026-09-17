import java.util.Scanner;
public class atribua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O que vc deseja 1. Calcular área do quadrado e 2. Calcular área do círculo");
    int calculo = sc.nextInt();
        System.out.println("Indique o valor da área: ");
      double calculo1 = sc.nextDouble();
    if(calculo == 1){

        System.out.println("A área do quadrado é: "+ calculo1*calculo1);
    }
else if (calculo ==2){
        System.out.println("A área do círculo é "+(calculo1*calculo1)*3.14 );

    }
else{
        System.out.println("Deu errado");
    }

    }




}
