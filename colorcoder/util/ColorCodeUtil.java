package colorcoder.util;

import colorcoder.ColorPair;
import colorcoder.constants.Constants;
import colorcoder.enums.MajorColor;
import colorcoder.enums.MinorColor;

public class ColorCodeUtil {

	public static ColorPair GetColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / Constants.numberOfMinorColors);
		MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % Constants.numberOfMinorColors);
		return new ColorPair(majorColor, minorColor);
	}

	public static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * Constants.numberOfMinorColors + minor.getIndex() + 1;
	}
	
	
}
