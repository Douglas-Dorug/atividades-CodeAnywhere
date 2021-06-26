package atividades.iniciandoProgramacaoJava.atividade2;

import java.util.Locale;
import java.util.Scanner;

public class PrintaValoresCpf {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));

        Scanner sc = new Scanner(System.in);

        String[] cpf = new String[4];

        //continue a solucao

        cpf = sc.nextLine().split("\\. | -");

        for (int i = 0 ; i < 4 ; i++) {
            System.out.printf("%s\n",cpf[i]);
            }


        sc.close();
    }
}
