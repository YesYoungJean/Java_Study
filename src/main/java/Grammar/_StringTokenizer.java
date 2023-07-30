package Grammar;

import java.util.StringTokenizer;
public class _StringTokenizer {

    public static void main(String[] args) {
        /**
         * Topic: StringTokenizer
         * >>>>>: 구분자를 이용하여 문자열을 분리하는 클래스
         * @ 2023-07-30
         * */
        /*
        * 정의
        * java.util 패키지에 존재하는 StringTokenizer 클래스로,
        * 문자열을 특정 구분 기호를 기준으로 분할하며,
        * 분할된 문자열을 토큰(Token)이라 함
        * */

        /*
        * 생성자
        * 1) StringTokenizer(String str) : 지정된 문자열로 StringTokenizer 생성
        * 2) StringTokenizer(String str, String delim) : 지정된 문자열, 구분 기호로 StringTokenizer 생성
        * 3) StringTokenizer(String str, String delim, boolean returnValue) :
        *       지정된 문자열, 구분 기호, returnValue로 StringTokenizer를 만듦
        *       리턴값이 true면 구분 문자는 토큰으로 간주
        *       false면 구분 기호는 토큰을 구분하는 역할
        * */

        /*
        * 메서드
        * 1) boolean hasMoreTokens() : 사용 가능한 토큰이 더 있는지 확인
        * 2) String nextToken() : StringTokenizer 객체에서 다음 토큰을 리턴
        * 3) Object nextElement() : nextToken()과 동일하지만 리턴 타입은 Object
        * 4) String nextToken(String delim) : 구분 기호를 기반으로 다음 토큰을 리턴
        * 5) int countTokens() : 총 토큰 수를 반환
        * */


        //실습
        //분리 대상 String
        String str = "손흥민!이강인!김민재";
        String sep = "!";

        //1-1. 구분자 미포함 문자열 분리
        StringTokenizer st1 = new StringTokenizer(str, sep);

        System.out.println("-----sep not included-----");
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }//while

        //1-2. 구분자 포함 문자열 분리
        StringTokenizer st2 = new StringTokenizer(str, sep, true);

        System.out.println("-----sep included-----");
        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }//while

    }//main end
}//end class
