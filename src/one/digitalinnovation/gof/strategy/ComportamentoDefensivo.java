package one.digitalinnovation.gof.strategy;

/**
 * Singleton "apressado"
 * @author michelabs
 */

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente.");
    }
}
