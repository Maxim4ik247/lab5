package commands;

import system.CollectionManager;

public class ClearCommand implements BaseCommand{
    private final CollectionManager collectionManager;

    public ClearCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public String executeCommand(String i) {
        collectionManager.clearCollection();
        return "Коллекция была очищена";
    }

    @Override
    public String getCommandName() {
        return "clear";
    }

    @Override
    public String getCommandDescription() {
        return "очистить коллекцию";
    }
}
