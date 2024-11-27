import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataManager manager = new DataManager();

        // Додавання об'єктів
        Economy economy = new Economy();
        economy.input();
        manager.addData(economy);

        Geography geography = new Geography();
        geography.input();
        manager.addData(geography);

        Population population = new Population();
        population.input();
        manager.addData(population);

        System.out.println("Звіти:");
        manager.displayAllReports();

        // Приклад редагування об'єкта
        System.out.println("Редагування економічних даних:");
        Economy updatedEconomy = new Economy();
        updatedEconomy.input();
        manager.editData(0, updatedEconomy);  // Заміна першого елемента у списку

        System.out.println("Оновлені звіти:");
        manager.displayAllReports();
    }
}