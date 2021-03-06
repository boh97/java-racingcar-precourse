package racingcar;
import java.util.ArrayList;
import java.util.List;

public class CarList {
    private static List<Car> carList = new ArrayList<>();

    public void addCarList(Car car) {
        carList.add(car);
    }
}
