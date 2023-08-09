package Grammar;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;

public class _MapSet {
    public static void main(String[] args) {

        /**
         * Topic: Set interface
         * >>>>>: 순서X -> Index 접근 불가능, iterator을 사용하여 객체 접근 가능, 중복X
         * @ 2023-08-09
         * */

        HashSet<String> names = new HashSet<>();

        names.add("손흥민");
        names.add("김민재");
        names.add("손흥민");
        names.add("이강인");

        //중복 제거하여 출력
        System.out.println(names);

        for(String name : names){
            System.out.println(name);
        }//for

        //문법
        System.out.println(names.contains("손흥민"));
        System.out.println(names.size());

        //삭제 가능하면 true return
        //삭제 불가하면 false return
        System.out.println(names.remove("이강인"));
        System.out.println(names.remove("황희찬"));

        System.out.println(names);

        System.out.println("===============================================");
        /**
         * Topic: Map interface
         * >>>>>: 순서X, 중복X, 중복 데이터O
         * @ 2023-08-09
         * */

        HashMap<Object, Integer> map = new HashMap<>();
        map.put("김상식", 555);
        map.put("박지성", 777);
        map.put("김병지", 666);
        
        //문법
        System.out.println(map.get("박지성"));
        System.out.println(map.containsKey("김병지"));
        System.out.println(map.containsValue(777));
        System.out.println(map.containsValue(444));
        System.out.println(map.size());
        System.out.println(map.remove("김상식"));

    }//main
}//end class
