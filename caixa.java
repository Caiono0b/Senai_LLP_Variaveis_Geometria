import java.util.Scanner;

public class caixa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a largura da caixa: ");
        double largura = leia.nextDouble();

        System.out.print("Digite a altura da caixa: ");
        double altura = leia.nextDouble();

        System.out.print("Digite a profundidade da caixa: ");
        double profundidade = leia.nextDouble();

        double areaTotal = 2 * (largura * altura + largura * profundidade + altura * profundidade);

        System.out.printf("Área total da caixa: %.2f\n", areaTotal);

        leia.close();
    }
}
