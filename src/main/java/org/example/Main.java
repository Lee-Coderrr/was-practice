package org.example;

import java.io.IOException;

// GET /calculator?operand1=10&operand2=50&operator=*
public class Main {
    public static void main(String[] args) throws IOException {
        new CustomWebApplicationServer(8080).start();
    }
}