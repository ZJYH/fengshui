package com.zh.fengshui.Test;

public class test {


    volatile int n =0;
    public void add(){
        this.n=60;
    }
    public void add1(){
        n++;
    }
    private static final String Package ="com.pec.erp.dynamigrate.";

    public int getN() {
        return n;
    }
}
class VolatileDemo{
    public static void main(String[] args) {
        test t1 =new test();


        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j <1000 ; j++) {
                        t1.add1();
                    }
                }
            }).start();
        }

        while (Thread.activeCount()>2){
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+"n:"+t1.getN());
//        new Thread(() ->{
//            System.out.println("come in"+t1.getN());
//            t1.add();
//            System.out.println("完成"+t1.getN());
//        },"aaa"
//        ).start();
//        while (t1.getN()==0){
//        }
//        System.out.println("sad-----asd"+t1.getN());
    }
}