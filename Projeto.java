import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        System.out.println("-=-".repeat(50));

        System.out.println("   ____  _                    _         _                            _           _                                        \n" +
                "  / __ \\| |                  (_)       | |                          (_)         | |                                       \n" +
                " | |  | | | __ _     ___  ___ _  __ _  | |__   ___ _ __ ___   __   ___ _ __   __| | ___     __ _                          \n" +
                " | |  | | |/ _` |   / __|/ _ \\ |/ _` | | '_ \\ / _ \\ '_ ` _ \\  \\ \\ / / | '_ \\ / _` |/ _ \\   / _` |                         \n" +
                " | |__| | | (_| |_  \\__ \\  __/ | (_| | | |_) |  __/ | | | | |  \\ V /| | | | | (_| | (_) | | (_| |                         \n" +
                "  \\____/|_|___,_( ) |___/____| |\\__,_| |_.__/ \\___|_| __| |_|   \\_/ |_|_| |_|\\__,_|\\___/   \\__,______ _ _                 \n" +
                "  | |     (_)   |/      | | _/ | | |                 | |                            | |        / ____(_) |                \n" +
                "  | | ___  _  __ _    __| ||___  | |__   __ _ _ __ __| |_      ____ _ _ __ ___    __| | ___   | |  __ _| |___  ___  _ __  \n" +
                "  | |/ _ \\| |/ _` |  / _` |/ _ \\ | '_ \\ / _` | '__/ _` \\ \\ /\\ / / _` | '__/ _ \\  / _` |/ _ \\  | | |_ | | / __|/ _ \\| '_ \\ \n" +
                "  | | (_) | | (_| | | (_| |  __/ | | | | (_| | | | (_| |\\ V  V / (_| | | |  __/ | (_| | (_) | | |__| | | \\__ \\ (_) | | | |\n" +
                "  |_|\\___/| |\\__,_|  \\__,_|\\___| |_| |_|\\__,_|_|  \\__,_| \\_/\\_/ \\__,_|_|  \\___|  \\__,_|\\___/   \\_____|_|_|___/\\___/|_| |_|\n" +
                "         _/ |                                                                                                             \n" +
                "        |__/                                                                                                              \n" +
                "\n");
        System.out.println("-=-".repeat(50));

        Scanner input = new Scanner(System.in);
        String continuar = "s";
        double totalCompra = 0.0;

        System.out.println("Vamos efetuar o seu cadastro para continuarmos! Preencha as informações abaixo: ");
        System.out.print("Qual seu nome? ");
        String nome = input.nextLine();
        System.out.printf("Qual sua idade, %s? ", nome);
        byte idade = input.nextByte();

        do {
            System.out.println("-=-".repeat(30));
            System.out.println("Qual item deseja comprar? :");
            System.out.println("1. Placa-mãe B760M Tug Gaming D4 PLUS Asus - 1650R$");
            System.out.println("2. Processador Intel i5 13600k - 2062,71R$");
            System.out.println("3. Memória RAM ASGARD (2x16GB) - 400R$");
            System.out.println("4. SSD NVME Samsung evo 980 PRO 1TB - 900R$");
            System.out.println("5. Placa de vídeo RTX 4060TI Tuf Gaming Triple fan - 3059,99R$");
            System.out.print("Digite o número do item que deseja comprar: ");

            int escolha = input.nextInt();
            double valorDaCompra = 0;

            switch (escolha) {
                case 1:
                    valorDaCompra = 1650;
                    break;
                case 2:
                    valorDaCompra = 2062.71;
                    break;
                case 3:
                    valorDaCompra = 400;
                    break;
                case 4:
                    valorDaCompra = 900;
                    break;
                case 5:
                    valorDaCompra = 3059.99;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            totalCompra += valorDaCompra;
            System.out.printf("Você adicionou um item de %.2fR$ ao seu carrinho. Total da compra até agora: %.2fR$\n", valorDaCompra, totalCompra);
            System.out.print("Deseja comprar mais algum item? (s/n): ");
            continuar = input.next();
        } while (continuar.equalsIgnoreCase("s"));

        double desconto = 0;

        if (idade >= 21 && totalCompra < 1000) {
            desconto = totalCompra * 0.05;
        } else if (idade < 21 && totalCompra < 1000) {
            desconto = totalCompra * 0.07;
        } else if (idade >= 21 && totalCompra >= 1000) {
            desconto = totalCompra * 0.07;
        } else if (idade < 21 && totalCompra >= 1000) {
            desconto = totalCompra * 0.10;
        }

        double valorFinal = totalCompra - desconto;
        System.out.printf("Certo %s, devido a sua idade ser de %d anos, seu desconto na compra de %.2fR$ será de %.2fR$, resultando num valor total a pagar de %.2fR$.\n", nome, idade, totalCompra, desconto, valorFinal);
        input.close();
    }
}
