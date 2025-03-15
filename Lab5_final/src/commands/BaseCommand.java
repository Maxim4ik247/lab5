package commands;

public interface BaseCommand {
    String executeCommand(String input);
    String getCommandName();
    String getCommandDescription();
}
