package lab3.visitor;

public class Main {
    public static void main(String[] args) {
        Element [] elements = new Element[]{
                new Book("Book title", 100,10.3f),
                new Audio("Song title",3.5f,15),
                new Video("Video title",90,70)
        };

        PriceVisitor priceVisitor = new PriceVisitor();

        for(int i=0;i<elements.length;i++){
            elements[i].accept(priceVisitor);
        }
        System.out.println(priceVisitor);

        DurationVisitor durationVisitor = new DurationVisitor();

        for(Element currentElement : elements){
            currentElement.accept(durationVisitor);
        }

        System.out.println(durationVisitor);
    }
}