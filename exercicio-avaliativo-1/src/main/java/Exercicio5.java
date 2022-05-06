import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro valor da comparação");
        var valor1 = teclado.nextInt();
        System.out.println("Informe o segundo valor da comparção");
        var valor2 = teclado.nextInt();
        System.out.println("Informe o terceiro valor da comparação");
        var valor3 = teclado.nextInt();

        if (valor3 >= valor1 && valor3 <= valor2) {
            System.out.println(valor3 + " se encontra no intervalo entre " + valor1 + " e " + valor2);
        } else {
            System.out.println(valor3 + " não se encontra no intervalo entre " + valor1 + " e " + valor2);
        }
    }
}
