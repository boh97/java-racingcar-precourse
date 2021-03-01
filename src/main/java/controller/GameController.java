package controller;

import io.InputView;
import io.OutputView;
import racingcar.Car;
import utils.ValidationUtils;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private GameController() {}

    public static void run() {
        List<Car> carList = InputView.getValidatedCarList();
        int tryCount = InputView.getValidatedTryCount();

        OutputView.printWholeResult(carList, tryCount);
        OutputView.printRankResult(carList);
    }
}
