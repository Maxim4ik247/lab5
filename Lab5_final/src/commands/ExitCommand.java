package commands;

public class ExitCommand implements BaseCommand{
    @Override
    public String executeCommand(String i) {
        System.out.println("Программа завершает свою работу");
        System.exit(0);
        return "";
    }

    @Override
    public String getCommandName() {
        return "exit";
    }

    @Override
    public String getCommandDescription() {
        return "завершить программу (без сохранения в файл)";
    }
}
