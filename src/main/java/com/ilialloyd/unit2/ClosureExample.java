package com.ilialloyd.unit2;

public class ClosureExample {
    public static void main(String[] args) {
        int a = 10;
        //if you use variable inside inner anonymous class it meant to be final or effective final
        int d =20;

        System.out.println("With Java 7 feature");
      doProcess(a, new Process() {
          @Override
          public void process(int i) {
              System.out.println(i+d);
          }
      });

        System.out.println("With Java 8 Lambda feature");
        doProcess(a, i -> System.out.println(i+d));

    }

    public static void doProcess(int i, Process p){
        p.process(i);
    }

}

interface Process{
    void process(int i);
}