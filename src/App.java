import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int mulher;
        int homem;
        int usuario;
        double altura;
        double pesoideal;
        Scanner input = new Scanner(System.in);
        System.out.println("Responda com 1 ou 2: \n 1- homem \n 2- mulher \n");
        usuario = input.nextInt();
        homem = 1;
        mulher = 2;
        System.out.println("Digite a sua altura:");
        altura = input.nextDouble();
        if (usuario == homem) {
            pesoideal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é de: " + pesoideal + "kg");

        } else if (usuario == mulher) {

            pesoideal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é de: " + pesoideal + "kg");

        }

    }
}
