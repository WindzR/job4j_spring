package ru.bodins.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Store.class);
        context.register(ConsoleInput.class);
        context.register(StartUI.class);
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
        String answer = ui.getInput("I have some question! What was first - 1.egg or 2.chicken?");
        if (answer.equals("1")) {
            ui.getInput("Who create an egg?");
        } else {
            ui.getInput("Who create a chicken?");
        }
    }
}
