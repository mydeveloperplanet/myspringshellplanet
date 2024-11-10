package com.mydeveloperplanet.myspringshellplanet.examples;

import org.springframework.shell.command.annotation.Command;

@Command(group = "Group Commands")
public class GroupCommands {

    @Command()
    public String helloWorldGroup() {
        return "Hello World Group!";
    }

}
