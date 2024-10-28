public class Piano extends instruments {
    private String pianoType;

    public String getPianoType() {
        return this.pianoType;
    }

    public void setPianoType(String pianoType) {
        this.pianoType = pianoType;
    }

    public Piano() {
        super();
        pianoType = "Digital";
    }

    public Piano(String name, double price, String pianoType) {
        super(name,price);
        this.pianoType = pianoType;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Tipe Piano: "+pianoType);
    }
}