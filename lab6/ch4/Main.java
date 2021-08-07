package lab6.ch4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List elements = Arrays.asList(1,4,2,3,5,76,56,33,77);
        Collections.sort(elements);
        System.out.println(elements);

        List newList = new ArrayList();
        int n = elements.size();
        for(int i=0;i<=n/2 && i<=n-i-1;i++){
            if(n%2==1 && i==n/2){
                System.out.print(elements.get(i)+" ");
            }else{
                System.out.print(elements.get(i)+" ");
                System.out.print(elements.get(n-i-1)+" ");

            }
        }
    }
}