/**
 * 
 * @file        HumanPlayer.java
 * @author      Brian McCarthy, 20063914
 * @assignment  Numerical X and O
 * @brief       Human player class
 * @notes       No known BUGS or ISSUES.
 *
 */
package wit.cgd.numericalxando.game;

public class HumanPlayer extends BasePlayer {

    @SuppressWarnings("unused")
    private static final String TAG = WorldRenderer.class.getName();

    public HumanPlayer(Board board, int symbol) {
        super(board, symbol);
        human = true;
        name = "Electrified Meat";
    }

    @Override
    public int move() {

        // human move handled in worldController
        return 0;
    }

}
