package atividades.solucionandodesafiosmatemáticosemjava.atividade2;

import java.util.Scanner;

public class CalculaAreaCirculo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //declare suas variaveis do tipo double

        //continue a solucao

        Double area;
        Double raio = scan.nextDouble();
        area = 3.14159 * (Math.pow(raio,2));

        System.out.printf("A=%.4f\n", area);
    }
}
