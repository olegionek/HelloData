package com.Chapter7;
// Двигатель
class Engine {
    public void start(){} // включить
    public void rev(){} // переключить
    public void stop(){}// выключить
    public void service() {    // обслуживание
        System.out.println("Проведено обслуживание двигателя.");
    }
}
// колесо
class Wheel {
    public int inflate(int psi) {
        System.out.println("Накачано давление, равное: "+ psi + " psi.");
        return psi;
    } // накачать
}
//окно
class Window {
    public void rollup() {} // открыть
    public void rolldown() {} // закрыть
}
// Дверь машины
class Door {
    public Window window = new Window(); // окно двери
    public void open() {} // открыть
    public void close() {} // закрыть
}
// Автомобиль
public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door
    left = new Door(),
    right = new Door(); // Двухдверная машина
    public Car() {
        for (int i = 0; i < 4; i++) {
            wheel[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
        car.engine.service();
    }
}
