package slot5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.lang.Override;
public class Room {
    String name;
    String position;
    ArrayList<Person> listPerson = new ArrayList<>();


    public Room(String name, String position) {
        this.name = name;
        this.position = position;
        this.listPerson = new ArrayList<Person>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ArrayList<Person> getListPerson() {
        return listPerson;
    }

    public void setListPerson(ArrayList<Person> listPerson) {
        this.listPerson = listPerson;
    }

    public void addPerson(Person person) {
        this.listPerson.add(person);

    }

    public void removePerson(Person person) {
        this.listPerson.remove(person);
    }



    public void printRoomInfo() {
        System.out.println("Room name: " + this.name);
        System.out.println("Room position: " + this.position);
        System.out.println("Person list:");

        // Sắp xếp theo tên trước
        Collections.sort(this.listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        for (Person person : this.listPerson) {
            System.out.println(person.getName() + ", " + person.getAge() + ", " + person.getTelephone() + ", " + person.getAddress());
        }
    }

}
