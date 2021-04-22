package CIS350Project;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class UnitTests {
public UnitTests(){
}

//checks if puzzle is passed and viswall
@Test
public void testWall2true(){
   Wall w2 = new Wall();
   w2.setVisWall(2);
   Assert.assertEquals(2, w2.getVisWall());
   w2.setVisWall(-4);
   Assert.assertEquals(-4, w2.getVisWall());
   w2.setNum1(1);
   w2.setNum2(2);
   w2.setNum3(3);
   Assert.assertEquals(true, w2.getPassedG());
}

//checks if puzzle is failed and viswall
@Test
public void testWall2false() {
    Wall w2 = new Wall();
    w2.setVisWall(2);
    Assert.assertEquals(2, w2.getVisWall());
    w2.setVisWall(-4);
    Assert.assertEquals(-4, w2.getVisWall());
    w2.setNum1(2);
    w2.setNum2(3);
    w2.setNum3(6);
    Assert.assertEquals(false, w2.getPassedG());

}

//checks for a reset if set to false
@Test
public void testWall2000() {
    Wall w2 = new Wall();
    w2.setNum1(2);
    w2.setNum2(3);
    w2.setNum3(6);
    Assert.assertEquals(false, w2.getPassedG());
    Assert.assertEquals(0, w2.getNum1());
    Assert.assertEquals(0, w2.getNum2());
    Assert.assertEquals(0, w2.getNum3());
    }

    //checks that the proper input sets ConsolePuzzle true
    @Test
    public void testConsole() {
        Wall w2 = new Wall();
        w2.setVisWall(-1);
        w2.setCenterConsole1();
        w2.redraw();

        w2.setCenterConsole3();
        w2.setCenterConsole3();
        w2.setCenterConsole3();
        Assert.assertEquals(2, w2.getCenterConsole3());
        Assert.assertEquals(2, w2.getCenterConsole2());
        Assert.assertEquals(2, w2.getCenterConsole1());
        w2.redraw();
        Assert.assertEquals(false, w2.getConsolePuzzle());
    }

    //
    @Test
    public void testFleet() {
        Wall w2 = new Wall();
        w2.setVisWall(-2);
        w2.setFleet(2);
        w2.setFleet(3);
        w2.setFleet(7);
        w2.setFleet(11);
        w2.setFleet(12);
        w2.setFleet(13);
        w2.setFleet(14);
        w2.setFleet(16);

        w2.redraw();
        Assert.assertEquals(false, w2.getFleetPuzzle());
    }




}
