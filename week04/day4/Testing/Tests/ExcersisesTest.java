import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExcersisesTest {

    @Test
    public void getApple_test() {
        Apples apple = new Apples();

        String actualInput = apple.getApple("apple");

        assertEquals("apple", actualInput);
    }
}
