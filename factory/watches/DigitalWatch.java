package patternsP.factory.watches;

import java.util.Date;

public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}