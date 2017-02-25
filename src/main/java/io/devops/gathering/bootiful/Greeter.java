package io.devops.gathering.bootiful;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Greeter implements CommandLineRunner {

    @Value("${greeter.name}")
    private String name;

    @Override
    public void run(String... args) throws Exception {
        greet();
    }

    private void greet() {
        System.out.println("##################");
        System.out.printf("Hello %s!\n", name);
        System.out.println("##################");
    }
}
