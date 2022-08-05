package racingcar;

import java.util.Random;

public class RandomMovingStrategy implements MovingStrategy{

    private static final int FORWARD_NUM = 4;
    private static final int MAX_BOUND = 10;


    @Override
    public boolean movable() {
        return getRandomNo() >= FORWARD_NUM;
    }

    //private -> protected 메소드 시그니처 변경하지 않고 테스트 가능한 구조로 변경
    private int getRandomNo() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }
}
