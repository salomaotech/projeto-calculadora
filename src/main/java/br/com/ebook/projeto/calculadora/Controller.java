package br.com.ebook.projeto.calculadora;

import java.awt.event.ActionEvent;

public class Controller {

    private final JFtela view = new JFtela();
    private final Calculadora calculadora = new Calculadora();

    public Controller() {

        addEventos();
        view.setVisible(true);
        view.jtVisor.setText(null);

    }

    private void addEventos() {

        view.jb0.addActionListener((ActionEvent e) -> {
            calculadora.addNumero(0);
            view.jtVisor.setText(view.jtVisor.getText() + "0");
        });

        view.jb1.addActionListener((ActionEvent e) -> {
            calculadora.addNumero(1);
            view.jtVisor.setText(view.jtVisor.getText() + "1");
        });

        view.jb2.addActionListener((ActionEvent e) -> {
            calculadora.addNumero(2);
            view.jtVisor.setText(view.jtVisor.getText() + "2");
        });

        view.jb3.addActionListener((ActionEvent e) -> {
            calculadora.addNumero(3);
            view.jtVisor.setText(view.jtVisor.getText() + "3");
        });

        view.jb4.addActionListener((ActionEvent e) -> {
            calculadora.addNumero(4);
            view.jtVisor.setText(view.jtVisor.getText() + "4");
        });

        view.jb5.addActionListener((ActionEvent e) -> {
            calculadora.addNumero(5);
            view.jtVisor.setText(view.jtVisor.getText() + "5");
        });

        view.jb6.addActionListener((ActionEvent e) -> {
            calculadora.addNumero(6);
            view.jtVisor.setText(view.jtVisor.getText() + "6");
        });

        view.jb7.addActionListener((ActionEvent e) -> {
            calculadora.addNumero(7);
            view.jtVisor.setText(view.jtVisor.getText() + "7");
        });

        view.jb8.addActionListener((ActionEvent e) -> {
            calculadora.addNumero(8);
            view.jtVisor.setText(view.jtVisor.getText() + "8");
        });

        view.jb9.addActionListener((ActionEvent e) -> {
            calculadora.addNumero(9);
            view.jtVisor.setText(view.jtVisor.getText() + "9");
        });

        view.jbMultiplicar.addActionListener((ActionEvent e) -> {

            if (calculadora.setSinal(1) == true) {

                view.jtVisor.setText(view.jtVisor.getText() + "*");
            }

        });

        view.jbDividir.addActionListener((ActionEvent e) -> {

            if (calculadora.setSinal(2) == true) {

                view.jtVisor.setText(view.jtVisor.getText() + "/");

            }

        });

        view.jbSomar.addActionListener((ActionEvent e) -> {

            if (calculadora.setSinal(3) == true) {

                view.jtVisor.setText(view.jtVisor.getText() + "+");

            }

        });

        view.jbSubtrair.addActionListener((ActionEvent e) -> {

            if (calculadora.setSinal(4) == true) {

                view.jtVisor.setText(view.jtVisor.getText() + "-");

            }

        });

        view.jbCalcular.addActionListener((ActionEvent e) -> {
            view.jtVisor.setText(String.valueOf(calculadora.calcular()));
        });

        view.jbLimpar.addActionListener((ActionEvent e) -> {
            calculadora.limpar();
            view.jtVisor.setText(null);

        });

    }

    public JFtela getView() {
        return view;
    }

}
