package commands;

import system.CommandManager;

public class HelpCommand implements BaseCommand {
    private final CommandManager commandManager;

    public HelpCommand(CommandManager commandManager) {
        this.commandManager = commandManager;
    }

    @Override
    public String executeCommand(String i) {
        return commandManager.help();
    }


    @Override
    public String getCommandName() {
        return "help";
    }

    @Override
    public String getCommandDescription() {
        return "вывести справку по доступным командам";
    }
}
