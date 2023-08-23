package Grammar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _ListToMap {
    public static void main(String[] args) {

        /**
         * RI에서 헷갈렸던 List > Map 형 변환 과정 복습
         * */

        List<Item> list = new ArrayList<>();
        list.add(new Item(1, "first"));
        list.add(new Item(2, "second"));
        list.add(new Item(3, "third"));

        HashMap<Integer, String> map = new HashMap<>();
        for (Item item : list) {
            System.out.println(item.getId() + " : " + item.getValue());
            map.put(item.getId(), item.getValue());
        }

        System.out.println("Map: " + map);

    }//main

    public static class Item {
        private int id;
        private String value;
        public Item(int id, String value) {
            this.id = id;
            this.value = value;
        }

        public int getId() {
            return id;
        }

        public String getValue() {
            return value;
        }
    }//Item
}//end class