
import org.junit.Test;

import java.util.List;


import static org.junit.Assert.*;

/**
 * Created by kevinlei on 9/18/18.
 */
public class FunGameTest {
    private static FunGame funGame = new FunGame();

    @Test
    /**
     * test for stage1 
     */
    public void printNormall() throws Exception {
        List<String> list = funGame.printNormall(100);
        for (int i = 0; i < list.size(); i++) {
            if ("Fizz".equals(list.get(i))) {
                assertEquals((i + 1) % 3, 0);
            } else if ("Buzz".equals(list.get(i))) {
                assertEquals((i + 1) % 5, 0);
            } else if ("FizzBuzz".equals(list.get(i))) {
                assertEquals((i + 1) % 5, 0);
                assertEquals((i + 1) % 3, 0);
            }
        }
    }

    @Test
    /**
     * test for stage2
     */
    public void printStage2() throws Exception {
        List<String> list = funGame.printStage2(100);
        for (int i = 0; i < list.size(); i++) {
            if ("Fizz".equals(list.get(i))) {
                if (((i + 1) % 3 != 0) && (!String.valueOf(i + 1).contains("3"))) {
                    fail();
                }
            } else if ("Buzz".equals(list.get(i))) {
                if (((i + 1) % 5 != 0) && (!String.valueOf(i + 1).contains("5"))) {
                    fail();
                }
            } else if ("FizzBuzz".equals(list.get(i))) {
                if (!(((i + 1) % 3 == 0) && ((i + 1) % 5 == 0)) &&  //not equal and not in
                        (!((String.valueOf(i + 1).contains("3")) && ((String.valueOf(i + 1).contains("3")))))) {
                    fail();

                }
            }
        }
    }


}