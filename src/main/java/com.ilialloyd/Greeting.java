package com.ilialloyd;

//if you want to use interface only for lambdas, it isa better practise to use this annotation
//to let everyone know that this is for lambda function,
@FunctionalInterface
public interface Greeting {
    public void perform();
}
