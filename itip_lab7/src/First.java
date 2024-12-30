public class First {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
 
        int sum = sumArray(arr);

        System.out.println("Сумма: " + sum);
    }


    public static int sumArray(int[] array) {
        int mid = array.length / 2;

        ArrSum sum1 = new ArrSum(array, 0, mid);
        ArrSum sum2 = new ArrSum(array, mid, array.length);

        Thread thread1 = new Thread(sum1);
        Thread thread2 = new Thread(sum2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join(); 
        } catch (Exception e) {
            System.out.println(e);
        }

        int sumOne = sum1.getSum();
        int sumTwo = sum2.getSum();

        return sumOne + sumTwo;
    }
}
