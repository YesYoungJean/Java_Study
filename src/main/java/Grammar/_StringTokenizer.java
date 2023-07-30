package Grammar;

import java.util.StringTokenizer;
public class _StringTokenizer {

    public static void main(String[] args) {
        /**
         * Topic: StringTokenizer
         * >>>>>: 구분자를 이용하여 문자열을 분리하는 클래스
         * @ 2023-07-30
         * */


        //분리 대상 String
        String str = "손흥민!이강인!김민재";
        String sep = "!";
        StringTokenizer st1 = new StringTokenizer(str, sep);
        StringTokenizer st2 = new StringTokenizer(str, sep, true);

        //실습
        System.out.println("-----sep not included-----");
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }//while

        System.out.println("-----sep included-----");
        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }//while

    }//main end
}
