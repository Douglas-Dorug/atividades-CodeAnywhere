package atividades.solucionandodesafiosmatemáticosemjava.atividade1;

import java.util.Scanner;

public class CalculoViagem {

    public static void main(String[] args){

        //continue a solucao

        Scanner scan = new Scanner(System.in);

        Float tempoViagem = scan.nextFloat();
        Float kmHora = scan.nextFloat();






        System.out.printf("%.3f\n", (tempoViagem  * kmHora  )/12.0);
    }
}
