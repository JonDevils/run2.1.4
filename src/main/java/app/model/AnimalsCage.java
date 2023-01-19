package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;




//import static jdk.vm.ci.common.InitTimer.timer;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;
    Timer timer = new Timer();

    public Animal getAnimal() {
        return animal;
    }

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {

        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
