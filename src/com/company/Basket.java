package com.company;

public class Basket {

    private Ball[] balls;
    private int count;

    public Basket() {
        count = 0;
        balls = new Ball[0];
    }

    public Basket(Ball[] balls) {
        this.balls = balls.clone();
    }

    public void add(Ball ball) {
        if (count == balls.length) {
            Ball[] temp = new Ball[count == 0 ? 8 : count * 2];
        }

        balls[count] = ball;
        count++;
    }

    public int getWeight() {
        int weight = 0;
        for (int i = 0; i < balls.length; i++) {
            weight += balls[i].wieght;
        }

        return weight;
    }

    public int getCountOfBalls(Color color) {
        if (color == null) {
            return count;
        }

        int result = 0;
        for (int i = 0; i < balls.length; i++) {
            if (balls[i].color == color) {
                result++;
            }
        }

        return result;
    }
}
