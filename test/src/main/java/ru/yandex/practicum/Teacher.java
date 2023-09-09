package ru.yandex.practicum;

public class Teacher {
    boolean isGlass;

    public String startLesson() {
        return "Достаём учебники!";
    }
}

class GeographyTeacher extends Teacher {
    //@Override
    //boolean isGlass = true;

    @Override
    public String startLesson() {
        if (!isGlass) {
            return "Достаём глобусы!";
        } else {
            return "Бухаем!";
        }
    }
}
    class Practicum10 {
        public static void main(String[] args) {
            // создали объект подкласса
            GeographyTeacher teacher = new GeographyTeacher();
            // вызываем метод подкласса
            System.out.println("Урок начнётся с фразы : " + teacher.startLesson());
            // создали объект подкласса
            teacher.isGlass = false;
            // вызываем метод подкласса
            System.out.println("Урок начнётся с фразы : " + teacher.startLesson());
        }

    }
