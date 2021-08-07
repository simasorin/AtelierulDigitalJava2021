package FinalProject1;

// Let's say the pirates are coming and our captain needs to escape but
// he can only use fishing boat. We need to create an adapter so the captain
// can use the fishing boat with his rowing boat skills

// Adapter class: This class is a wrapper class which implements the desired target interface and
//   modifies the specific request available from the Adaptee class

// We need to implement the interface the client expects to use
public class FishingBoatAdapter implements RowingBoat {

    private final FishingBoat boat;

    public FishingBoatAdapter() {
        boat = new FishingBoat(); // we need reference to the object we are adapting
    }

    @Override
    public void row() {
        boat.sail();
    }
}
