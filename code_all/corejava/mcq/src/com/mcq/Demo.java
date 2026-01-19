package com.mcq;
class Demo {
    Demo(){
        System.out.println("inside ctr");
    }
     static Demo d = new Demo();
    public static void main(String[] args){
        new Demo();
    }
}