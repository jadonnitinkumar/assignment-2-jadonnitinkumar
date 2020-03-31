package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue<Object, Object> myPriorityQueue = new MyPriorityQueue<>();
        myPriorityQueue.add(new Student(1, "Nitin kumar"));
        myPriorityQueue.add(new Student(2, "Mukul"));
        myPriorityQueue.add(new Student(3, "Krishna"));
        myPriorityQueue.add(new Student(4, "Pranjal"));
        myPriorityQueue.add(new Student(5, "Vedant"));
        System.out.println(myPriorityQueue);
    }
}