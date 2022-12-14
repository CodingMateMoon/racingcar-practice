package racingcar;

public class Car {


    //    private final String name;
    private final Name name;
    private Position position;
    private int positionBefore = 0;

    /*
    public Car(final String name) {
        if(StringUtils.isBlank(name)){
            throw new IllegalArgumentException("자동차 이름은 값이 존재해야 합니다.");
        }
        this.name = name.trim();
        this.position = new Position();
    }
     */

    public Car(String name) {

        this.name = new Name(name);
        this.position = new Position(0);
    }

    public Car(String name, int position) {

        this.name = new Name(name);
        this.position = new Position(position);
    }

    public int getPositionBefore() {
        return positionBefore;
    }

    public Name getName() {
        return name;
    }

    public void move(MovingStrategy movingStrategy) {
        if (movingStrategy.movable())
            position.move();
    }


    public Position getPosition() {
        return this.position;
    }

    public boolean positionIsBiggerThan(Position maxPosition) {
        return position.isBiggerThan(maxPosition);
    }
}
