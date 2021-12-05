
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PlayerTest {


    @Test
    void testGetIsAlive() {
        assertTrue((new Player(" nickname", 1)).getIsAlive());
    }
}