package atividades.iniciandoProgramacaoJava.atividade1;

import java.io.IOException;
import java.util.Scanner;

public class PrintaPares {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Integer N = scanner.nextInt();

        for (int i = 1 ; i <= N ; i++) {
            if (i % 2 ==0 ){
                System.out.println(i);
            }
        }
    }
}
