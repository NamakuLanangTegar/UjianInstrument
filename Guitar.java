public class Guitar extends StringInstruments{
    boolean isElectric;

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public Guitar() {
        super();
        isElectric = true;
    }

    public Guitar(String name, double price, int numStrings, boolean isElectric) {
        super(name,price,numStrings);
        this.isElectric = isElectric;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Gitarnya Listrik: "+isElectric);
    }

}
 