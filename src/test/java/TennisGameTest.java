import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.oocl.tdd.tennis.TennisGame;

/**
 * Created by GEJO on 8/7/2014.
 */
public class TennisGameTest {

    @Test
    public void start_game() {
        TennisGame game = new TennisGame();
        assertEquals("0:0", game.getScore());
    }

    @Test
    public void win_ball() {
        TennisGame game = new TennisGame();
        game.getPlayerA().winBall(1);
        assertEquals("15:0", game.getScore());
    }

    @Test
    public void deuce_ball() {
        TennisGame game = new TennisGame();
        game.getPlayerA().winBall(3);
        game.getPlayerB().winBall(3);
        assertEquals("40:40", game.getScore());
    }

    @Test
    public void advantage_ball() {
        TennisGame game = new TennisGame();
        game.getPlayerA().winBall(3);
        game.getPlayerB().winBall(3);
        game.getPlayerA().winBall(1);
        assertEquals("A Advantage", game.getScore());
    }

}
