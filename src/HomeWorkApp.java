public class HomeWorkApp {
public static void main(String[] args) {
    printThreeWords();
    checkSumSign();
    printColor();
    compareNumbers();
}
public static void printThreeWords() {
    System.out.println("Orange");
    System.out.println("Banana");
    System.out.println("Apple");
}
public static void checkSumSign() {
    int a = 0;
    int b = -1;
    int sum = a + b;
    if (sum >= 0) {
        System.out.println("Сумма положительная");
    }
    if (sum <= 0) {
        System.out.println("Сумма отрицательная");
    }
}
public static void printColor() {
    int value = 101;
    if (value <= 0) {
        System.out.println("Красный");
    }
    else  if (0 < value && value <= 100) {
        System.out.println("Желтый");
    }
    else if (100 < value) {
        System.out.println("Зеленый");
    }
}
public static void compareNumbers() {
    int a = 10;
    int b = 2;
    if (a > b) {
        System.out.println("a >= b");
    }
    else if (a < b) {
        System.out.println("a < b");
    }
}
}
