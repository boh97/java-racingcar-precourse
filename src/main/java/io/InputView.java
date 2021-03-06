package io;

import controller.InputExceptionController;
import racingcar.Car;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class InputView {
    private static final String INPUT_CAR_NAMES_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 분리됩니다.";
    private static final String INPUT_TRY_COUNT_MESSAGE = "시도할 횟수는 몇회인가요?";

    private static final Scanner scanner = new Scanner(System.in);

    private InputView() { }

    public static String getStringCarNames() {
        System.out.println(INPUT_CAR_NAMES_MESSAGE);

        return scanner.nextLine();
    }

    public static String[] getValidatedCarNameArray() {
        String[] carNameArray = getStringCarNames().split(",");

        while (InputExceptionController.isDuplicatedName(carNameArray)
                || !InputExceptionController.isValidatedName(carNameArray)) {
            getValidatedCarNameArray();
        }

        return carNameArray;
    }

    public static List<Car> getValidatedCarList() {
        List<Car> carList = new ArrayList<>();

        for (String carName : getValidatedCarNameArray()) {
            carList.add(new Car(carName));
        }

        return carList;
    }

    public static String getTryCount() {
        System.out.println(INPUT_TRY_COUNT_MESSAGE);

        return scanner.next();
    }

    public static int getValidatedTryCount() {
        String tryCount = getTryCount();

        while (!InputExceptionController.isValidatedTryCount(tryCount)) {
            getValidatedTryCount();
        }

        return Integer.parseInt(tryCount);
    }
}
