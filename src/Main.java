public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1,2");
        int[] numForFirst = new int[]{1,2,3};
        double[] numForSecond = new double[]{1.57,7.654, 9.986};
        int[] numForThird = new int[3];
        for (int i = 0; i < numForFirst.length; i++) {
            System.out.println(numForFirst[i]);
        }
        for (int i = 0; i < numForSecond.length; i++) {
            System.out.println(numForSecond[i]);
        }
        for (int j : numForThird) {
            System.out.println(j);
        }
        //System suggested this
        System.out.println("Task 3");
        for (int i = numForFirst.length - 1; i >= 0; i--) {
            System.out.println(numForFirst[i]);
        }
        for (int i = numForSecond.length -1; i >= 0; i--) {
            System.out.println(numForSecond[i]);
        }

        System.out.println("Task 4");
        for (int i = 0; i < numForFirst.length; i++) {
            if (numForFirst[i] % 2 != 0){
                numForFirst[i]++;
            }
            System.out.println(numForFirst[i]);
        }
    }

    }