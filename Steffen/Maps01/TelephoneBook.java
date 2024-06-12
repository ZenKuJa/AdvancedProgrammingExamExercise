package Steffen.Maps01;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook{
    Map<Person, TelephoneNumber> entries = new HashMap<>();

    public void addEntry(Person person, TelephoneNumber telephoneNumber){
        this.entries.put(person, telephoneNumber);
    }

    public TelephoneNumber getTelephoneNumberByName(String name){
        for (Person keyPerson : this.entries.keySet()) {
            if (keyPerson.name() == name){
                return entries.get(keyPerson);
            }
        }
        return null;
    }
}