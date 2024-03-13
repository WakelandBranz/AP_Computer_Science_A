/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  public static void testKeepOnlyBlue()
 {
    Picture beach = new Picture("beach.jpg");
    beach.keepOnlyBlue();
    beach.explore();
 }  

 public static void testNegateImage() {
    Picture beach = new Picture("beach.jpg");
    beach.negateImage();
    beach.explore();
 }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorVerticalRightToLeft() {
    Picture picture = new Picture("pixLab\\images\\caterpillar.jpg");
    picture.explore();
    picture.mirrorVerticalRightToLeft();
    picture.explore();
  }

  public static void testMirrorHorizontal() {
    Picture picture = new Picture("pixLab\\images\\caterpillar.jpg");
    picture.explore();
    picture.mirrorHorizontal();
    picture.explore();
  }  

  public static void testMirrorHorizontalBotToTop() {
    Picture picture = new Picture("pixLab\\images\\caterpillar.jpg");
    picture.explore();
    picture.mirrorHorizontalBotToTop();
    picture.explore();
  }

  /** Method to test mirrorTemple */
  public static void testMirrorTemple() {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  public static void testMirrorArms() {
    Picture picture = new Picture("pixLab\\images\\snowman.jpg");
    picture.explore();
    picture.mirrorArms();
    picture.explore();
  }

  public static void testMirrorGull() {
    Picture picture = new Picture("pixLab\\images\\seagull.jpg");
    picture.explore();
    picture.mirrorGull();
    picture.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  public static void testMyCollage() {
    Picture picture = new Picture("pixLab\\images\\seagull.jpg");
    picture.explore();
    picture.myCollage();
    picture.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testMyEdgeDetection() {
    Picture swan = new Picture("pixLab\\images\\swan.jpg");
    swan.edgeDetection(10);
  
    Picture swan2 = new Picture("pixLab\\images\\swan.jpg");
    swan2.myEdgeDetection(10);

    swan.explore();
    swan2.explore();
  }

  public static void loopTest() {
    int i = 0;
    for (int row = 7; row < 17; row++) {
      for (int col = 6; col < 15; col++) {
        i++;
      }
    }
    System.out.println(i);
  } 

  public static void testCopy() {
    Picture picture = new Picture("pixLab\\images\\snowman.jpg");
    picture.explore();
    Picture newPic = new Picture("pixLab\\images\\caterpillar.jpg");
    picture.preciseCopy(newPic, 0, 50, 0, 100);
    newPic.explore();
  }

  public static void testFixUnderwater() {
    Picture picture = new Picture("pixlab\\images\\water.jpg");
    picture.explore();
    picture.fixUnderwater();
    picture.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    //testFixUnderwater();
    //loopTest();
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testNegateImage();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testCopy();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testMyCollage();
    //testCopy();
    //testEdgeDetection();
    testMyEdgeDetection();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}