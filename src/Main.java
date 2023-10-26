import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ToDoListItem> toDoList = new ArrayList<ToDoListItem>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите название дела");
            String name = scanner.next();
            toDoList.add(new ToDoListItem(name));
            System.out.println("Хотите создать еще, введите 1, введите другое число, чтобы выйти");
            int input = scanner.nextInt();
            if (input != 1) {
                break;
            }

        }
        while (true) {
            System.out.println("Введите порядковый номер дела, которое хотите завершить");
            int numberOfItem = scanner.nextInt();
            toDoList.get(numberOfItem).compleated = true;

            System.out.println("Если хотите завершить еще одно дело введите 1");
            int input = scanner.nextInt();
            if (input != 1) {
                break;
            }
        }
        System.out.println(toDoList.toString());
    }
}