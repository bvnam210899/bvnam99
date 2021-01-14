package dry;

import java.util.ArrayList;
import java.util.List;

public class GoodParent {
    public List<Person> findAllGoodPersonsByGender(List<Person> persons, Gender gender) {
        var results = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.name.startsWith("T")
                    && person.age > 25
                    && person.hairColor == HairColor.BLACK
                    && person.skinColor == SkinColor.WHITE
                    && person.sex == gender){
                results.add(person);
            }
        }
        return results;
    }

//    public List<Person> findAllGoodMan(List<Person> persons) {
//        var results = new ArrayList<Person>();
//        for (Person person : persons) {
//            if (person.name.startsWith("T")
//                    && person.age > 25
//                    && person.hairColor == HairColor.BLACK
//                    && person.skinColor == SkinColor.WHITE) {
//                if (person.sex == Gender.MALE) {
//                    results.add(person);
//                }
//            }
//        }
//        return results;
//    }
//
//    public List<Person> findAllGoodGirl(List<Person> persons) {
//        var results = new ArrayList<Person>();
//        for (Person person : persons) {
//            if (person.name.startsWith("T")
//                    && person.age > 25
//                    && person.hairColor == HairColor.BLACK
//                    && person.skinColor == SkinColor.WHITE) {
//                if (person.sex == Gender.FEMALE) {
//                    results.add(person);
//                }
//            }
//        }
//        return results;
//    }
}