import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc;
    static int count;
    static boolean running;
    static ArrayList<String> description;

    static {
        sc = new Scanner(System.in);
        count = 0;
        running = true;
        description = new ArrayList<>();
        description.add("вывести на экран строку привет мир");
        description.add("сложить два числа");
        description.add("показать количество вызовов");
        description.add("завершить работу");
        description.add("показать котика");
        description.add("показать пёсика");
        description.add("другие комманды");
    }

    public static void main(String[] args) {
        System.out.println("Привет, пользователь!");
        while (running){
            printOperation();
            String ans = sc.nextLine();
            try {
                int a = Integer.parseInt(ans);
                if (a < 1 || a > description.size())
                    throw new Exception("Неверное число");
                dispatcher(a);
            }catch (Exception e){
                System.out.println("Ошибка ввода, введите номер одной из комманд!");
            }
        }
    }

    static void dispatcher(int i){
        switch (i){
            case 1: printHello(); break;
            case 2: add(); break;
            case 3: printCount(); break;
            case 4: running = false; break;
            case 5: printCat(); break;
            case 6: printDog(); break;
            case 7: anotherCommands(); break;
        }
        count++;
    }

    static void printOperation(){
        System.out.println("\nВот, что я умею");
        for(int i = 0; i < description.size(); i++){
            System.out.println((i + 1) + " " + description.get(i));
        }
    }

    static void anotherCommands(){
        SecondCommands.start();
    }

    static void printCat(){
        System.out.println("Cat");
    }

    static void printDog(){
        System.out.println("Пёсик");
    }

    static void printHello(){
        System.out.println("Hello, world");
    }

    static void add(){
        System.out.println("Enter your numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println(a + b);
    }

    static void printCount(){
        System.out.println(count + " operation");
    }
}
