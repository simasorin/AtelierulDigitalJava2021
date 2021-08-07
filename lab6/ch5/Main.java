package lab6.ch5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static List merge(List<Integer> list1, List<Integer> list2){
        List toReturn = new ArrayList();
        Iterator<Integer> i1 = list1.iterator();
        Iterator<Integer> i2 = list2.iterator();
        Integer current1 = i1.next();
        Integer current2 = i2.next();

        while (i1.hasNext() && i2.hasNext()){
            if(current1.compareTo(current2)<0){
                toReturn.add(current1);
                current1 = i1.next();
            }else{
                toReturn.add(current2);
                current2 = i2.next();
            }
        }

        if(current1.compareTo(current2)<0){
            toReturn.add(current1);
            current1= null;

        }else{
            toReturn.add(current2);
            current2= null;

        }

        while(i1.hasNext()){
            current1=i1.next();
            if(current2!=null && current2.compareTo(current1)<0){
                toReturn.add(current2);
                current2=null;
            }
            toReturn.add(current1);
        }

        while(i2.hasNext()){
            current2 = i2.next();
            if(current1!=null && current1.compareTo(current2)<0){
                toReturn.add(current2);
                current1=null;
            }
            toReturn.add(current2);
        }

        return toReturn;
    }

    public static void main(String[] args) {
        List l1 = Arrays.asList(1,3,4,6,88,99);
        List l2 = Arrays.asList(2,3,4,66,87,999);
        System.out.println(merge(l1,l2));
    }
}