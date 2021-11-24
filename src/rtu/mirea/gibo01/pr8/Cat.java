package rtu.mirea.gibo01.pr8;

import java.util.Date;

public class Cat {
    private Date lastMeowDate;

    public Cat(int age, String name) {
        super(age, name);
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "lastMeowDate=" + lastMeowDate +
                '}';
    }

    @Override
    public String getType() {
        return "This is Cat";
    }
    public String meow() {
        lastMeowDate = new Date();
        return "Meow";
    }
}
