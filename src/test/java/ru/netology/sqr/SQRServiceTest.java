package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {


    @Test

    public void testSeveralNumbersUnderLimit() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.squareNumber(200, 300);

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void testOneNumbersUnderLimit() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.squareNumber(200, 250);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testNoNumbersUnderLimit() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.squareNumber(200, 220);

        Assertions.assertEquals(expected, actual);
    }
}