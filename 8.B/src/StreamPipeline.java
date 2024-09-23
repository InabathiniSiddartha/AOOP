import java.util.List;
import java.util.stream.Collectors;
public class StreamPipeline {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numbers.stream()
                                      .filter(n -> n % 2 == 0)                                         .map(n -> n * 2)           
                                      .collect(Collectors.toList()); 
        System.out.println(result);
    }
}
