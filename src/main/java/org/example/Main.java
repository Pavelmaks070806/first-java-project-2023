package org.example;

public class Main {
    public static void main(String[] args){
        IUStudent iuStudent = new IUStudent("Иванов Иван Иванович", 3, 5);
        MathStudent mathStudent = new MathStudent("Петров Петр Петрович", 2, 4);

        iuStudent.writeExam();
        mathStudent.writeExam();

        System.out.println("Информация о студенте Интернет-технологии:");
        System.out.println("ФИО: " + iuStudent.getFullName());
        System.out.println("Курс: " + iuStudent.getCourse());
        System.out.println("Оценка за последний экзамен: " + iuStudent.getLastExamGrade());

        System.out.println();

        System.out.println("Информация о студенте Математика:");
        System.out.println("ФИО: " + mathStudent.getFullName());
        System.out.println("Курс: " + mathStudent.getCourse());
        System.out.println("Оценка за последний экзамен: " + mathStudent.getLastExamGrade());
    }
}