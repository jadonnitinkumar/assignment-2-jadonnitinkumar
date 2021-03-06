/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;

//to implement circular queue
public class MyCircularQueue {
    private Node front,end;

    public Node getFront(){
        return front;
    }

    public Node getEnd(){
        return end;
    }

    public void setFront(Node front){
        this.front=front;
    }

    public void setEnd(Node end){
        this.end=end;
    }

    public void enqueue(Node newNode){
        if(getFront()==null && getEnd()==null){
            setFront(newNode);
            setEnd(newNode);
            getEnd().setNext(getFront());
        } else{
            newNode.setNext(getFront());
            getEnd().setNext(newNode);
            setEnd(getEnd().getNext());
        }
    }

    public void traverseQueue(){
        Node temp = getFront();
        while (true){
            System.out.println(temp.getS());
        }
    }

}
