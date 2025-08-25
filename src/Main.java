//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Задача №1
        System.out.println("Задача №1");

        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lustName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lustName;
        System.out.println("Ф. И. О. сотрудника — "+fullName);

//        Задача №2
        System.out.println("\nЗадача №2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — "+fullName.toUpperCase());

//        Задача №3
        System.out.println("\nЗадача №3");
        String fullName2 = "Иванов Семён Семёнович";
        String fullName3 = fullName2.replace('ё', 'е');
        System.out.println(fullName2);

    }
}