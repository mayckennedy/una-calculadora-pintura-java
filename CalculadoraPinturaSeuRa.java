import java.util.Scanner;

public class CalculadoraPinturaSeuRa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Digite a medida do lado (quarto");

        double medida = sc.nextDouble();
        double rendimento_litro = 10.0;

        double totalparedes = medida * 2.70 * 4 * 0.9;
        double teto = medida * medida;

        System.out.println("O total em metros quadrados para pintura são:" + totalparedes);
        System.out.println("Pintura a parte do teto:" + teto );

        double tintaparedes = totalparedes / rendimento_litro;
        double tintateto = teto / rendimento_litro;

        System.out.println("O total de tinta para a pintura das paredes são de_:" + tintaparedes + "___litros");
        System.out.println("O total de tinta para os tetos são de_:" + tintateto + "___litros");

        sc.close();

      
      
    }

}