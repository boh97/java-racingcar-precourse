package exception;

public class IllegalNameLengthException extends IllegalArgumentException {
    private static final String MIN_ERROR_MESSAGE = "[ERROR] 이름은 1자 이상이여야 합니다.";
    private static final String MAX_ERROR_MESSAGE = "[ERROR] 이름은 5자 이하여야 합니다.";

    private static String errorCase;

    public IllegalNameLengthException(String errorCase) {
        IllegalNameLengthException.errorCase = errorCase;
    }

    public String getErrorMessage() {
        if (errorCase.equals("MAX_ERROR")) {
            return MAX_ERROR_MESSAGE;
        }

        return MIN_ERROR_MESSAGE;
    }

    public void printErrorMessage() {
        System.out.println(getErrorMessage());
    }
}
