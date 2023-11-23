package fop.w7color;

public class RgbColor {
    private final int red;
    private final int green;
    private final int blue;
    private final int bitDepth;
    public RgbColor(int bitDepth, int red, int green, int blue){
        if (bitDepth < 0 || bitDepth > 31) {
            ExceptionUtil.unsupportedOperation("Invalid bit depth");
        }
        this.bitDepth = bitDepth;
        int maxColorValue = (1 << bitDepth) - 1;
        if (red < 0 || red > maxColorValue || green < 0 || green > maxColorValue || blue < 0 || blue > maxColorValue) {
            ExceptionUtil.unsupportedOperation("Color values out of range");
        }
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed(){
        return  red;
    }
    public int getGreen(){
        return green;
    }
    public int getBlue(){
        return  blue;
    }
    public int getBitDepth() {return bitDepth;}
    public RgbColor8Bit toRgbColor8Bit() {
        if (this.getBitDepth() == 8) {
            return new RgbColor8Bit(this.getRed(), this.getGreen(), this.getBlue());
        }

        else if (this.getBitDepth() > 8) {
            int red8Bit = scaleDownTo8Bit(this.getRed(), this.getBitDepth());
            int green8Bit = scaleDownTo8Bit(this.getGreen(), this.getBitDepth());
            int blue8Bit = scaleDownTo8Bit(this.getBlue(), this.getBitDepth());

            return new RgbColor8Bit(red8Bit, green8Bit, blue8Bit);
        }

        else {
            int red8Bit = scaleUpTo8Bit(this.getRed(), this.getBitDepth());
            int green8Bit = scaleUpTo8Bit(this.getGreen(), this.getBitDepth());
            int blue8Bit = scaleUpTo8Bit(this.getBlue(), this.getBitDepth());

            return new RgbColor8Bit(red8Bit, green8Bit, blue8Bit);
        }
    }

    private int scaleDownTo8Bit(int colorValue, int currentBitDepth) {
        int difference = currentBitDepth - 8;
        int halfFactor = IntMath.powerOfTwo(difference - 1);
        int reducedValue = colorValue / halfFactor;
        int lsb = reducedValue % 2;
        reducedValue /= 2;
        reducedValue += lsb;

        if(reducedValue > 255){
            return  255;
        }else{
            return  reducedValue;
        }    }

    private int scaleUpTo8Bit(int colorValue, int currentBitDepth) {
        int difference = 8 - currentBitDepth;
        int scaledValue = colorValue;
        for (int i = 0; i < difference; i++) {
            scaledValue = (scaledValue << currentBitDepth) | colorValue;
        }
        if(scaledValue > 255){
            return  255;
        }else{
            return  scaledValue;
        }
    }
}

