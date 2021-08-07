package lab4.ch1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PhoneBook {
    private Contact[] contacts = new Contact[10];
    private int count=0;

    public PhoneBook(String inputFile){
        try{
            Contact contact;
            String name, number;
            Scanner s = new Scanner((new BufferedReader(new FileReader(inputFile))));
            while(s.hasNext()){
                name = s.next();

                if(s.hasNext()){
                    number = s.next();
                    contact= new Contact(name, number);
                    contacts[count] = contact;
                    count++;
                }
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        String toReturn = "";

        for(int i=0;i<count;i++){
            toReturn += "\n"+contacts[i];
        }

        return toReturn;
    }

    public String getNumberByName(String name){
        for(int i=0;i<count;i++){
            if(contacts[i].getName().equals(name)){
                return contacts[i].getPhoneNumber();
            }
        }
        return null;
    }
}