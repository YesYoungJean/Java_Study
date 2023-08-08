package Grammar;

import java.util.ArrayList;

public class _ArrayArrayList {
    public static void main(String[] args) {
        /**
         * Topic: Array / ArrayList
         * >>>>>: Array와 ArrayList에 대해 정확히 되짚어보자
         * @ 2023-08-08
         * */

        /*
        * Array(배열)
        * 1. 초기화 시 사이즈 고정 (변경 불가)
        * 2. 초기화 시 메모리에 할당되어 ArrayList보다 속도 빠름
        * 3. 다차원 가능
        * */

        String[] stringArr = new String[3];
        stringArr[0] = "손흥민";
        stringArr[1] = "김민재";
        stringArr[2] = "이강인";
//        >>> ArrayIndexOutOfBoundsException error invoked.
//        stringArr[3] = "황희찬";

        for(String tmp : stringArr){
            System.out.println(tmp);
        }//for

        /*===========================================================*/
        /*
         * ArrayList
         * 1. 초기화 시 사이즈 표기X (크기 가변적)
         * 2. 데이터 추가/삭제 시 메모리를 재할당하기에 Array(배열)보다 속도가 느림
         * 3. 추가/삭제 가능 (add(), remove())
         * 4. 다차원 불가능
         * */

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("홀란드");
        strArrayList.add("김덕배");
        strArrayList.add("과르디올라");
        strArrayList.add("디아스");
        strArrayList.remove("과르디올라");

        //해당 데이터가 없을 경우 변동 無
        strArrayList.remove("스털링");
        System.out.println(strArrayList);

        for(String name : strArrayList){
            System.out.println(name);
        }//for

    }//main
}//end class
