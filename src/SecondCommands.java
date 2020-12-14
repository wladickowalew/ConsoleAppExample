import java.util.ArrayList;
import java.util.Scanner;

public class SecondCommands {

    static Scanner sc;
    static boolean running;
    static ArrayList<String> description;

    static {
        sc = new Scanner(System.in);
        running = true;
        description = new ArrayList<>();
        description.add("вывести на экран 1");
        description.add("вывести на экран 2");
        description.add("вернуться");
    }

    public static void start () {
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
            case 1: print1(); break;
            case 2: print2(); break;
            case 3: running = false; break;
        }
    }

    static void printOperation(){
        System.out.println("\nВот, что я умею");
        for(int i = 0; i < description.size(); i++){
            System.out.println((i + 1) + " " + description.get(i));
        }
    }

    static void print1(){
        System.out.println("1");
    }

    static void print2(){
        System.out.println("2");
    }

}

