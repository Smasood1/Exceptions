package Exceptions;

import java.io.File;
import java.io.IOException;

public class ThrowingExceptions {

    public static void main(String[] args) throws IOException {
        createNewFileRethrow();
    }

    private static void createNewFileRethrow() throws IOException {
        File file = new File("resources/nonexistant.txt");
        file.createNewFile();
    }
}
