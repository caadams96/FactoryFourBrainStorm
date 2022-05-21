import java.util.ArrayList;
import java.util.List;

public class PersonFactory {
    public static Person create(String f, String l){

        return new Person(f,l);
    }
    public static ArrayList creatFour(ArrayList list1, ArrayList list2, ArrayList list3, ArrayList list4 ){
        ArrayList<List> params = new ArrayList();
        params.add(list1);
        params.add(list2);
        params.add(list3);
        params.add(list4);
        ArrayList<Person> results = new ArrayList();
        for(int i = 0; i<params.size();++i){
            String first = (String) params.get(i).get(0);
            String last = (String) params.get(i).get(1);
            results.add(PersonFactory.create(first,last));
        }
        return results;
    }
}
