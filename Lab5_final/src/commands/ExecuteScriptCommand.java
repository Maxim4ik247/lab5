package commands;

import system.CollectionManager;
import system.WorkerCreator;

public class ExecuteScriptCommand implements BaseCommand{
    private CollectionManager collectionManager;
    private WorkerCreator workerCreator;

    public ExecuteScriptCommand(CollectionManager collectionManager, WorkerCreator workerCreator) {
        this.workerCreator = workerCreator;
        this.collectionManager = collectionManager;
    }

    @Override
    public String executeCommand(String i) {
        return workerCreator.readFile(i.split(" ")[1], collectionManager);
    }

    @Override
    public String getCommandName() {
        return "execute_script";
    }

    @Override
    public String getCommandDescription() {
        return "считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.";
    }
}
