package utils;

import exception.DuplicatedNameException;
import exception.IllegalNameLengthException;
import exception.IllegalTryCountException;

import java.util.Arrays;

public class ValidationUtils {
    private ValidationUtils() { }

    public static void checkValidatedName(String[] names) {
        for (String name : names) {
            if (name.length() > 5) {
                throw new IllegalNameLengthException("MAX_ERROR");
            } else if (name.length() == 0) {
                throw new IllegalNameLengthException("MIN_ERROR");
            }
        }
    }

    public static void checkDuplicatedName(String[] nameArray) {
        String[] arrays = new String[nameArray.length];
        arrays[0] = nameArray[0];
        for(int i = 1; i < nameArray.length; i++) {
            if (Arrays.asList(arrays).contains(nameArray[i])) {
                throw new DuplicatedNameException();
            }
            arrays[i] = nameArray[i];
        }
    }

    public static void checkValidatedTryCount(String tryCount) {
        if (Integer.parseInt(tryCount) <= 0) {
            throw new IllegalTryCountException("INT_ERROR");
        }

        for (int i = 0; i < tryCount.length(); i++) {
            if (!Character.isDigit(tryCount.charAt(i))) {
                throw new IllegalTryCountException("NOT_INT_ERROR");
            }
        }
    }



}
