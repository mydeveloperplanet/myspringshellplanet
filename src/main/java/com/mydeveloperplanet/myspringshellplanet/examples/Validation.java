package com.mydeveloperplanet.myspringshellplanet.examples;

import jakarta.validation.constraints.Size;

import org.springframework.shell.command.annotation.Command;

@Command(group = "Validation")
public class Validation {

    @Command
    public String validateName(@Size(min = 2, max = 40, message = "Name must be between 2 and 40 characters long") String name) {
        return "Hello " + name + "!";
    }

}
