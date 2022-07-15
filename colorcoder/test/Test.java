package colorcoder.test;

import colorcoder.ColorPair;
import colorcoder.enums.MajorColor;
import colorcoder.enums.MinorColor;
import colorcoder.util.ColorCodeUtil;

public class Test {


   public static void testNumberToPair(int pairNumber,
       MajorColor expectedMajor,
       MinorColor expectedMinor)
   {
       ColorPair colorPair = ColorCodeUtil.GetColorFromPairNumber(pairNumber);
       System.out.println("Got pair " + colorPair.ToString());
       assert(colorPair.getMajor() == expectedMajor);
       assert(colorPair.getMinor() == expectedMinor);
   }

   public static void testPairToNumber(
       MajorColor major,
       MinorColor minor,
       int expectedPairNumber)
   {
       int pairNumber = ColorCodeUtil.GetPairNumberFromColor(major, minor);
       System.out.println("Got pair number " + pairNumber);
       assert(pairNumber == expectedPairNumber);
   }
};