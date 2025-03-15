package commands;

import system.CollectionManager;

import java.util.Scanner;


public class RemoveByIdCommmand implements BaseCommand{


    private CollectionManager collectionManager;

    public RemoveByIdCommmand(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public String executeCommand(String input) {

        String[] args = input.trim().split(" ");
        if (args.length < 2) {
            return "Ошибка: команда remove_by_id требует указания ID.";
        }

        try {
            int id = Integer.parseInt(args[1]); // Преобразуем аргумент в число
            // Логика удаления по ID
            int before = collectionManager.getworkerLinkedList().size();
            collectionManager.removeId(id);
            int after = collectionManager.getworkerLinkedList().size();
            if (before == after) {
                return "Ничего не было удалено, введите корректный id";
            }
            return "Элемент с id: " + id + " был удален";
        } catch (NumberFormatException e) {
           return "id должен быть числом.";
        }
    }


    @Override
    public String getCommandName() {
        return "remove_by_id";
    }

    @Override
    public String getCommandDescription() {
        return "удалить элемент из коллекции по его id";
    }
}
