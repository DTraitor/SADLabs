package com.labwork3;

import java.util.Iterator;
import java.util.List;

/**
 * A simple linked list
 */
public class LinList implements Iterable<Integer> {
    /**
     * A simple node for the linked list
     */
    private class Node {
        int data;
        Node next = null;
    }

    private Node head;

    /**
     * Default constructor
     */
    public LinList() {
        head = null;
    }

    /**
     * Add a new element to the end of the list
     * @param data The data to add
     */
    public void add(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new LinListIterator();
    }

    public Iterator<Integer> sortedIterator() {
        return new SortedLinListIterator();
    }

    /**
     * An iterator for the linked list
     */
    private class LinListIterator implements Iterator<Integer> {
        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Integer next() {
            int data = current.data;
            current = current.next;
            return data;
        }
    }

    private class SortedLinListIterator implements Iterator<Integer> {
        final private List<Node> usedNodes = new java.util.ArrayList<>();
        private Node start = head;

        @Override
        public boolean hasNext() {
            return start != null;
        }

        @Override
        public Integer next() {
            Node smallest = start;
            Node current = start;
            while (current != null) {
                if (current.data < smallest.data && !usedNodes.contains(current)) {
                    smallest = current;
                }
                current = current.next;
            }
            usedNodes.add(smallest);
            if (smallest == start){
                while (usedNodes.contains(start)){
                    start = start.next;
                }
            }
            return smallest.data;
        }
    }
}
