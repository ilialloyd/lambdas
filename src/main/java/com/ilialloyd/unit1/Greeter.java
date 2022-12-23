package com.ilialloyd.unit1;

public class Greeter {
    public void greet(Greeting greeting) {
        //  System.out.println("Hello World");
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeter helloWorldGreeter = new HelloWorldGreeter();
        MuslimGreeting mg = new MuslimGreeting();
        greeter.greet(mg);

        MyLambda myLambdaFunction = () -> System.out.println("Hey Ilham");



        Greeting lambdaGreeting = () -> System.out.println("Greeting from Lambda ");

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Greeting from Inner Class\n");
            }
        };

        greeter.greet(innerClassGreeting);
        greeter.greet(lambdaGreeting);




    }
}

