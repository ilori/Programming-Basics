import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p23_AverageGrades {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        List<Double> grades = new ArrayList<>();
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = console.nextLine().split("\\s");
            String name = tokens[0];
            for (int j = 1; j < tokens.length; j++) {
                grades.add(Double.parseDouble(tokens[j]));
            }
            Student student = new Student();
            student.name = name;
            student.grade = student.getGrade(grades);
            list.add(student);
            grades.clear();

        }
        list = list.stream().filter(x -> x.grade >= 5.00).collect(Collectors.toList());
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                String x1 = o1.name;
                String x2 = o2.name;
                int sComp = x1.compareTo(x2);
                if (sComp != 0) {
                    return sComp;
                } else {
                    Double y1 = o1.grade;
                    Double y2 = o2.grade;
                    return y2.compareTo(y1);
                }
            }
        });
        for (Student student : list) {
            System.out.printf("%s -> %.2f%n", student.name, student.grade);
        }
    }


}


class Student {
    String name;
    Double grade;

    double getGrade(List<Double> grades) {
        double size = grades.size();
        double sum = 0;
        for (Double grade1 : grades) {
            sum += Double.parseDouble(String.valueOf(grade1));
        }
        return sum / size;
    }
}
