/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.node;

import problem5.student.Student;

// to define node properties
public class Node {
    private Student s;
    private Node next;

    public Node(Student s){
        this.s = s;
        next = null;
    }

    public void setNext(Node next) {
        this.next=next;

    }

    public Node getNext() {
        return next;
    }

    public void getS(Student s) {
        this.s=s;
    }

    public Student getS() {
        return s;
    }
}
