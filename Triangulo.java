import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        double base = leia.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = leia.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("Área do triângulo: " + area);

        leia.close();
    }
}
