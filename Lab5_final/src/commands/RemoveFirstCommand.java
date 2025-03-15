package commands;

import system.CollectionManager;
import system.CommandManager;
import system.WorkerCreator;

public class RemoveFirstCommand implements BaseCommand{

    private CollectionManager collectionManager;

    public RemoveFirstCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public String executeCommand(String i) {
        collectionManager.removeFirst();
        return"Первый элемент коллекции был удален";
    }

    @Override
    public String getCommandName() {
        return "remove_first";
    }

    @Override
    public String getCommandDescription() {
        return "удалить первый элемент из коллекции";
    }
}
