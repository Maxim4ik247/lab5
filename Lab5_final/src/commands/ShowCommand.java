package commands;

import resources.Worker;
import system.CollectionManager;

public class ShowCommand implements BaseCommand{

    private final CollectionManager collectionManager;

    public ShowCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public String executeCommand(String i) {
        String p = "";
        for (Worker w : collectionManager.getworkerLinkedList())
            p += w.toString() + "\n";

        return p;
    }

    @Override
    public String getCommandName() {
        return "show";
    }

    @Override
    public String getCommandDescription() {
        return "вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }
}
