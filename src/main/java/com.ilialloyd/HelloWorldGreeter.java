package com.ilialloyd;

public class HelloWorldGreeter implements Greeting{
    @Override
    public void perform() {
        System.out.println("Hello World");
    }
}
