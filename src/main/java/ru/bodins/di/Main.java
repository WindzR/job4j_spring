package ru.bodins.di;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);

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
