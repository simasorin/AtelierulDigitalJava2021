package lab8.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaEx1 {
    public static void p1(List<String> strings) {
        StringBuilder sb = new StringBuilder();

        strings.forEach(currentString -> sb.append(currentString.charAt(0)));
        System.out.println(sb);
    }

    public static void removeOdd(List<String> strings) {
        //strings.removeIf(item -> item.length()%2!=0);
        strings = strings.stream().filter(item -> item.length() % 2 == 0).collect(Collectors.toList());

        System.out.println(strings);
    }

    public static void replaceWithUpperCase(List<String> strings) {
        strings = strings.stream().map(item -> item.toUpperCase()).collect(Collectors.toList());

        System.out.println(strings);
    }

    public static String combineMap(Map<Integer, String> elements) {
        StringBuilder sb = new StringBuilder();

        String s = elements.entrySet().stream().map(item -> {
            System.out.println("--" + item);
            return item.getKey() + " " + item.getValue();
        }).collect(Collectors.joining(","));

        return s;
    }

    public static void main(String[] args) {
//        List<String> list2 = new ArrayList<>(Arrays.asList("a33","b4fd","cfds","First","Second"));
//        replaceWithUpperCase(list2);

        HashMap elements = new HashMap();
        elements.put(1, "first");
        elements.put(3, "third");
        elements.put(2, "second");

        System.out.println(combineMap(elements));
    }
}