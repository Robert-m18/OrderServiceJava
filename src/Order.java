public class Order {
    private int ID;
    private double kwota;

    public Order(int ID, double kwota) {
       if (kwota < 0){throw  new IllegalArgumentException("Kwota nie może być mniejsza od 0 ( z wyjątkiem gratisów )");}
        this.ID = ID;
        this.kwota = kwota;
    }

    public int getID() {
        return ID;
    }

    public double getKwota() {
        return kwota;
    }

    @Override
    public String toString() {
        return "ID: " + this.ID + " | Kwota: " + this.kwota;
    }
}
