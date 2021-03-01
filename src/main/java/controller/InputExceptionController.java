package controller;

import exception.DuplicatedNameException;
import exception.IllegalNameLengthException;
import exception.IllegalTryCountException;
import utils.ValidationUtils;

public class InputExceptionController {
    private InputExceptionController() { }

    public static boolean isValidatedName(String[] nameArray) {
        try {
            ValidationUtils.checkValidatedName(nameArray);
            return true;
        } catch (IllegalNameLengthException e) {
            e.printErrorMessage();
        }

        return false;
    }

    public static boolean isDuplicatedName(String[] nameArray) {
        try {
            ValidationUtils.checkDuplicatedName(nameArray);
            return false;
        } catch (DuplicatedNameException e) {
            e.printErrorMessage();
        }

        return true;
    }

    public static boolean isValidatedTryCount(String tryCount) {
        try {
            ValidationUtils.checkValidatedTryCount(tryCount);
            return true;
        } catch (IllegalTryCountException e) {
            e.printErrorMessage();
        }

        return false;
    }
}
