package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    void move() {

        Car moon = new Car("moon");
        moon.move(new MovingStrategy() {
            @Override
            public boolean movable() {
                return true;
            }
        });
        assertThat(moon.getPosition()).isEqualTo(1);
    }

    @Test
    void stop() {

        Car moon = new Car("moon"){
            @Override
            protected int getRandomNo() {
                return 3;
            }
        };
        moon.move();
        assertThat(moon.getPosition()).isEqualTo(0);
    }
}
