package system;

import resources.Worker;
import util.ReadXml;

import java.util.Scanner;

public class Console {
    private final CollectionManager collectionManager;
    private final CommandManager commandManager;
    private final WorkerCreator workerCreator;

    public Console() {
        this.collectionManager = new CollectionManager();
        this.workerCreator = new WorkerCreator();
        this.commandManager = new CommandManager(collectionManager, workerCreator);
    }

    public void start(String path) {

        for (Worker worker : ReadXml.read(path)) {
            collectionManager.add(worker);
        }

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();

            System.out.println(commandManager.doCommand(input));
        }
    }
}
