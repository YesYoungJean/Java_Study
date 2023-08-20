package oop;

public class TvTest2 {
    public static void main(String[] args) {

        Tv t1 = new Tv();
        Tv t2 = new Tv();

        /**
         * 1. 기본값으로 초기화 (null, flase, 0)
         * */
        System.out.println("1_channel of t1: " + t1.channel);
        System.out.println("1_channel of t2: " + t2.channel);

        //★t2는 t1이 참조하고 있는 인스턴스의 주소를 같이 참조하게 함(t2는 GC가 처리)
        t2 = t1;
        t1.channel = 7;

        System.out.println("2_channel of t1: " + t1.channel);
        System.out.println("2_channel of t2: " + t2.channel);

    }//main
}//end class
