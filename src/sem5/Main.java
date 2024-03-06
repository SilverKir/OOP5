package sem5;

import sem5.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller cont = new Controller();
        cont.createStudent("Иван", "Иванович", "Иванов");
        cont.createStudent("Петр", "Иванович", "Петров");
        cont.createStudent("Степан", "Иванович", "Степанов");

        cont.printStudents();
        cont.createGroup("Анна", "Петровна", "Сидорова");
        cont.printGroup();
    }
}
