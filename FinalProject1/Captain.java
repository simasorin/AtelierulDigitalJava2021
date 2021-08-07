package FinalProject1;

// The captain expects an implementation of RowingBoat interface
// to be able to move

// Client: This class will interact with the Adapter class.

public class Captain {

    private final RowingBoat rowingBoat;

    // default constructor for rowingBoat
    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void row() {
        rowingBoat.row();
    }
}
