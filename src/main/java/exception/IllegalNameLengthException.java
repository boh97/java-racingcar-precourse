package exception;

public class IllegalMaxLengthException extends IllegalArgumentException implements IIllegalLengthException{
    private static final String message = "[ERROR] 이름은 5자 이하여야 합니다.";

    public void printErrorMessage() {
        System.out.println(message);
    }
}
