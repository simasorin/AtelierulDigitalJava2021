package FinalProject;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Creating object using Builder pattern
        Student student1 = new Student.StudentBuilder("Sorin", "Sima")
                .age(22)
                .phone("0744444444")
                .address("Street1")
                .language(Arrays.asList("romanian","english"))
                .build();
        System.out.println(student1);

        // We can create object without all the optional parameters
        Student student2 = new Student.StudentBuilder("George", "Pop")
                .age(25)
                .phone("0733333333")
                //no address
                .language(Arrays.asList("chinese"))
                .build();
        System.out.println(student2);

        Student student3 = new Student.StudentBuilder("Florin", "Popescu")
                //no age
                //no phone
                //no address
                //no language
                .build();
        System.out.println(student3);
    }
}

