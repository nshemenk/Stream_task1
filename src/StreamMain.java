import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

    public void sortedList(List<Integer> intList) {
        System.out.println("List после сортировки с использованием Stream API");
        intList.stream()
                .filter(y -> y > 0 && y % 2 == 0)
                .sorted()
                .map(x -> x + " ")
                .collect(Collectors.toList())
                .forEach(System.out::print);
    }
}
