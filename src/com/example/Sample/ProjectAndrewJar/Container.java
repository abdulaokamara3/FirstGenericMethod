package com.example.Sample.ProjectAndrewJar;

public class Container <T1,T2>{
    T1  item1 ;
     T2  item2;

    public Container(T1 item1, T2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public T1 getItem1() {
        return item1;
    }

    public T2 getItem2() {
        return item2;
    }
    public void printItem(){
        System.out.println("print content of container: ");
        System.out.println("Item 1: " + item1);
        System.out.println("Item 2: " + item2);
    }
}
