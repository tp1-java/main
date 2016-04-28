// # main
package Operadora;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scannear = new Scanner(System.in);
        
        int aux, aux1, run = 1, x = 0;
        String str;
        do {
            if (x == 0) {
                System.out.printf("\n>> M E N U <<\n1-Tipo de Plano\n2-Cliente\n3-Numero de Telefone\n4-Chamada Originada\n5-Relatório\n6-Sair\n...\n>");   }
            aux = scannear.nextInt();
            switch (aux) {
                case 1: x = 1;{   while (x == 1) {System.out.printf("\n>> Opção 1 - Tipo de Plano <<\n1-Cadatrar\n2-Alterar\n"
                                    + "3-Exluir\n4-Listar\n5-Pesquisar\n6-Voltar ao MENU\n...\n>"); aux1 = scannear.nextInt();
                            switch (aux1) {
                                case 1: System.out.println("\n>> Tipo de plano cadastrado com sucesso!");x = 1;break;
                                case 2:System.out.println("\n>> Tipo de plano alterado com sucesso!");x = 1;break;
                                case 3:System.out.println("\n>> Tipo de plano excluído com sucesso!");x = 1;break;
                                case 4:System.out.println("\n>> Listar...");x = 1;break;
                                case 5:System.out.println("\n>> Pesquisar...");x = 1;break;
                                case 6:run = 1;x = 0;
                                default:    if (aux1 != 6 && aux1 != 5 && aux1 != 4 && aux1 != 3 && aux1 != 2 && aux1 != 1) {   while (aux == 1 && aux1 != 6 && aux1 != 5 && aux1 != 4 && aux1 != 3 && aux1 != 2 && aux1 != 1) {
                                            System.out.printf("\n>> Este não é um número válido!\n...\n>");aux1 -= aux1;aux1 = scannear.nextInt(); }    }
                            }}
                        break;
                    }

                case 6: {
                    System.out.printf("\nDeseja sair do programa ?\nSim(S/s)\nNão(N/n)\n>");
                    str = scannear.next();
                    if ((str.equals("s")) || (str.equals("S"))) {System.out.printf("\n>> Programa Finalizado!\n>");run = 0;break;}
                    if ((str.equals("n")) || (str.equals("N"))) {run = 1;}
                    if ((!"s".equals(str)) && (!"S".equals(str)) && (!"n".equals(str)) && (!"N".equals(str))) {System.out.printf("\n>> Este não é um caracter válido!\n...\n");str = "";    }   break;
                }
                
                default:    if (aux != 6 && aux != 5 && aux != 4 && aux != 3 && aux != 2 && aux != 1) { System.out.println("\n>> Este não é um número válido!\n...\n"); }
            }
        } while (run != 0);
    }
}
