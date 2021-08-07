package lab3.visitor;

public interface Visitor {
    void visit(Video v);
    void visit(Book book);
    void visit(Audio audio);
}