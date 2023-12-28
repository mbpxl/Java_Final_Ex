package ru.gb.animal_controlling;

import ru.gb.animal_controlling.controller.AnimalController;
import ru.gb.animal_controlling.services.AnimalList;

public class Main {
    public static void main(String[] args) throws Exception {
        AnimalController controller = new AnimalController();

        controller.Run();
    }
}