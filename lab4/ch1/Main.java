package lab4.ch1;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("./src/lab4/io/ch1/input.txt");
        System.out.println(phoneBook);
        System.out.println(phoneBook.getNumberByName("Abdul"));
        System.out.println(phoneBook.getNumberByName("Abbey"));
        System.out.println(phoneBook.getNumberByName("Abbey2"));
    }
}