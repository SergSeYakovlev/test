package ru.yandex.practicum;

public class Lesson10from10 {
    private double age;
    private boolean isFly;

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public Lesson10from10(double age, boolean isFly) {
        this.age = age;
        this.isFly = isFly;
    }

    public String say(){
        return "Бу!";
    }
}

class GhostShip extends Lesson10from10 {
    public GhostShip(double age, boolean isFly) {
        super(age, isFly);
    }

    @Override
    public String say() {
        return super.say();
    }

}