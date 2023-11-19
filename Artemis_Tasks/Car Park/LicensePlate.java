import java.util.Objects;

public class LicensePlate {
    String regionalCode;
    String letters;
    Integer digits;
    Integer age;

    public LicensePlate(String regionalCode, String letters, Integer digits) {
        this.regionalCode = regionalCode;
        this.letters = letters;
        this.digits = digits;
    }

    public boolean isEqual(LicensePlate other) {
        boolean regionalsEqual = this.regionalCode.equals(other.regionalCode);
        boolean lettersEqual = this.letters.equals(other.letters);
        boolean digitsEqual = Objects.equals(this.digits, other.digits);

        return regionalsEqual && lettersEqual && digitsEqual;
    }

    public String toString() {
        return this.regionalCode + ":" + this.letters + " " + this.digits;
    }
}
