package exception;

public class IllegalTryCountException extends IllegalArgumentException {
    private static final String INT_ERROR_MESSAGE = "[ERROR] 시도 횟수는 0이상이여야 한다.";
    private static final String NOT_INT_ERROR_MESSAGE = "[ERROR] 시도 횟수는 숫자여야 합니다.";

    private static String errorCase;

    public IllegalTryCountException(String errorCase) {
        IllegalTryCountException.errorCase = errorCase;
    }

    public String getErrorMessage() {
        if (errorCase.equals("INT_ERROR")){
            return INT_ERROR_MESSAGE;
        }

        return NOT_INT_ERROR_MESSAGE;
    }

    public void printErrorMessage() {
        System.out.println(getErrorMessage());
    }
}
