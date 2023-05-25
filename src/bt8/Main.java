package bt8;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Dat", 29, "348740383", "Ha Noi");
        Person person2 = new Person("Quan", 55, "324839", "Ha Noi");
        Person person3 = new Person("Anh", 20, "23843534", "Ha Noi");

        Room room = new Room("T2210A", "6th floor");

        room.addPerson(person1);
        room.addPerson(person2);
        room.addPerson(person3);

        room.printRoomInfo();

        System.out.println("Removing " + person2.getName() + " from the room.");
        room.removePerson(person2);

        room.printRoomInfo();
    }
}
