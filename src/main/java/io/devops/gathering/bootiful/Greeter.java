package io.devops.gathering.bootiful;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Greeter implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        greet();
    }

    private void greet() {
        System.out.println("##################");
        System.out.println("Hello World!");
        System.out.println("##################");
    }
}
