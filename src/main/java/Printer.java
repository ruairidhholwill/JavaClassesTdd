public class Printer {

    private int sheetsLeft;
    private int toner;

    public Printer(int sheetsLeft, int toner){
        this.sheetsLeft = sheetsLeft;
        this.toner = toner;
    }

    public int canPrint(int pages, int copies){
        if ((pages * copies) <= this.sheetsLeft){
            return this.sheetsLeft -= (pages * copies);
        } else {
            return this.sheetsLeft;
        }
    }

    public int reduceToner(int pages){
        return this.toner -= (pages * 1);
    }
}
