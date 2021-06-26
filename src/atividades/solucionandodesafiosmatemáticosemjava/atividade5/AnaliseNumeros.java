package atividades.solucionandodesafiosmatemáticosemjava.atividade5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnaliseNumeros {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int val1 = leitor.nextInt();
        int val2 = leitor.nextInt();
        int val3 = leitor.nextInt();
        int val4 = leitor.nextInt();
        int val5 = leitor.nextInt();

        List valoresDeclarados = new ArrayList();
        
        valoresDeclarados.add(val1);
        valoresDeclarados.add(val2);
        valoresDeclarados.add(val3);
        valoresDeclarados.add(val4);
        valoresDeclarados.add(val5);

        int contaPares = 0;
        int contaImpares = 0;
        int contaPositivos = 0;
        int contaNegativos = 0;

//continue a solução
        for (int i = 0; i < valoresDeclarados.size() ; i++) {
            if ((Integer) valoresDeclarados.get(i) > 0){
                contaPositivos += 1;

            }
            if ((Integer) valoresDeclarados.get(i) < 0){
                contaNegativos += 1;

            }
            if ((Integer) valoresDeclarados.get(i) % 2 == 0){
                contaPares += 1;

            }
            if ((Integer) valoresDeclarados.get(i) % 2 != 0){
                contaImpares += 1;

            }

        }
//insira suas variaveis corretamente
        System.out.println( contaPares + " valor(es) par(es)");
        System.out.println( contaImpares + " valor(es) impar(es)");
        System.out.println( contaPositivos + " valor(es) positivo(s)");
        System.out.println( contaNegativos + " valor(es) negativo(s)");
    }
}
