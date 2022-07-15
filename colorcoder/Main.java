package colorcoder;

import colorcoder.constants.Constants;
import colorcoder.enums.MajorColor;
import colorcoder.enums.MinorColor;
import colorcoder.test.Test;

public class Main {

	public static void main(String[] args) {
		Test test = new Test();
		test.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
		test.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

		test.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
		test.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
	}
}
