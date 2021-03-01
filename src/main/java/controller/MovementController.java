package controller;

import racingcar.Car;
import utils.RandomUtils;

import java.util.List;

public class MovementController {
    private MovementController() { }

    public static void moveOrNot(List<Car> carList) {
        for (Car car : carList) {
            int raceNumber = RandomUtils.nextInt(0, 9);
            if (raceNumber >= 4) {
                car.moveForward();
            }
        }
    }
}
