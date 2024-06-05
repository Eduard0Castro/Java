package estudos.tests;
import java.util.List;
import java.util.ArrayList;

public class ListTeste {
    
    private static List<Integer> list_int = new ArrayList<Integer>();
    private static List<String> string_list = new ArrayList<>();

    public static void main(String args[]){
        list_int.add(8);
        list_int.add(8);

        String nome = "Eduardo";

        string_list.add(nome);
        string_list.add(nome);
        
        for (String i: string_list){
            System.out.println(i);
        }


    }

}
