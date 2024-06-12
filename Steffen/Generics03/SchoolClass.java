package Steffen.Generics03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public record SchoolClass(String name, List<Pupil> pupils) {

    public void addPupil(Pupil pupil){
        pupils.add(pupil);
    }

    public List<Pair<Pupil>> getPairs(){
        List<Pair<Pupil>> pairs = new ArrayList<>();
        List<Pupil> classCopy = pupils;
        Random rnd = new Random();
        while (classCopy.size()>=2) {
            int randStudentID = rnd.nextInt(classCopy.size()-2)+1;
            pairs.add(new Pair<Pupil>(
                classCopy.get(0), 
                classCopy.get(randStudentID)));
            classCopy.remove(0);
            classCopy.remove(randStudentID);
        } 
        if (classCopy.size()==1){
            pairs.add(new Pair<Pupil>(classCopy.get(0), null));
        }
        return pairs;
    }
}
