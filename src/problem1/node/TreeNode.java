/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

public class TreeNode<E> {
    private E data;
    private TreeNode<E> leftchild;
    private TreeNode<E> rightchild;
    
    public TreeNode(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public TreeNode<E> getLeftchild() {
        return leftchild;
    }

    public void setLeftchild(TreeNode<E> leftchild) {
        this.leftchild = leftchild;
    }

    public TreeNode<E> getRightchild() {
        return rightchild;
    }

    public void setRightchild(TreeNode<E> rightchild) {
        this.rightchild=rightchild;
    }
}
