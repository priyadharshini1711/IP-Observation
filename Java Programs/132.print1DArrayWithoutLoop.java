import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {44, 55, 66, 77, 88};
        
        Arrays.stream(arr).forEachOrdered(System.out::println);
    }
}

/*
Output:
44
55
66
77
88
*/