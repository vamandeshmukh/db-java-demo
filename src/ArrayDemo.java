public class ArrayDemo {

    public static void main(String[] args) {

//        int num = 10, 20, 30; // CE
//        int num = 10;
//        int []arr2 = {96, 95, 98, 97, 99}; // array
//        int arr3[] = {96, 95, 98, 97, 99}; // array

        int[] arr = {96, 95, 98, 97, 99}; // array
        System.out.println(arr[0]);
        System.out.println(arr.length);
        System.out.println("Print array elements using for loop:");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Print array elements using for each loop:");
        for (int elem : arr) {
            System.out.println(elem);
        }





    }

}
