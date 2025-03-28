package commands;

import system.CollectionManager;
import system.WorkerCreator;

public class UpdateCommand implements BaseCommand {

    private String input;
    private CollectionManager collectionManager;
    private WorkerCreator reciewer;

    @Override
    public String executeCommand(String i) {
        int id = Integer.parseInt(input.split(" ")[1]);
        return reciewer.updateWorker(id, collectionManager).toString();
    }

    @Override
    public String getCommandName() {
        return "update";
    }

    @Override
    public String getCommandDescription() {
        return "обновить значение элемента коллекции, id которого равен заданному";
    }
}
