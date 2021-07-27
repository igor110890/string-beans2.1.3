package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private Timer timer;

    private Animal animal;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(getTimer().getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }
    @Autowired
    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public Animal getAnimal() {
        return animal;
    }
    @Autowired
    @Qualifier("dogBean")
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
