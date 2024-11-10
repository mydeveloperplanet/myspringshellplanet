package com.mydeveloperplanet.myspringshellplanet.examples;

import org.springframework.shell.command.annotation.Command;

@Command
public class HelloWorld {

    @Command(description = "This command will say hello.")
    public String helloWorld() {
        return "Hello World!";
    }

}
