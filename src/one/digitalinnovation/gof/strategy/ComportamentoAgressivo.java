package one.digitalinnovation.gof.strategy;

/**
 * Singleton "apressado"
 * @author michelabs
 */

public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente.");
    }
}
