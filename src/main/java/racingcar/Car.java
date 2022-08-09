package racingcar;

import org.apache.commons.lang3.StringUtils;

public class Car {


    private final String name;
    private Position position;
    private int positionBefore = 0;


    public Car(final String name) {
        if(StringUtils.isBlank(name)){
            throw new IllegalArgumentException("자동차 이름은 값이 존재해야 합니다.");
        }
        this.name = name.trim();
        this.position = new Position();
    }

    public int getPositionBefore() {
        return positionBefore;
    }

    public String getName() {
        return name;
    }

    public void move(MovingStrategy movingStrategy) {
        if(movingStrategy.movable())
            position.move();
    }


    public Position getPosition() {
        return this.position;
    }
}
