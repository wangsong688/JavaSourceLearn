package cn.codesheep.test.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest{
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("1","2");
        map.put("1","3");
        System.out.println(map.get("1"));
    }
}
