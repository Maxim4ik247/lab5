package commands;

import system.CollectionManager;

import java.time.LocalDateTime;

public class InfoCommand implements BaseCommand{

    private CollectionManager collectionManager;

    public InfoCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public String executeCommand(String i) {
        return collectionManager.toString() + " \n" + LocalDateTime.now();
    }

    @Override
    public String getCommandName() {
        return "info";
    }

    @Override
    public String getCommandDescription() {
        return "вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)";
    }
}
