package br.com.ebook.projeto.calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class ControllerTest {

    private final Controller controller = new Controller();

    @Test
    public void testActionListeners() {

        System.out.println("Testando se os eventos foram adicionados na GUI");
        assertEquals(true, controller.getView().jb0.getActionListeners().length == 1);
        assertEquals(true, controller.getView().jb1.getActionListeners().length == 1);
        assertEquals(true, controller.getView().jb2.getActionListeners().length == 1);
        assertEquals(true, controller.getView().jb3.getActionListeners().length == 1);
        assertEquals(true, controller.getView().jb4.getActionListeners().length == 1);
        assertEquals(true, controller.getView().jb5.getActionListeners().length == 1);
        assertEquals(true, controller.getView().jb6.getActionListeners().length == 1);
        assertEquals(true, controller.getView().jb7.getActionListeners().length == 1);
        assertEquals(true, controller.getView().jb8.getActionListeners().length == 1);
        assertEquals(true, controller.getView().jb9.getActionListeners().length == 1);
        assertEquals(true, controller.getView().jbMultiplicar.getActionListeners().length == 1);
        assertEquals(true, controller.getView().jbDividir.getActionListeners().length == 1);
        assertEquals(true, controller.getView().jbSomar.getActionListeners().length == 1);
        assertEquals(true, controller.getView().jbSubtrair.getActionListeners().length == 1);
        assertEquals(true, controller.getView().jbCalcular.getActionListeners().length == 1);
        assertEquals(true, controller.getView().jbLimpar.getActionListeners().length == 1);

    }

}
