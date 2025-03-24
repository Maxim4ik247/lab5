package commands;

import system.CollectionManager;
import system.WorkerCreator;

public class AddCommand implements BaseCommand{
    private final CollectionManager collectionManager;
    private final WorkerCreator workerCreator;

    public AddCommand(CollectionManager collectionManager, WorkerCreator workerCreator) {
        this.collectionManager = collectionManager;
        this.workerCreator = workerCreator;
    }

    @Override
    public String executeCommand(String i) {
        collectionManager.add(workerCreator.createWorker());
        return "";
    }

    @Override
    public String getCommandName() {
        return "add";
    }

    @Override
    public String getCommandDescription() {
        return "добавить новый элемент в коллекцию";
    }
}
