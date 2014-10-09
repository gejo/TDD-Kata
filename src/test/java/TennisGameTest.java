import static org.junit.Assert.*;

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
    public void a_score() {
        TennisGame game = new TennisGame();
        game.getPlayerA().winBall(1);
        assertEquals("15:0", game.getScore());
    }

    @Test
    public void deuce() {
        TennisGame game = new TennisGame();
        game.getPlayerA().winBall(3);
        game.getPlayerB().winBall(3);
        assertEquals("Deuce", game.getScore());
    }

    @Test
    public void a_advantage() {
        TennisGame game = new TennisGame();
        game.getPlayerA().winBall(3);
        game.getPlayerB().winBall(3);
        game.getPlayerA().winBall(1);
        assertEquals("A Advantage", game.getScore());
    }

    @Test
    public void b_advantage() {
        TennisGame game = new TennisGame();
        game.getPlayerA().winBall(3);
        game.getPlayerB().winBall(3);
        game.getPlayerB().winBall(1);
        assertEquals("B Advantage", game.getScore());
    }

    @Test
    public void a_win() {
        TennisGame game = new TennisGame();
        game.getPlayerA().winBall(3);
        game.getPlayerB().winBall(3);
        game.getPlayerA().winBall(2);
        assertEquals("A Win", game.getScore());
    }


}
