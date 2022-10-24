package random;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

public class GameTest {
    @Test
    public void Test1() {
        Game game1 = new Game(4);
        Game game2 = new Game(4);
        for (int i = 0; i < 8; i++) {
            assertEquals(game1.battle(), game2.battle());
        }
    }
    @Test
    public void Test2() {
        Game game1 = new Game(5);
        double win = 0;
        double lost = 0;
        for (int i = 0; i < 10000; i++) {
            if (game1.battle()) {
                win++;
            } else {
                lost++;
            }
        }
        System.out.println(win/10000);
        System.out.println(lost/10000);

    }
    
}