package racingcar;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void findWinners() {
        Car code = new Car("code", 2);
        Car mate = new Car("mate", 2);
        Car moon = new Car("moon", 3);
        code.move(()->true); // 3 (위치)
        mate.move(()->false); // 2
        moon.move(()->false); // 3


        Cars carList = new Cars(Arrays.asList(code, mate, moon));
        assertThat(carList.findWinners()).containsExactly(code, moon);
    }
}
