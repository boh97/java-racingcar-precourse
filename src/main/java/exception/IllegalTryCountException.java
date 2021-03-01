package exception;

public class IllegalCountException extends IllegalArgumentException {
    private static final String message = "[ERROR] 시도 횟수는 숫자여야 한다.";

    public static void printErrorMessage() {
        System.out.println(message);
    }
}
