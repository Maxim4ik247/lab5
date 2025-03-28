package resources;

import java.time.LocalDateTime;

public class Worker implements Comparable<Worker> {
    private static int counter = 1;
    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Float salary; //Поле не может быть null, Значение поля должно быть больше 0
    private Position position; //Поле может быть null
    private Status status; //Поле может быть null
    private Person person; //Поле может быть null

    public Worker() {
        this.creationDate = LocalDateTime.now();
        counter++;
        this.id = counter;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        counter = Math.max(counter, id);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    public String toXML() {
        return "<Worker>" + "\n\t\t<id>" + id + "</id>" + "\n\t\t<name>" + name + "</name>" + "\n\t\t" + coordinates.toXml() + "\n\t\t<creationDate>" + creationDate + "</creationDate>" + "\n\t\t<salary>" + salary + "</salary>" + "\n\t\t<position>" + position + "</position>" + "\n\t\t<status>" + status + "</status>" + "\n\t\t" + person.toXml() + "\n\t" + "</Worker>";
    }


    @Override
    public String toString() {
        return "Worker{" + "id=" + id + ", name='" + name + '\'' + ", creationDate=" + creationDate + ", coordinates=" + coordinates + ", salary=" + salary + ", position=" + position + ", status=" + status + ", person=" + person + '}';
    }

    @Override
    public int compareTo(Worker o) {
        try {
            return (int) (this.salary - o.getSalary());
        } catch (NullPointerException e) {

            if (o == null) {
                return -1;
            } else return 1;

        }
    }
}
