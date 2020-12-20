package ru.tyunikovag.springinaction.springidol.environment;

public class Stage {

    private Stage() {
    }

    private static class Holder {
        private static Stage stage;
    }

    public static Stage createStage() {
        return Holder.stage;
    }
}
