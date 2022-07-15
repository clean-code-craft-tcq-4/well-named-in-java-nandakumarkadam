package colorcoder;

import colorcoder.constants.Constants;
import colorcoder.enums.MajorColor;
import colorcoder.enums.MinorColor;

public class ColorPair {
    private MajorColor majorColor;
    private MinorColor minorColor;
    
    public ColorPair(MajorColor major, MinorColor minor)
    {
        majorColor = major;
        minorColor = minor;
    }
    public MajorColor getMajor() {
        return majorColor;
    }
    public MinorColor getMinor() {
        return minorColor;
    }
    public String ToString() {
        String colorPairStr = Constants.MajorColorNames[majorColor.getIndex()];
        colorPairStr += " ";
        colorPairStr += Constants.MinorColorNames[minorColor.getIndex()];
        return colorPairStr;
    }
};