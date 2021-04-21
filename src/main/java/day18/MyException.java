package day18;

public class MyException extends Exception {
    String message;

    MyException(String message) {
        this.message = message;
    }
}
