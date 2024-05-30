// TASK 1

public class Main {
    public static void main(String[] args) {
        printThreeWords();
    }

    public static void printThreeWords() {
        String[] words = {"Orange", "Banana", "Apple"};
        for (String word : words) {
            System.out.println(word);
        }
    }
}

//TASK 2

//public class Main {
//    public static void main(String[] args) {
//        checkSumSign();
//    }
//
//    public static void checkSumSign() {
//        int a = 5;
//        int b = -3;
//
//        int sum = a + b;
//
//        if (sum >= 0) {
//            System.out.println("Сумма положительная");
//        } else {
//            System.out.println("Сумма отрицательная");
//        }
//    }
//}

//TASK 3

//public class Main {
//    public static void main(String[] args) {
//        printColor();
//    }
//
//    public static void printColor() {
//        int value = 50;  // Вы можете инициализировать переменную любым значением
//
//        if (value <= 0) {
//            System.out.println("Красный");
//        } else if (value <= 100) {
//            System.out.println("Желтый");
//        } else {
//            System.out.println("Зелёный");
//        }
//    }
//}

//TASK 4

//public class Main {
//    public static void main(String[] args) {
//        compareNumbers();
//    }
//
//    public static void compareNumbers() {
//        int a = 10;
//        int b = 20;
//
//        if (a >= b) {
//            System.out.println("a >= b");
//        } else {
//            System.out.println("a < b");
//        }
//    }
//}

//TASK 5

//public class Main {
//    public static void main(String[] args) {
//        System.out.println(isSumInRange(7, 5));
//
//    }
//
//    public static boolean isSumInRange(int a, int b) {
//        int sum = a + b;
//        return sum >= 10 && sum <= 20;
//    }
//}

//TASK 6

//public class Main {
//    public static void main(String[] args) {
//        checkNumberSign(-5);
//
//    }
//
//    public static void checkNumberSign(int number) {
//        if (number >= 0) {
//            System.out.println("Число положительное");
//        } else {
//            System.out.println("Число отрицательное");
//        }
//    }
//}

//TASK 7

//public class Main {
//    public static void main(String[] args) {
//        System.out.println(isNegative(0));
//    }
//
//    public static boolean isNegative(int number) {
//        return number < 0;
//    }
//}

//TASK 8

//public class Main {
//    public static void main(String[] args) {
//        // Пример вызова метода
//        printStringMultipleTimes("Hello, ASTON!", 3);
//    }
//
//    public static void printStringMultipleTimes(String str, int times) {
//        for (int i = 0; i < times; i++) {
//            System.out.println(str);
//        }
//    }
//}

//TASK 9

//public class Main {
//    public static void main(String[] args) {
//        System.out.println(isLeapYear(2024));
//    }
//
//    public static boolean isLeapYear(int year) {
//        if (year % 400 == 0) {
//            return true;
//        } else if (year % 100 == 0) {
//            return false;
//        } else if (year % 4 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}

//TASK 10

//public class Main {
//    public static void main(String[] args) {
//        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
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
//    public static void printArray(int[] array) {
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
//}

//TASK 11

//public class Main {
//    public static void main(String[] args) {
//        int[] array = new int[100];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1;
//        }
//        printArray(array);
//    }
//
//    public static void printArray(int[] array) {
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
//}

//TASK 12

//public class Main {
//    public static void main(String[] args) {
//        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        System.out.println("Исходный массив:");
//        printArray(array);
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 6) {
//                array[i] *= 2;
//            }
//        }
//        System.out.println("Измененный массив:");
//        printArray(array);
//    }
//
//    public static void printArray(int[] array) {
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
//}

//TASK 13

//public class Main {
//    public static void main(String[] args) {
//        int size = 5;
//        int[][] array = new int[size][size];
//
//        for (int i = 0; i < size; i++) {
//            array[i][i] = 1;
//            array[i][size - 1 - i] = 1;
//        }
//        print2DArray(array);
//    }
//
//    public static void print2DArray(int[][] array) {
//        for (int[] row : array) {
//            for (int elem : row) {
//                System.out.print(elem + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//TASk 14

//public class Main {
//    public static void main(String[] args) {
//        int[] array = createArray(5, 10);
//        printArray(array);
//    }
//
//    public static int[] createArray(int len, int initialValue) {
//        int[] array = new int[len];
//        for (int i = 0; i < len; i++) {
//            array[i] = initialValue;
//        }
//        return array;
//    }
//
//    public static void printArray(int[] array) {
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
//}
