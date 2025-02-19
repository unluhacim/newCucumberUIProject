package example;


import study.Parent;


public class Child extends Parent {
    public static void main(String[] args) {
        Child obj=new Child();
        int b=obj.a;
        System.out.println(b);
    }
}
