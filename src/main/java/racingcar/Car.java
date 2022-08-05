package racingcar;

import org.apache.commons.lang3.StringUtils;

import java.util.Random;

public class Car {


    private final String name;
    private int position = 0;

    public Car(final String name) {
        if(StringUtils.isBlank(name)){
            throw new IllegalArgumentException("자동차 이름은 값이 존재해야 합니다.");
        }
        this.name = name.trim();
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void move(MovingStrategy movingStrategy) {
        if(movingStrategy.movable())
            this.position++;
    }


}
