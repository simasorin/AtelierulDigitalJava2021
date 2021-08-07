package FinalProject;

import java.util.List;

// Builder Design Pattern
// "The builder pattern, is an alternative way to construct complex objects.
// This should be used only when you want to build different immutable objects using same object building process."

// First we create a public static nested class which has all the instance attributes from the outer class
public class Student {
    // In the Student class, we have 2 required parameters, and 4 optional(we can add more if we want)
    private final String firstName; // required
    private final String lastName; // required

    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional
    private final List<String> language; // optional

    // We create a private constructor to create its object from build() and to prevent outsider to access constructor
    private Student(StudentBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
        this.language = builder.language;
    }

    // Object does not have any setter method, so it’s state can not be changed once it has been built
    // We use this to provide immutability
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public List<String> getLanguage() {
        return language;
    }

    // Override toString method to return values of the object
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", language=" + language +
                '}';
    }

    // Builder class will have exactly same set of fields as original class
    // the required parameters are final because we don't want to change it's value and optional parameters are not
    public static class StudentBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;
        private List<String> language;

        // Create a constructor for requested attributes
        public StudentBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Builder class will have all the methods for adding student optiional attributes
        // Each method return same Builder object
        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder language(List<String> language) {
            this.language = language;
            return this;
        }

        //Return the finally constructed Student object
        public Student build() {
            Student student = new Student(this);
            return student;
        }
    }
}

