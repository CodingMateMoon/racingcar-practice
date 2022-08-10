package racingcar;

import java.util.Objects;

public class Position {
    private int position;

    public Position(int position) {
        if (position < 0) {
            throw new IllegalArgumentException();
        }
        this.position = position;
    }

    public Position() {
        this(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    /* immutable 객체 -> mutable 객체. garbage collection 성능 이슈가 생기는 경우 불변객체에서 가변객체로 변환
    public Position move() {
        this.position++;
        return new Position(this.position + 1);
    }
     */

    public Position move() {
        this.position++;
        return this;
    }
}
