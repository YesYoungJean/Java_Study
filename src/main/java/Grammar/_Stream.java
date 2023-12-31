package Grammar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _Stream {
    public static void main(String[] args) {
        /**
         * Topic: Stream
         * >>>>>: Collection에 저장된 element를 하나씩 순회하면서 람다식으로 처리할 수 있도록 해주는 반복자
         * @ 2023-08-04
         * */

        //그렇다면 stream은 왜 사용할까?
        //>>> 1) 가독성 by Lambda &&
        //>>> 2) Collection으로 넘겨 병렬 처리 가능
        List<String> list = Arrays.asList("a", "b", "c");
        //Stream 객체 생성
        Stream<String> stream = list.stream();
        stream.forEach(apb -> System.out.println(apb));


    }//main
}//end class
