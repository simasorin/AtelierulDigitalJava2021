package FinalProject1;

// Adapter Design Pattern
// For this example let's say we have a captain that can only use
// rowing boats and cannot sail at all. If we want the captain to sail a fishing boat
// we need to adapt the skills he has to make him use a fishing boat with rowing skills
// To better understand this design pattern, we will look at the UML diagram

public class Main {
    public static void main(String[] args) {

        // Wrap the Captain in a FishingBoatAdapter so that he can use the fishing boat
        var captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
