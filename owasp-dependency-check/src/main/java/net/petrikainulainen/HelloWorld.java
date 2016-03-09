package net.petrikainulainen;

import static com.google.common.base.Preconditions.checkArgument;

public class HelloWorld {

    public static void main(String[] args) {
        String hello = "hello world";
        checkArgument(hello != null && !hello.isEmpty(), "Expected non-null or non-empty string");
        System.out.println(hello);
    }
}
