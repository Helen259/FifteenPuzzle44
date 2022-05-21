import com.example.fifteenpuzzlesolver3.Solver;

import static com.example.fifteenpuzzlesolver3.Game.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.testng.annotations.Test;

public class Test1 {
    @Test
    public void solverTest() {
        tiles[0][0] = 5;
        tiles[0][1] = 1;
        tiles[0][2] = 6;
        tiles[0][3] = 2;
        tiles[1][0] = 7;
        tiles[1][1] = 11;
        tiles[1][2] = 9;
        tiles[1][3] = 8;
        tiles[2][0] = 14;
        tiles[2][1] = 12;
        tiles[2][2] = 3;
        tiles[2][3] = 4;
        tiles[3][0] = 0;
        tiles[3][1] = 15;
        tiles[3][2] = 13;
        tiles[3][3] = 10;

        Solver h = new Solver();
        assertEquals(h.helper(), "RRRULLDRUURDDLLLURRDLLURRULLURRRDDLULURRDDD");
    }

    @Test
    public void solverTest2() {
        tiles[0][0] = 3;
        tiles[0][1] = 4;
        tiles[0][2] = 2;
        tiles[0][3] = 10;
        tiles[1][0] = 15;
        tiles[1][1] = 13;
        tiles[1][2] = 5;
        tiles[1][3] = 8;
        tiles[2][0] = 12;
        tiles[2][1] = 14;
        tiles[2][2] = 11;
        tiles[2][3] = 0;
        tiles[3][0] = 6;
        tiles[3][1] = 7;
        tiles[3][2] = 1;
        tiles[3][3] = 9;

        Solver h = new Solver();
        assertEquals(h.helper(), "LDLURDRULDLLUURDDLUURRULLDRRRULLDDRDLLURRRULDRDLLURRD");
    }
}
