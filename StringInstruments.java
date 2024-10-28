public class StringInstruments extends instruments {
    int numStrings;

    public int getNumStrings() {
        return this.numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public StringInstruments() {
        super();
        numStrings = 6;
    }

    public StringInstruments(String name, double price, int numStrings) {
        super(name,price);
        this.numStrings = numStrings;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Num Strings: "+numStrings);
    }

}
