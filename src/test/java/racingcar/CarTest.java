package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    void move() {

        Car moon = new Car("moon", 2);
        /* 인터페이스를 구현한 익명클래스를 람다로 변경. 함수형 인터페이스의 구현체를 인자로 전달
        moon.move(new MovingStrategy() {
            @Override
            public boolean movable() {
                return true;
            }
        });
        */
        moon.move(()->true);
        assertThat(moon.getPosition()).isEqualTo(new Position(1));
    }

    @Test
    void stop() {

        Car moon = new Car("moon", 2);
        moon.move(()->false);
        assertThat(moon.getPosition()).isEqualTo(new Position());
    }
}
