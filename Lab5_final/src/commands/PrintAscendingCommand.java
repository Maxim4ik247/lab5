package commands;

import comparators.WorkerComparatorByName;
import system.CollectionManager;

public class PrintAscendingCommand implements BaseCommand{

    private CollectionManager collectionManager;

    public PrintAscendingCommand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public String executeCommand(String i){
        WorkerComparatorByName comparator = new WorkerComparatorByName();
        collectionManager.getworkerLinkedList().stream().sorted(comparator).forEach(worker->{
            System.out.println(worker);
        });
        return "";
    }

    @Override
    public String getCommandName() {
        return "print_ascending";
    }

    @Override
    public String getCommandDescription() {
        return "вывести элементы коллекции в порядке возрастания";
    }
}
