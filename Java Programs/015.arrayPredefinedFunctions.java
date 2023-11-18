import java.util.*;

class Main {

  public static void main(String[] args) {
    //1. To convert the elements as List

    System.out.println("1. To convert the elements as List");

    int intArr[] = { 10, 20, 15, 22, 35, 40 };

    System.out.println("Integer Array as List: " + Arrays.asList(intArr));

    //2. binary search

    System.out.println("\n2. Binary Search");

    Arrays.sort(intArr);

    int intKey = 40;

    System.out.println(
      intKey + " found at index = " + Arrays.binarySearch(intArr, intKey)
    ); // output found

    intKey = 45;

    // Print the key and corresponding index
    System.out.println(
      intKey + " found at index = " + Arrays.binarySearch(intArr, intKey)
    ); // output not found

    //3. binary search using index range

    System.out.println("\n3. Binary Search using index range");

    intKey = 22;

    System.out.println(
      intKey + " found at index = " + Arrays.binarySearch(intArr, 1, 3, intKey)
    ); // output found

    intKey = 75;

    System.out.println(
      intKey + " found at index = " + Arrays.binarySearch(intArr, 1, 3, intKey)
    ); // output not found

    //4. To compare both arrays

    System.out.println("\n4. comapre both arrays");

    int intArr1[] = { 10, 15, 22 };

    System.out.println(
      "Integer Arrays on comparison: " + Arrays.compare(intArr, intArr1)
    );

    //5. To compare using unsigned

    System.out.println("\n5. To compare using unsigned");

    int intArr3[] = { 10, 15, 22 };

    System.out.println(
      "Integer Arrays on comparison: " + Arrays.compare(intArr1, intArr3)
    );

    int intArr2[] = { 10, 15 };

    System.out.println(
      "Integer Arrays on comparison: " + Arrays.compare(intArr1, intArr2)
    );

    //6. copyof Array

    System.out.println("\n6. copyof Array");
    System.out.println("Integer Array: " + Arrays.toString(intArr));

    System.out.println("\nNew Arrays by copyOf:\n");

    System.out.println(
      "Integer Array: " + Arrays.toString(Arrays.copyOf(intArr, 10))
    );

    //7. copy of range

    System.out.println("\n7. copy of range");

    String intArr4 = Arrays.toString(Arrays.copyOfRange(intArr, 1, 3));

    System.out.println("Integer Array: " + intArr4);

    //8. deep equals in array

    System.out.println("\n8. deep equals in array");

    int intArr22[][] = { { 10, 20, 15, 22, 35 } };

    // Get the second Arrays
    int intArr23[][] = { { 10, 15, 22 } };

    // To compare both arrays
    System.out.println(
      "Integer Arrays on comparison: " + Arrays.deepEquals(intArr22, intArr23)
    );

    //9. deep hascode

    System.out.println("\n9. deep hashcode");

    System.out.println("Integer Array: " + Arrays.deepHashCode(intArr22));

    //10. deep to string

    System.out.println("\n10. deep to string");

    System.out.println("Integer Array: " + Arrays.deepToString(intArr22));

    //11. array equals

    System.out.println("\n11. Array Equals");

    int intArr31[] = { 10, 20, 15, 22, 35 };

    // Get the second Arrays
    int intArr32[] = { 10, 15, 22 };

    // To compare both arrays
    System.out.println(
      "Integer Arrays on comparison: " + Arrays.equals(intArr31, intArr32)
    );
  }
}
/*
1. To convert the elements as List
Integer Array as List: [[I@60215eee]

2. Binary Search
40 found at index = 5
45 found at index = -7

3. Binary Search using index range
22 found at index = -4
75 found at index = -4

4. comapre both arrays
Integer Arrays on comparison: -1

5. To compare using unsigned
Integer Arrays on comparison: 0
Integer Arrays on comparison: 1

6. copyof Array
Integer Array: [10, 15, 20, 22, 35, 40]

New Arrays by copyOf:

Integer Array: [10, 15, 20, 22, 35, 40, 0, 0, 0, 0]

7. copy of range
Integer Array: [15, 20]

8. deep equals in array
Integer Arrays on comparison: false

9. deep hashcode
Integer Array: 38475344

10. deep to string
Integer Array: [[10, 20, 15, 22, 35]]

11. Array Equals
Integer Arrays on comparison: false
*/
