package atividades.solucionandodesafiosmatemáticosemjava.atividade4;

import java.io.IOException;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        //continue a solucao
        int valor_1= leitor.nextInt();
        int valor_2= leitor.nextInt();
        if (valor_2 % valor_1 == 0 || valor_1 % valor_2 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");

        }
    }
}
