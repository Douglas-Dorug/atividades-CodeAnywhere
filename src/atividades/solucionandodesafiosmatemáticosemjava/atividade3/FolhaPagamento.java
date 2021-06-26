package atividades.solucionandodesafiosmatemáticosemjava.atividade3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FolhaPagamento {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numFuncionario = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int horasTrabalhadas = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double valorHora = Double.parseDouble(st.nextToken());



        double salary = horasTrabalhadas * valorHora; // Altere o valor da variável com o cálculo esperado
        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f", salary);
    }
}
