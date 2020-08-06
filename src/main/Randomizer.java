package main;

import java.util.*;

public class Randomizer {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        int[] tasks = {1, 2, 3, 4, 5, 6, 7, 8};
        List<String> students = new ArrayList<>();
        students.add("Alexandr Shibaev");
        students.add("Alexey Kharitonov");
        students.add("Anton Bogdanov");
        students.add("Anton Sedkov");
        students.add("Artem Piven");
        students.add("Darya Shcherbina");
        students.add("Dmitry Luzko");
        students.add("Egor Shitikov");
        students.add("Gleb Balashevich");
        students.add("Ivan Yanushkevich");
        students.add("Kirill Taustukha");
        students.add("Kiryl Hudyna");
        students.add("Matvey Novosadny");
        students.add("Oleg Borikov");
        students.add("Roman Dubovik");
        students.add("Sergei Verbovskiy");
        students.add("Vladislav Drobot");
        students.add("Yan Traulko");
        for (int i = 0; i < 18; i++) {
            int task = i % tasks.length + 1;
            Random random = new Random();
            int index = random.nextInt(students.size());
            String student = students.get(index);
            map.put(student, task);
            students.remove(index);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry + "\n");
        }
    }
}
