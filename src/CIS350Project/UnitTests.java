package CIS350Project;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;
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


    //Test adding access card in the inventory
    @Test
    public void testInvCard() {
        Inventory w2 = new Inventory();
        w2.setCardInv();

        Assert.assertEquals(true, w2.cardInv);
    }

    //Test remove access card in the inventory
    @Test
    public void testRemInvCard() {
        Inventory w2 = new Inventory();
        w2.removeCardInv();

        Assert.assertEquals(false, w2.cardInv);
    }

    //Test adding note in the inventory
    @Test
    public void testInvNote() {
        Inventory w2 = new Inventory();
        w2.setNoteInv();

        Assert.assertEquals(true, w2.noteInv);
    }

    //Test clue 1 in the inventory
    @Test
    public void testClueOne() {
        Inventory w2 = new Inventory();
        w2.setClueOne();

        Assert.assertEquals(true, w2.clueOne);
    }

    //Test clue 2 in the inventory
    @Test
    public void testClueTwo() {
        Inventory w2 = new Inventory();
        w2.setClueTwo();

        Assert.assertEquals(true, w2.clueTwo);
    }

    //Test clue 3 in the inventory
    @Test
    public void testClueThree() {
        Inventory w2 = new Inventory();
        w2.setClueThree();

        Assert.assertEquals(true, w2.clueThree);
    }

    //Test clue 4 in the inventory
    @Test
    public void testClueFour() {
        Inventory w2 = new Inventory();
        w2.setClueFour();

        Assert.assertEquals(true, w2.clueFour);
    }

    //Test clue 5 in the inventory
    @Test
    public void testClueFive() {
        Inventory w2 = new Inventory();
        w2.setClueFive();

        Assert.assertEquals(true, w2.clueFive);
    }

    //Test clue 6 in the inventory
    @Test
    public void testClueSix() {
        Inventory w2 = new Inventory();
        w2.setClueSix();

        Assert.assertEquals(true, w2.clueSix);
    }

    //Test card inserted in wall
    @Test
    public void testCardInserted() {
        Wall w2 = new Wall();
        w2.cardInserted();

        Assert.assertEquals(true, w2.cardInserted);
    }

    //Test card inserted in wall
    @Test
    public void testCardInserted2() {
        Wall w2 = new Wall();
        w2.cardInserted();
        System.out.println(w2.colorCode.toString());
        Assert.assertEquals(-1, w2.colorCode[0]);
        Assert.assertEquals(-1, w2.colorCode[1]);
        Assert.assertEquals(-1, w2.colorCode[2]);
        Assert.assertEquals(-1, w2.colorCode[3]);
    }

    //Test red pressed in wall
    @Test
    public void testRedPressed() {
        Wall w2 = new Wall();
        w2.cardInserted();
        w2.redPressed();

        Assert.assertEquals(0, w2.colorCode[w2.digitNum-1]);
    }

    //Test red pressed in wall
    @Test
    public void testRedPressed2() {
        Wall w2 = new Wall();
        w2.cardInserted();
        w2.redPressed();
        w2.redPressed();
        w2.redPressed();
        w2.redPressed();

        Assert.assertEquals(0, w2.colorCode[0]);
        Assert.assertEquals(0, w2.colorCode[1]);
        Assert.assertEquals(0, w2.colorCode[2]);
        Assert.assertEquals(0, w2.colorCode[3]);
    }

    //Test red pressed in wall
    @Test
    public void testRedPressed3() {
        Wall w2 = new Wall();
        w2.cardInserted();
        w2.redPressed();
        w2.redPressed();
        w2.redPressed();
        w2.redPressed();
        w2.redPressed();

        Assert.assertEquals(0, w2.colorCode[0]);
        Assert.assertEquals(0, w2.colorCode[1]);
        Assert.assertEquals(0, w2.colorCode[2]);
        Assert.assertEquals(0, w2.colorCode[3]);
    }

    //Test green pressed in wall
    @Test
    public void testGreenPressed() {
        Wall w2 = new Wall();
        w2.cardInserted();
        w2.greenPressed();

        Assert.assertEquals(2, w2.colorCode[w2.digitNum-1]);
    }

    //Test green pressed in wall
    @Test
    public void testGreenPressed2() {
        Wall w2 = new Wall();
        w2.cardInserted();
        w2.greenPressed();
        w2.greenPressed();
        w2.greenPressed();
        w2.greenPressed();

        Assert.assertEquals(2, w2.colorCode[0]);
        Assert.assertEquals(2, w2.colorCode[1]);
        Assert.assertEquals(2, w2.colorCode[2]);
        Assert.assertEquals(2, w2.colorCode[3]);
    }

    //Test green pressed in wall
    @Test
    public void testGreenPressed3() {
        Wall w2 = new Wall();
        w2.cardInserted();
        w2.greenPressed();
        w2.greenPressed();
        w2.greenPressed();
        w2.greenPressed();
        w2.greenPressed();

        Assert.assertEquals(2, w2.colorCode[0]);
        Assert.assertEquals(2, w2.colorCode[1]);
        Assert.assertEquals(2, w2.colorCode[2]);
        Assert.assertEquals(2, w2.colorCode[3]);
    }

    //Test blue pressed in wall
    @Test
    public void testBluePressed() {
        Wall w2 = new Wall();
        w2.cardInserted();
        w2.bluePressed();

        Assert.assertEquals(1, w2.colorCode[w2.digitNum-1]);
    }

    //Test blue pressed in wall
    @Test
    public void testBluePressed2() {
        Wall w2 = new Wall();
        w2.cardInserted();
        w2.bluePressed();
        w2.bluePressed();
        w2.bluePressed();
        w2.bluePressed();

        Assert.assertEquals(1, w2.colorCode[0]);
        Assert.assertEquals(1, w2.colorCode[1]);
        Assert.assertEquals(1, w2.colorCode[2]);
        Assert.assertEquals(1, w2.colorCode[3]);
    }

    //Test blue pressed in wall
    @Test
    public void testBluePressed3() {
        Wall w2 = new Wall();
        w2.cardInserted();
        w2.bluePressed();
        w2.bluePressed();
        w2.bluePressed();
        w2.bluePressed();
        w2.bluePressed();

        Assert.assertEquals(1, w2.colorCode[0]);
        Assert.assertEquals(1, w2.colorCode[1]);
        Assert.assertEquals(1, w2.colorCode[2]);
        Assert.assertEquals(1, w2.colorCode[3]);
    }

    //Test yellow pressed in wall
    @Test
    public void testYellowPressed() {
        Wall w2 = new Wall();
        w2.cardInserted();
        w2.yellowPressed();

        Assert.assertEquals(3, w2.colorCode[w2.digitNum-1]);
    }

    //Test yellow pressed in wall
    @Test
    public void testYellowPressed2() {
        Wall w2 = new Wall();
        w2.cardInserted();
        w2.yellowPressed();
        w2.yellowPressed();
        w2.yellowPressed();
        w2.yellowPressed();

        Assert.assertEquals(3, w2.colorCode[0]);
        Assert.assertEquals(3, w2.colorCode[1]);
        Assert.assertEquals(3, w2.colorCode[2]);
        Assert.assertEquals(3, w2.colorCode[3]);
    }

    //Test yellow pressed in wall
    @Test
    public void testYellowPressed3() {
        Wall w2 = new Wall();
        w2.cardInserted();
        w2.yellowPressed();
        w2.yellowPressed();
        w2.yellowPressed();
        w2.yellowPressed();
        w2.yellowPressed();

        Assert.assertEquals(3, w2.colorCode[0]);
        Assert.assertEquals(3, w2.colorCode[1]);
        Assert.assertEquals(3, w2.colorCode[2]);
        Assert.assertEquals(3, w2.colorCode[3]);
    }

    //Test full color code in wall
    @Test
    public void testColorCode() {
        Wall w2 = new Wall();
        w2.cardInserted();
        w2.redPressed();
        w2.greenPressed();
        w2.bluePressed();
        w2.yellowPressed();


        Assert.assertEquals(0, w2.colorCode[0]);
        Assert.assertEquals(2, w2.colorCode[1]);
        Assert.assertEquals(1, w2.colorCode[2]);
        Assert.assertEquals(3, w2.colorCode[3]);
    }

    //Test set card in wall
    @Test
    public void testSetCard() {
        Wall w2 = new Wall();
        w2.setCard();

        Assert.assertEquals(false, w2.card);
    }

    //Test set note in wall
    @Test
    public void testSetNote() {
        Wall w2 = new Wall();
        w2.setNote();

        Assert.assertEquals(false, w2.note);
    }

    //Test clear fleet
    @Test
    public void testClearFleet() {
        Wall w2 = new Wall();
        w2.clearFleet();

        Assert.assertEquals(17, w2.fleet.length);
    }


}
