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
	public void get_game_result() {
		TennisGame game = new TennisGame();
		assertEquals("Duce", game.getGameResult());
	}
}
