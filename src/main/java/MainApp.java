import java.util.ArrayList;

public class MainApp {

    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add("John");
        a1.add("Doe");
        ArrayList a2 = new ArrayList();
        a2.add("Jane");
        a2.add("Doe");
        ArrayList a3 = new ArrayList();
        a3.add("Jim");
        a3.add("Doe");
        ArrayList a4 = new ArrayList();
        a4.add("Joaquin");
        a4.add("Stick");
        ArrayList<Person> alp =  PersonFactory.creatFour(a1, a2, a3, a4);
        for(int i = 0;i<alp.size();++i){
            print(alp.get(i).getFirstName()+" "+alp.get(i).getLastName());
        }
    }
    public static void print(String s){
        System.out.println(s);
    }

}
