package lab3.visitor;

public class DurationVisitor implements Visitor {
    private float totalTime;

    @Override
    public void visit(Video v) {
        totalTime += v.getMinutes();
    }

    @Override
    public void visit(Book book) {
        totalTime += book.getNumberOfPages() * 4;

    }

    @Override
    public void visit(Audio audio) {
        totalTime += audio.getMinutes();
    }

    @Override
    public String toString(){
        return "Total time = " + totalTime;
    }
}