package lab8.consumer;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {
    @Test
    public void consumer_1(){
        List<String> list = new ArrayList<>(Arrays.asList("a","b","c"));

        Consumer<List<String>> consumer = (List<String> l) -> l.clear();
        consumer.accept(list);

        Assert.assertEquals(list, new ArrayList<>());
    }

    @Test
    public void consumer_2(){
        List<String> list1 = new ArrayList<>(Arrays.asList("a","b","c"));
        List<String> list2 = new ArrayList<>(Arrays.asList("a","b","c","First","Second"));
        Consumer<List<String>> c1=list->list.add("First");
        Consumer<List<String>> c2=list->list.add("Second");

        Consumer<List<String>> consumer = c1.andThen(c2);
        consumer.accept(list1);

        Assert.assertEquals(list1,list2);
    }
}