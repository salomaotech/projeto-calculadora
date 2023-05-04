package br.com.ebook.projeto.calculadora;

import java.util.ArrayList;

public class Calculadora {

    private final ArrayList<Integer> valorA = new ArrayList<>();
    private final ArrayList<Integer> valorB = new ArrayList<>();
    private int sinal;

    public void addNumero(int numero) {

        if (sinal == 0) {
            valorA.add(numero);
        } else {
            valorB.add(numero);
        }

    }

    public boolean setSinal(int sinal) {

        if (this.sinal == 0 && !valorA.isEmpty()) {

            this.sinal = sinal;
            return true;

        } else {

            return false;
        }

    }

    public double calcular() {

        int resultado = 0;
        String valoresA = "";
        String valoresB = "";

        for (int i : valorA) {
            valoresA += i;
        }

        for (int i : valorB) {
            valoresB += i;
        }

        switch (sinal) {

            case 1:
                resultado = Integer.parseInt(valoresA) * Integer.parseInt(valoresB);
                break;

            case 2:
                resultado = Integer.parseInt(valoresA) / Integer.parseInt(valoresB);
                break;

            case 3:
                resultado = Integer.parseInt(valoresA) + Integer.parseInt(valoresB);
                break;

            case 4:
                resultado = Integer.parseInt(valoresA) - Integer.parseInt(valoresB);
                break;

        }

        // já tenho o resultado, então vou lipar tudo
        limpar();

        // e adicionar o resultado na primeira variável antes do sinal
        valorA.add(resultado);

        return resultado;

    }

    public void limpar() {
        valorA.clear();
        valorB.clear();
        sinal = 0;
    }

}
