import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;

public class TestHand {

    @Test
    public void compareHands (){
        Focus hand1 = new Focus;
        Focus hand2 = new Focus;
        Focus hand3 = new Focus;
        hand1.add();
        hand2.add();
        hand3.add();
        Assertions.assertEquals(1, hand1, hand2);
        Assertions.assertEquals(-1, hand2, hand1);


    }
}
