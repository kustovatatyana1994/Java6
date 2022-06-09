package ru.netology.sqr;

public class SQRService {
    public int squareNumber(int lowerBoundRange, int upperBoundRange) {

        int number = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerBoundRange && i * i <= upperBoundRange) {
                number = number + 1;
            }
        }
        return number;
    }
}
