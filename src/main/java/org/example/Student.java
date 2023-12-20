package org.example;
// Абстрактный класс Student
abstract class Student {
    // Поля
    private String fullName;
    private int course;
    private int lastExamGrade;

    // Конструктор
    public Student(String fullName, int course, int lastExamGrade) {
        this.fullName = fullName;
        this.course = course;
        this.lastExamGrade = lastExamGrade;
    }

    // Абстрактный метод
    public abstract void writeExam();

    // Геттеры
    public String getFullName() {
        return fullName;
    }

    public int getCourse() {
        return course;
    }

    public int getLastExamGrade() {
        return lastExamGrade;
    }
}

// Подкласс IUStudent
class IUStudent extends Student {
    // Конструктор
    public IUStudent(String fullName, int course, int lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    // Реализация абстрактного метода
    @Override
    public void writeExam() {
        System.out.println("Студент направления Интернет-технологии пишет экзамен.");
    }
}

// Подкласс MathStudent
class MathStudent extends Student {
    // Конструктор
    public MathStudent(String fullName, int course, int lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    // Реализация абстрактного метода
    @Override
    public void writeExam() {
        System.out.println("Студент направления Математика пишет экзамен.");
    }
}