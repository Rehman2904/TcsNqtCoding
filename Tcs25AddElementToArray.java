import java.util.*;
import java.util.stream.Collectors;

public class Tcs25AddElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Get array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter element to be added: ");
        int element = scanner.nextInt();
        scanner.close();

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.add(element);
        System.out.println(list);
    }
}
