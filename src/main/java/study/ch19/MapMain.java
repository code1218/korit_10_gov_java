package study.ch19;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(10, "aaa");
        userMap.put(200, "bbb");
        userMap.put(3000, "ccc");
        userMap.put(40000, "ddd");
        System.out.println(userMap);
        System.out.println(userMap.get(3000));

        List<Map.Entry<Integer, String>> userEntries = new ArrayList<>(userMap.entrySet());
        System.out.println(userEntries.get(0).getValue());

        for (Map.Entry<Integer, String> entry : userMap.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
