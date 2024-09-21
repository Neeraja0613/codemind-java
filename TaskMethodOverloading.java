

 public class TaskMethodOverloading {
    static void printArrayElements(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static void printArrayElements(double[] doubleArray){
        for(int i = 0; i < doubleArray.length; i++){
            System.out.println(doubleArray[i]);
        }
    }
    static void printArrayElements(String[] strArr){
        for(int i = 0; i < strArr.length; i++){
            System.out.println(strArr[i]);
        }
    }
    static void printArrayElements(char[] charArr){
        for(int i = 0; i < charArr.length; i++){
            System.out.println(charArr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        double[] arr2 = {14.2, 16.7};
        String[] strArr = {"Hello", "World", "!"};
        char[] charArr = {'a', 'b', 'c'};
        printArrayElements(arr);
        printArrayElements(arr2);
        printArrayElements(charArr);
        printArrayElements(strArr);
 
        }
}
 
