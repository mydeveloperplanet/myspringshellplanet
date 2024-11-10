package com.mydeveloperplanet.myspringshellplanet.examples;

import jakarta.validation.ConstraintViolation;

import org.springframework.core.annotation.Order;
import org.springframework.shell.ParameterValidationException;
import org.springframework.shell.command.CommandExceptionResolver;
import org.springframework.shell.command.CommandHandlingResult;

@Order(0)
public class CustomExceptionResolver implements CommandExceptionResolver {

    @Override
    public CommandHandlingResult resolve(Exception ex) {
        if (ex instanceof ParameterValidationException pve) {
            return handleConstraintViolation((pve));
        }
        return null; // Let other exception handlers deal with other types of exceptions
    }

    private CommandHandlingResult handleConstraintViolation(ParameterValidationException pve) {
        StringBuilder errorMessage = new StringBuilder("Validation error(s):\n");
        for (ConstraintViolation<?> violation : pve.getConstraintViolations()) {
            errorMessage.append("- ")
                        .append(violation.getMessage())
                        .append("\n");
        }
        return CommandHandlingResult.of(errorMessage.toString());
    }
}