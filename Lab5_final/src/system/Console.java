package system;

import util.ReadXml;

import java.util.Scanner;

public class Console {
    private CollectionManager collectionManager;
    private CommandManager commandManager;
    private WorkerCreator workerCreator;

    public Console() {
        this.collectionManager = new CollectionManager();
        this.workerCreator = new WorkerCreator(commandManager);
        this.commandManager = new CommandManager(collectionManager, workerCreator);
        this.workerCreator.setCommandManager(commandManager);
    }

    public void start(String path){
        ReadXml.read(collectionManager, path);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String input = scanner.nextLine();

            System.out.println(commandManager.doCommand(input));
        }
    }
}
