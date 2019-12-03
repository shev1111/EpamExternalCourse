package task1.task11.model;

public class NumberContainer {
    int decimalDigit;

    public NumberContainer() {
        this(0);
    }

    public NumberContainer(int decimalDigit) {
        this.decimalDigit = decimalDigit;
    }

    public int getDecimalDigit() {
        return decimalDigit;
    }

    public void setDecimalDigit(int decimalDigit) {
        this.decimalDigit = decimalDigit;
    }
}
