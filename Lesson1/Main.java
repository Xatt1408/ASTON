// TASK 1

public class Main {
    public static void main(String[] args) {
        //1
        printThreeWords();

        //2
        checkSumSign();

        //3
        printColor();

        //4
        compareNumbers();

        //5
        int num1 = 12;
        int num2 = 8;
        boolean result = isSumInRange(num1, num2);
        System.out.println(result);

        //6
        printNumberSign(0);

        //7
    }

//TASK1

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


// TASK 2.

    static void checkSumSign() {
        int a = 5;
        int b = -5;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }


// TASK 3.

    static void printColor() {
        int value = 0;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }


// TASK 4.


    static void compareNumbers() {
        int a = 11;
        int b = 10;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

// TASK 5.

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }


//
//// TASK 6.
//
    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}
//
//// TASK 7.
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(isNegative(-5));
//    }
//
//    public static boolean isNegative(int number) {
//        return number < 0;
//    }
//}
//
//
//// TASK 8.
//
//public class Main {
//    public static void main(String[] args) {
//        printStringMultipleTimes("Hello", 4);
//    }
//
//    public static void printStringMultipleTimes(String str, int times) {
//        for (int i = 0; i < times; i++) {
//            System.out.println(str);
//        }
//    }
//}
//
//// TASK 9.
//
//public class Main {
//
//    public static boolean leapYear(int year) {
//        if (year % 400 == 0) {
//            return true;
//        }
//        if (year % 100 == 0) {
//            return false;
//        }
//        return year % 4 == 0;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(leapYear(2024));
//    }
//}
//
//// TASK 10.
//
//public class Main {
//
//    public static void main(String[] args) {
//        int[] array = { 0, 0, 1, 1, 1, 0, 1, 1, 0, 0 };
//
//        System.out.println("Исходный массив:");
//        printArray(array);
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 0) {
//                array[i] = 1;
//            } else if (array[i] == 1) {
//                array[i] = 0;
//            }
//        }
//
//        System.out.println("Измененный массив:");
//        printArray(array);
//    }
//
//    private static void printArray(int[] array) {
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
//}
//
//// TASK 11.
//
//public class Main {
//
//    public static void main(String[] args) {
//        int[] array = new int[100];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1;
//        }
//        printArray(array);
//    }
//
//    private static void printArray(int[] array) {
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
//}
//
//// TASK 12.
//
//public class Main {
//
//    public static void main(String[] args) {
//        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
//
//        System.out.println("Исходный массив:");
//        printArray(array);
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 6) {
//                array[i] = array[i] * 2;
//            }
//        }
//
//        System.out.println("Массив *2:");
//        printArray(array);
//    }
//
//    private static void printArray(int[] array) {
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
//}
//
//
//// TASK 13.
//
//public class Main {
//
//    public static void main(String[] args) {
//        int n = 4;
//        int[][] array = new int[n][n];
//
//        for (int i = 0; i < n; i++) {
//            array[i][i] = 1;
//            array[i][n - 1 - i] = 1;
//        }
//
//        printArray(array);
//    }
//
//    private static void printArray(int[][] array) {
//        for (int[] row : array) {
//            for (int element : row) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//
//// TASK 14.
//
//public class Main {
//
//    public int[] createArray(int len, int initialValue) {
//        int[] array = new int[len];
//        for (int i = 0; i < len; i++) {
//            array[i] = initialValue;
//        }
//        return array;
//    }
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        int[] result = main.createArray(5, 10);
//        for (int value : result) {
//            System.out.print(value + " ");
//        }
//    }
//}