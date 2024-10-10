import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,4,0));
        printList(list);
        printListLambda(list);
    }
    public static void printList(ArrayList list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public static void printListLambda(ArrayList list){
        list.forEach(System.out::println);
    }
}
