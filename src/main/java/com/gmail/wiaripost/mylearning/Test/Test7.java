package com.gmail.wiaripost.mylearning.Test;

public class Test7 {
    int x = 23;

    interface A {
        void method2(int y);
    };

    class InnerClass {
        int x = 10;

        public void method1(int x) {

            A a = z -> {
                System.out.println("z=" + z);

                // можем обратиться к параметру method1,
                // так как он final по действию,
                // то есть его значение не меняется.
                System.out.println("x=" + x);

                System.out.println("this.x=" + this.x);
                System.out.println("LambdaScopeTest.this.x="
                        + Test7.this.x);
            };

            a.method2(x);
        }
    }

    public static void main(String[] args) {
        Test7 lsc = new Test7();
        Test7.InnerClass ic = lsc.new InnerClass();
        ic.method1(44);
    }
}