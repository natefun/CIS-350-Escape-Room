package CIS350Project;

import org.junit.Assert;
import org.junit.Test;

public class UnitTests {
public UnitTests(){
}

//checks if puzzle is passed
@Test
public void testWall2true(){
   Wall w2 = new Wall();
   ERoom e2 = new ERoom();
   w2.setVisWall(-4);
   w2.setNum1(1);
   w2.setNum2(2);
   w2.setNum3(3);
   Assert.assertEquals(true, w2.getPassedG());
}
//checks if puzzle is failed
@Test
    public void testWall2false() {
    Wall w2 = new Wall();
    ERoom e2 = new ERoom();
    w2.setVisWall(-4);
    w2.setNum1(2);
    w2.setNum2(3);
    w2.setNum3(6);
    Assert.assertEquals(false, w2.getPassedG());
}

}
