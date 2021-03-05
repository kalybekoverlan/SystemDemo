package com.erik;

public class SystemDemo {

    public static void main(String[] args) {
       long start,end;
       start=System.currentTimeMillis();
       for (long i=0;i<1000000;i++){
       }
       end=System.currentTimeMillis();
       System.out.println("Time spended for cycle : "+(end-start));

    }
}
