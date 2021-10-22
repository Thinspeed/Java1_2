package com.company;

public class Main {

    public static void main(String[] args) {
        Ball[] balls = new Ball[] { new Ball(Color.Blue, 5), new Ball(Color.Blue, 10), new Ball(Color.Blue, 5), new Ball(Color.Red, 5) };
        Basket basket = new Basket(balls);
        System.out.println(basket.getWeight());
        System.out.println(basket.getCountOfBalls(Color.Blue));
    }
}
