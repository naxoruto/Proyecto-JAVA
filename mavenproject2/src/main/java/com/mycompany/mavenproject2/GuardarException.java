
package com.mycompany.mavenproject2;

public class GuardarException extends Exception {

    public GuardarException(String message, Throwable cause) {
        super(message, cause);
    }

    public GuardarException(String message) {
        super(message);
    }
}

