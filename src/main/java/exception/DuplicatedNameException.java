package exception;

public class DuplicatedNameException extends IllegalArgumentException{
    private static final String ERROR_MESSAGE = "[ERROR] 이름은 중복될 수 없습니다.";

    public void printErrorMessage() {
        System.out.println(ERROR_MESSAGE);
    }
}
