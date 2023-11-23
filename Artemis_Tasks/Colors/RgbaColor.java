package fop.w7color;

public class RgbaColor extends  RgbColor{
    private final int alpha;
    public RgbaColor(int bitDepth, int red, int green, int blue, int alpha) {
        super(bitDepth, red, green, blue);
        int maxAlphaValue = (1 << bitDepth) - 1;
        if (alpha < 0 || alpha > maxAlphaValue) {
            ExceptionUtil.unsupportedOperation("Alpha value out of range");
        }
        this.alpha = alpha;
    }
    public int getAlpha() {
        return alpha;
    }
    public RgbColor8Bit toRgbColor8Bit(){
        if(alpha != ((1 << getBitDepth())-1)){
            ExceptionUtil.unsupportedOperation("Alpha value is not maximal");
        }
        return super.toRgbColor8Bit();

    }

}
