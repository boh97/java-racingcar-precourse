package controller;

import racingcar.Car;

import java.util.ArrayList;
import java.util.List;

public class RankController {
    private static final List<Car> winnerList = new ArrayList<>();

    private RankController() { }

    public static List<Car> getWinnerList(List<Car> carList) {
        for (Car car : carList) {
            if (car.getPosition() >= getWinnerPosition(carList)) {
                winnerList.add(car);
            }
        }

        return winnerList;
    }

    public static int getWinnerPosition(List<Car> carList) {
        int maxPosition = 0;
        for (Car car : carList) {
            if (car.getPosition() > maxPosition) {
                maxPosition = car.getPosition();
            }
        }

        return maxPosition;
    }
}
