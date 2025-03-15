package commands;

import system.CollectionManager;

public class ShuffleCommand implements BaseCommand{

    private CollectionManager collectionManager;

    public ShuffleCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public String executeCommand(String i) {
        collectionManager.shuffle();
        return "Элементы коллекции были перемешаны";
    }

    @Override
    public String getCommandName() {
        return "shuffle";
    }

    @Override
    public String getCommandDescription() {
        return "перемешать элементы коллекции в случайном порядке";
    }
}
