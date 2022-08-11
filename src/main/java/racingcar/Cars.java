package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> findWinners() {

        return getWinners(getMaxPosition());
    }

    private List<Car> getWinners(Position maxPosition) {
        List<Car> winners = new ArrayList<>();

        for (Car car : cars) {
            if (car.getPosition().equals(maxPosition)) {
                winners.add(car);
            }
        }
        return winners;
    }

    private Position getMaxPosition() {
        Position maxPosition = new Position();
        for (Car car : cars) {

            if (car.positionIsBiggerThan(maxPosition)) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }
}
