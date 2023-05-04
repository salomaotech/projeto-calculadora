package br.com.ebook.projeto.calculadora;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    @Test
    public void testAddNumero() {

        calculadora.addNumero(1);
        calculadora.setSinal(3);
        calculadora.addNumero(1);

        System.out.println("Testando classe Calculadora método: addNumero");
        assertEquals(true, calculadora.calcular() == 2);

    }

    @Test
    public void testSetSinal() {

        calculadora = new Calculadora();
        calculadora.addNumero(2);
        calculadora.setSinal(1);
        calculadora.addNumero(2);
        System.out.println("Testando classe Calculadora método: setSinal *");
        assertEquals(true, calculadora.calcular() == 4);

        calculadora = new Calculadora();
        calculadora.addNumero(100);
        calculadora.setSinal(2);
        calculadora.addNumero(2);
        System.out.println("Testando classe Calculadora método: setSinal /");
        assertEquals(true, calculadora.calcular() == 50);

        calculadora = new Calculadora();
        calculadora.addNumero(20);
        calculadora.setSinal(3);
        calculadora.addNumero(20);
        System.out.println("Testando classe Calculadora método: setSinal +");
        assertEquals(true, calculadora.calcular() == 40);

        calculadora = new Calculadora();
        calculadora.addNumero(128);
        calculadora.setSinal(4);
        calculadora.addNumero(8);
        System.out.println("Testando classe Calculadora método: setSinal -");
        assertEquals(true, calculadora.calcular() == 120);

    }

    @Test
    public void testCalcular() {

        calculadora = new Calculadora();
        calculadora.addNumero(2);
        calculadora.addNumero(3);
        calculadora.setSinal(1);
        calculadora.addNumero(5);
        calculadora.addNumero(5);
        System.out.println("Testando classe Calculadora método: calcular");
        assertEquals(true, calculadora.calcular() == 1265);

        calculadora = new Calculadora();
        calculadora.addNumero(2);
        calculadora.addNumero(5);
        calculadora.addNumero(5);
        calculadora.setSinal(2);
        calculadora.addNumero(5);
        System.out.println("Testando classe Calculadora método: calcular");
        assertEquals(true, calculadora.calcular() == 51);

        calculadora = new Calculadora();
        calculadora.addNumero(10);
        calculadora.addNumero(0);
        calculadora.setSinal(3);
        calculadora.addNumero(1);
        System.out.println("Testando classe Calculadora método: calcular");
        assertEquals(true, calculadora.calcular() == 101);

        calculadora = new Calculadora();
        calculadora.addNumero(10);
        calculadora.addNumero(0);
        calculadora.addNumero(0);
        calculadora.setSinal(4);
        calculadora.addNumero(2);
        calculadora.addNumero(5);
        calculadora.addNumero(0);
        System.out.println("Testando classe Calculadora método: calcular");
        assertEquals(true, calculadora.calcular() == 750);

    }

    @Test
    public void testLimpar() {

        calculadora = new Calculadora();
        calculadora.addNumero(2);
        calculadora.addNumero(3);
        calculadora.setSinal(1);
        calculadora.addNumero(5);
        calculadora.addNumero(5);

        calculadora.limpar();
        System.out.println("Testando classe Calculadora método: limpar");
        assertEquals(true, calculadora.calcular() == 0);

    }

}
