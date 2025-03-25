package system;

import resources.*;

import java.util.Scanner;


public class WorkerCreator {


    public Worker updateWorker(int id, CollectionManager collectionManager) {
        Scanner scanner = new Scanner(System.in);

        Worker p = new Worker();
        for (Worker w : collectionManager.getworkerLinkedList()) {
            if (w.getId() == id) {
                p = w;
            }
        }
        // Ввод имени
        String name = "";
        flag = true;
        while (flag) {
            try {
                System.out.print("Введите имя работника:");
                name = scanner.nextLine();
                if (name.isEmpty()) {
                    System.out.println("Ошибка: имя не может быть пустым.");
                    continue;
                }
                flag = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        Float x = 0f;
        Float y = 0f;
        flag = true;
        while (flag) {
            try {
                System.out.println("Введите координату X: ");
                x = Float.parseFloat(scanner.nextLine());
                System.out.println("Введите координату Y: ");
                y = Float.parseFloat(scanner.nextLine());
                flag = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        Float salary = 0f;
        flag = true;
        while (flag) {
            try {
                System.out.print("Введите зарплату: ");
                salary = Float.parseFloat(scanner.nextLine());
                if (salary <= 0) {
                    System.out.println("Ошибка: зарплата должна быть больше нуля.");
                    continue;
                }
                flag = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


        Position position = null;
        flag = true;
        while (flag) {
            try {
                System.out.print("Введите должность (0 - HUMAN_RESOURCES, 1 - HEAD_OF_DIVISION, 2 - DEVELOPER, 3 - LEAD_DEVELOPER, 4 - MANAGER_OF_CLEANING): ");
                int positionIndex = Integer.parseInt(scanner.nextLine());
                switch (positionIndex) {
                    case 0:
                        position = Position.HUMAN_RESOURCES;
                        flag = false;
                        break;
                    case 1:
                        position = Position.HEAD_OF_DIVISION;
                        flag = false;
                        break;
                    case 2:
                        position = Position.DEVELOPER;
                        flag = false;
                        break;
                    case 3:
                        position = Position.LEAD_DEVELOPER;
                        flag = false;
                        break;
                    case 4:
                        position = Position.MANAGER_OF_CLEANING;
                        flag = false;
                        break;
                    default:
                        System.out.println("Ошибка: некорректная должность.");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }


        Status status = null;
        flag = true;
        while (flag) {
            try {
                System.out.print("Введите статус (0 - FIRED, 1 - REGULAR, 2 - PROBATION): ");
                int statusIndex = Integer.parseInt(scanner.nextLine());
                switch (statusIndex) {
                    case 0:
                        status = Status.FIRED;
                        flag = false;
                        break;
                    case 1:
                        status = Status.REGULAR;
                        flag = false;
                        break;
                    case 2:
                        status = Status.PROBATION;
                        flag = false;
                        break;
                    default:
                        System.out.println("Ошибка: некорректный статус.");

                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        Integer height = 0;
        flag = true;
        while (flag) {
            try {
                System.out.print("Введите рост: ");
                height = Integer.parseInt(scanner.nextLine());
                if (salary <= 0) {
                    System.out.println("Ошибка: рост должен быть больше 0.");
                    continue;
                }
                flag = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        Color eyeColor = null;
        flag = true;
        while (flag) {
            try {
                System.out.print("Введите цвет глаз (0 - BLACK, 1 - BROWN, 2 - RED, 3 - GREEN, 4 - ORANGE, 5 - WHITE): ");
                int statusIndex = Integer.parseInt(scanner.nextLine());
                switch (statusIndex) {
                    case 0:
                        eyeColor = Color.BLACK;
                        flag = false;
                        break;
                    case 1:
                        eyeColor = Color.BROWN;
                        flag = false;
                        break;
                    case 2:
                        eyeColor = Color.RED;
                        flag = false;
                        break;
                    case 3:
                        eyeColor = Color.GREEN;
                        flag = false;
                        break;
                    case 4:
                        eyeColor = Color.ORANGE;
                        flag = false;
                        break;
                    case 5:
                        eyeColor = Color.WHITE;
                        flag = false;
                        break;
                    default:
                        System.out.println("Ошибка: некорректный цвет.");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        Color hairColor = null;
        flag = true;
        while (flag) {
            try {
                System.out.print("Введите цвет волос (0 - BLACK, 1 - BROWN, 2 - RED, 3 - GREEN, 4 - ORANGE, 5 - WHITE): ");
                int statusIndex = Integer.parseInt(scanner.nextLine());
                switch (statusIndex) {
                    case 0:
                        hairColor = Color.BLACK;
                        flag = false;
                        break;
                    case 1:
                        hairColor = Color.BROWN;
                        flag = false;
                        break;
                    case 2:
                        hairColor = Color.RED;
                        flag = false;
                        break;
                    case 3:
                        hairColor = Color.GREEN;
                        flag = false;
                        break;
                    case 4:
                        hairColor = Color.ORANGE;
                        flag = false;
                        break;
                    case 5:
                        hairColor = Color.WHITE;
                        flag = false;
                        break;
                    default:
                        System.out.println("Ошибка: некорректный цвет.");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        Country nationality = null;
        flag = true;
        while (flag) {
            try {
                System.out.print("Введите национальность (0 - GERMANY, 1 - NORTH_KOREA, 2 - RUSSIA, 3 - THAILAND, 4 - UNITED_KINGDOM): ");
                int statusIndex = Integer.parseInt(scanner.nextLine());
                switch (statusIndex) {
                    case 0:
                        nationality = Country.GERMANY;
                        flag = false;
                        break;
                    case 1:
                        nationality = Country.NORTH_KOREA;
                        flag = false;
                        break;
                    case 2:
                        nationality = Country.RUSSIA;
                        flag = false;
                        break;
                    case 3:
                        nationality = Country.THAILAND;
                        flag = false;
                        break;
                    case 4:
                        nationality = Country.UNITED_KINGDOM;
                        flag = false;
                        break;
                    default:
                        System.out.println("Ошибка: некорректный цвет.");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        String locationName = "";
        Float xL = 0f;
        Float yL = 0f;
        Long zL = 0L;
        flag = true;
        while (flag) {
            try {
                System.out.println("location name");
                locationName = scanner.nextLine();
                System.out.println("x");
                xL = Float.parseFloat(scanner.nextLine());
                System.out.println("y");
                yL = Float.parseFloat(scanner.nextLine());
                System.out.println("z");
                zL = Long.parseLong(scanner.nextLine());
                flag = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        Coordinates coordinates = new Coordinates();
        coordinates.setX(x);
        coordinates.setY(y);


        Location location = new Location();
        location.setName(locationName);
        location.setX(xL);
        location.setY(yL);
        location.setZ(zL);

        Person person = new Person();
        person.setHeight(height);
        person.setEyeColor(eyeColor);
        person.setHairColor(hairColor);
        person.setNationality(nationality);
        person.setLocation(location);

        p.setName(name);
        p.setCoordinates(coordinates);
        p.setSalary(salary);
        p.setPosition(position);
        p.setStatus(status);
        p.setPerson(person);

        // Возвращаем созданного работника
        System.out.println("Работник успешно обновлен!");
        return p;
    }


    private boolean flag = true;

    public Worker createWorker() {
        Scanner scanner = new Scanner(System.in);

        Worker worker = new Worker();
        Coordinates coordinates = new Coordinates();
        Location location = new Location();
        Person person = new Person();


        setName(worker);
        setX(coordinates);
        setY(coordinates);
        setSalary(worker);
        setPosition(worker);
        setStatus(worker);
        setHeight(person);
        setEyeColor(person);
        setHairColor(person);
        setNationality(person);
        setLocationName(location);
        setXL(location);
        setYL(location);
        setZL(location);
        person.setLocation(location);
        worker.setCoordinates(coordinates);
        worker.setPerson(person);

        System.out.println("Работник успешно создан!");
        return worker;
    }

    public void setName(Worker worker) {

        Scanner scanner = new Scanner(System.in);
        String name = "";
        flag = true;
        while (flag) {
            try {
                System.out.print("Введите имя работника:");
                name = scanner.nextLine().trim();
                if (name.isEmpty()) {
                    System.out.println("Ошибка: имя не может быть пустым.");
                    continue;
                }
                flag = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        worker.setName(name);
    }

    public void setX(Coordinates coordinates) {
        Scanner scanner = new Scanner(System.in);
        Float x = 0f;
        flag = true;
        while (flag) {
            try {
                System.out.println("Введите координату X: ");
                String a = scanner.nextLine();
                if (a.isEmpty()) {
                    System.out.println("Ошибка: x не может быть пустым.");
                    continue;
                }
                x = Float.parseFloat(a);
                if (x > 769) {
                    System.out.println("Ошибка: x не может быть больше 769.");
                    continue;
                }
                flag = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            coordinates.setX(x);
        }
    }

    public void setY(Coordinates coordinates) {
        Scanner scanner = new Scanner(System.in);
        Float y = 0f;
        flag = true;
        while (flag) {
            try {
                System.out.println("Введите координату Y: ");

                String b = scanner.nextLine();
                if (b.isEmpty()) {
                    System.out.println("Ошибка: x не может быть пустым.");
                    continue;
                }

                y = Float.parseFloat(b);
                if (y > 682) {
                    System.out.println("Ошибка: y не может быть больше 682.");
                    continue;
                }
                flag = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            coordinates.setY(y);
        }
    }

    public void setSalary(Worker worker) {
        Scanner scanner = new Scanner(System.in);

        Float salary = 0f;
        flag = true;
        while (flag) {
            try {
                System.out.print("Введите зарплату: ");
                String a = scanner.nextLine();
                if (a.isEmpty()) {
                    System.out.println("Ошибка: salary не может быть пустым.");
                    continue;
                }
                salary = Float.parseFloat(a);
                if (salary <= 0) {
                    System.out.println("Ошибка: зарплата должна быть больше нуля.");
                    continue;
                }
                flag = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        worker.setSalary(salary);
    }

    public void setPosition(Worker worker) {
        Scanner scanner = new Scanner(System.in);
        Position position = null;
        flag = true;
        while (flag) {
            try {
                System.out.print("Введите должность (0 - HUMAN_RESOURCES, 1 - HEAD_OF_DIVISION, 2 - DEVELOPER, 3 - LEAD_DEVELOPER, 4 - MANAGER_OF_CLEANING): ");

                String a = scanner.nextLine().trim();
                if (a.isEmpty()) {
                    System.out.println("Поле останетя null");
                    flag = false;
                    break;
                }

                int positionIndex = Integer.parseInt(a);
                switch (positionIndex) {
                    case 0:
                        position = Position.HUMAN_RESOURCES;
                        flag = false;
                        break;
                    case 1:
                        position = Position.HEAD_OF_DIVISION;
                        flag = false;
                        break;
                    case 2:
                        position = Position.DEVELOPER;
                        flag = false;
                        break;
                    case 3:
                        position = Position.LEAD_DEVELOPER;
                        flag = false;
                        break;
                    case 4:
                        position = Position.MANAGER_OF_CLEANING;
                        flag = false;
                        break;
                    default:
                        System.out.println("Ошибка: некорректная должность.");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        worker.setPosition(position);
    }

    public void setStatus(Worker worker) {
        Scanner scanner = new Scanner(System.in);
        Status status = null;
        flag = true;
        while (flag) {
            try {
                System.out.print("Введите статус (0 - FIRED, 1 - REGULAR, 2 - PROBATION): ");

                String a = scanner.nextLine().trim();
                if (a.isEmpty()) {
                    System.out.println("Поле останетя null");
                    flag = false;
                    break;
                }

                int statusIndex = Integer.parseInt(a);

                switch (statusIndex) {
                    case 0:
                        status = Status.FIRED;
                        flag = false;
                        break;
                    case 1:
                        status = Status.REGULAR;
                        flag = false;
                        break;
                    case 2:
                        status = Status.PROBATION;
                        flag = false;
                        break;
                    default:
                        System.out.println("Ошибка: некорректный статус.");

                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        worker.setStatus(status);
    }

    public void setHeight(Person person) {
        Scanner scanner = new Scanner(System.in);
        Integer height = null;
        flag = true;
        while (flag) {
            try {
                System.out.print("Введите рост: ");

                String a = scanner.nextLine();
                if (a.isEmpty()) {
                    System.out.println("Рост остается null.");
                    break;
                }

                height = Integer.parseInt(scanner.nextLine());

                if (height <= 0) {
                    System.out.println("Ошибка: рост должен быть больше 0.");
                    continue;
                }
                flag = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        person.setHeight(height);
    }

    public void setEyeColor(Person person) {
        Scanner scanner = new Scanner(System.in);
        Color eyeColor = null;
        flag = true;
        while (flag) {
            try {
                System.out.print("Введите цвет глаз (0 - BLACK, 1 - BROWN, 2 - RED, 3 - GREEN, 4 - ORANGE, 5 - WHITE): ");

                String a = scanner.nextLine().trim();
                if (a.isEmpty()) {
                    System.out.println("Поле останетя null");
                    flag = false;
                    break;
                }

                int statusIndex = Integer.parseInt(a);
                switch (statusIndex) {
                    case 0:
                        eyeColor = Color.BLACK;
                        flag = false;
                        break;
                    case 1:
                        eyeColor = Color.BROWN;
                        flag = false;
                        break;
                    case 2:
                        eyeColor = Color.RED;
                        flag = false;
                        break;
                    case 3:
                        eyeColor = Color.GREEN;
                        flag = false;
                        break;
                    case 4:
                        eyeColor = Color.ORANGE;
                        flag = false;
                        break;
                    case 5:
                        eyeColor = Color.WHITE;
                        flag = false;
                        break;
                    default:
                        System.out.println("Ошибка: некорректный цвет.");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        person.setEyeColor(eyeColor);
    }

    public void setHairColor(Person person) {
        Scanner scanner = new Scanner(System.in);
        Color hairColor = null;
        flag = true;
        while (flag) {
            try {
                System.out.print("Введите цвет волос (0 - BLACK, 1 - BROWN, 2 - RED, 3 - GREEN, 4 - ORANGE, 5 - WHITE): ");

                String a = scanner.nextLine().trim();
                if (a.isEmpty()) {
                    System.out.println("Поле останетя null");
                    flag = false;
                    break;
                }

                int statusIndex = Integer.parseInt(a);
                switch (statusIndex) {
                    case 0:
                        hairColor = Color.BLACK;
                        flag = false;
                        break;
                    case 1:
                        hairColor = Color.BROWN;
                        flag = false;
                        break;
                    case 2:
                        hairColor = Color.RED;
                        flag = false;
                        break;
                    case 3:
                        hairColor = Color.GREEN;
                        flag = false;
                        break;
                    case 4:
                        hairColor = Color.ORANGE;
                        flag = false;
                        break;
                    case 5:
                        hairColor = Color.WHITE;
                        flag = false;
                        break;
                    default:
                        System.out.println("Ошибка: некорректный цвет.");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        person.setHairColor(hairColor);
    }

    public void setNationality(Person person) {
        Scanner scanner = new Scanner(System.in);

        Country nationality = null;
        flag = true;
        while (flag) {
            try {
                System.out.print("Введите национальность (0 - GERMANY, 1 - NORTH_KOREA, 2 - RUSSIA, 3 - THAILAND, 4 - UNITED_KINGDOM): ");

                String a = scanner.nextLine().trim();
                if (a.isEmpty()) {
                    System.out.println("Поле останетя null");
                    flag = false;
                    break;
                }

                int statusIndex = Integer.parseInt(a);
                switch (statusIndex) {
                    case 0:
                        nationality = Country.GERMANY;
                        flag = false;
                        break;
                    case 1:
                        nationality = Country.NORTH_KOREA;
                        flag = false;
                        break;
                    case 2:
                        nationality = Country.RUSSIA;
                        flag = false;
                        break;
                    case 3:
                        nationality = Country.THAILAND;
                        flag = false;
                        break;
                    case 4:
                        nationality = Country.UNITED_KINGDOM;
                        flag = false;
                        break;
                    default:
                        System.out.println("Ошибка: некорректный цвет.");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        person.setNationality(nationality);
    }

    public void setLocationName(Location location) {
        Scanner scanner = new Scanner(System.in);

        String locationName = "";
        flag = true;
        while (flag) {
            try {
                System.out.println("location name");
                String a = scanner.nextLine().trim();
                if (a.isEmpty()) {
                    System.out.println("Ошибка: location name не может быть пустым.");
                    continue;
                }
                locationName = a;
                flag = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        location.setName(locationName);
    }

    public void setXL(Location location) {
        Scanner scanner = new Scanner(System.in);

        Float xL = 0f;
        flag = true;
        while (flag) {
            try {
                System.out.println("x");

                String b = scanner.nextLine();
                if (b.isEmpty()) {
                    System.out.println("Ошибка: x не может быть null.");
                    continue;
                }
                xL = Float.parseFloat(b);
                flag = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        location.setX(xL);
    }

    public void setYL(Location location) {
        Scanner scanner = new Scanner(System.in);

        Float yL = 0f;
        flag = true;
        while (flag) {
            try {
                System.out.println("y");
                String a = scanner.nextLine();
                if (a.isEmpty()) {
                    System.out.println("Ошибка: y не может быть пустым.");
                    continue;
                }
                yL = Float.parseFloat(a);
                flag = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        location.setY(yL);
    }

    public void setZL(Location location) {
        Scanner scanner = new Scanner(System.in);

        Long zL = null;
        flag = true;
        while (flag) {
            try {
                System.out.println("z");
                String a = scanner.nextLine();
                if (a.isEmpty()) {
                    System.out.println("Ошибка: z не может быть пустым.");
                    continue;
                }
                zL = Long.parseLong(a);
                flag = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        location.setZ(zL);
    }

}
