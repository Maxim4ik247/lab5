package system;

import resources.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class ScriptExecutor {

    private final CommandManager commandManager;

    public ScriptExecutor(CommandManager commandManager) {
        this.commandManager = commandManager;
    }

    public String readFile(String filePath, CollectionManager collectionManager) {
        if(historyOfFiles.contains(filePath)){
            return "Была пропущена рекурсия";
        }

        historyOfFiles.add(filePath);
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {

                String command = line;
                if (command.contains("add") || command.contains("update")){


                    String name = bufferedReader.readLine();
                    Float x = Float.parseFloat(bufferedReader.readLine());
                    Float y = Float.parseFloat(bufferedReader.readLine());

                    Float salary = Float.parseFloat(bufferedReader.readLine());
                    Position position = Position.valueOf(bufferedReader.readLine());
                    Status status = Status.valueOf(bufferedReader.readLine());

                    Integer height = Integer.parseInt(bufferedReader.readLine());
                    Color eyeColor = Color.valueOf(bufferedReader.readLine());
                    Color hairColor = Color.valueOf(bufferedReader.readLine());
                    Country nationality = Country.valueOf(bufferedReader.readLine());

                    Float xL = Float.parseFloat(bufferedReader.readLine());
                    Float yL = Float.parseFloat(bufferedReader.readLine());
                    Long zL = Long.parseLong(bufferedReader.readLine());
                    String locationName = bufferedReader.readLine();


                    Coordinates coordinates = new Coordinates();
                    Person person = new Person();
                    Location location = new Location();


                    coordinates.setX(x);
                    coordinates.setY(y);

                    location.setX(xL);
                    location.setY(yL);
                    location.setZ(zL);
                    location.setName(locationName);

                    person.setHeight(height);
                    person.setEyeColor(eyeColor);
                    person.setHairColor(hairColor);
                    person.setNationality(nationality);
                    person.setLocation(location);



                    if(command.equals("add")){
                        Worker worker = new Worker();

                        worker.setName(name);
                        worker.setCoordinates(coordinates);
                        worker.setSalary(salary);
                        worker.setPosition(position);
                        worker.setStatus(status);
                        worker.setPerson(person);

                        collectionManager.add(worker);
                        System.out.println("Worker был добавлен в коллекцию");
                    }
                    else if (command.contains("update")) {
                        Integer id = Integer.parseInt(command.split(" ")[1]);
                        Worker p = new Worker();
                        for (Worker w: collectionManager.getworkerLinkedList()) {
                            if (w.getId() == id) {
                                p = w;
                            }
                        }
                        p.setName(name);
                        p.setCoordinates(coordinates);
                        p.setSalary(salary);
                        p.setPosition(position);
                        p.setStatus(status);
                        p.setPerson(person);

                        System.out.println("Worker был обновлен");

                    }

                }
                else {
                    System.out.println(commandManager.doCommand(line));
                }

            }
            historyOfFiles.pop();

        } catch (IllegalArgumentException | IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
        return"";
    }


    private final Stack<String> historyOfFiles = new Stack<>();

}
