package com.mydeveloperplanet.myspringshellplanet.examples;

import org.springframework.shell.command.annotation.Command;
import org.springframework.shell.command.annotation.Option;

@Command(group = "Options")
public class Options {

    @Command
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    @Command
    public String helloNameDefault(@Option(defaultValue = "World") String name) {
        return "Hello " + name + "!";
    }

    @Command
    public String helloNameOption(@Option String name) {
        if (name == null) {
            return askForName();
        }

        return "Hello " + name + "!";
    }

    private String askForName() {
        System.out.print("Please enter a name: ");
        return helloNameOption(System.console().readLine());
    }

}
