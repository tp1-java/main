// # main

package plataforma;

import java.util.Scanner;

public class Plataforma {

    public static void main(String[] args) {
        Scanner scannear = new Scanner(System.in);
        int aux, run = 1;
        String str;
        do {
            System.out.printf("\n>> M E N U <<\n1-Tipo de Plano\n2-Cliente\n3-Numero de Telefone"
                    + "\n4-Chamada Originada\n5-Relatório\n6-Sair\n...\n>");
            aux = scannear.nextInt();
            switch (aux) {
                case 1:{
                }
                case 2:{
                }
                case 3:{
                }
                case 4:{
                }
                case 5:{
                }
                case 6: {   System.out.printf("\nDeseja sair do programa ?\nSim(S/s)\nNão(N/n)\n>");    str = scannear.next();
                    if ((str.equals("s")) || (str.equals("S"))) {   System.out.printf("\n>> Programa Finalizado!\n>");  run = 0;    break;  }
                    if ((str.equals("n")) || (str.equals("N"))) {   aux++;  }
                    if ((!"s".equals(str))&&(!"S".equals(str))&&(!"n".equals(str))&&(!"N".equals(str))) {
                        System.out.printf("\n>> Este não é um caracter válido!\n...\n");    str = "";   run = 1;    }
                }
                default:
                    if (aux > 7)    System.out.println("\n>> Este não é um número válido!\n...\n"); aux++;
            }
        } while (run != 0);
    }
}
