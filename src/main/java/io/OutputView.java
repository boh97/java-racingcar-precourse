package io;

import controller.MovementController;
import controller.RankController;
import jdk.internal.joptsimple.internal.Strings;
import racingcar.Car;

import java.util.List;

public class OutputView {
    private static final String EXECUTE_RESULT = "실행결과";
    private static final String FINAL_WINNER_MESSAGE = "최종 우승자: ";

    private OutputView() { }

    public static void printSectionResult(List<Car> carList) {
        for (Car car : carList) {
            System.out.print(car.getName() + " : ");
            for (int i = 0; i < car.getPosition(); i++) {
                System.out.print('-');
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printWholeResult(List<Car> carList, int tryCount) {
        System.out.println(EXECUTE_RESULT);

        for (int i = 0; i < tryCount; i++) {
            MovementController.moveOrNot(carList);
            printSectionResult(carList);
        }
    }

    public static void printRankResult(List<Car> carList) {
        List<Car> winnerList = RankController.getWinnerList(carList);

        System.out.print(FINAL_WINNER_MESSAGE);
        for (int i = 0; i < winnerList.size() - 1; i++) {
            System.out.print(winnerList.get(i) + ", ");
        }

        System.out.println(winnerList.get(winnerList.size() - 1));
    }
}
