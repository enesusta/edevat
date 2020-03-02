package com.github.enesusta.edevat.lists;

import java.util.Iterator;

public class DoublyLinkedList<E> implements Iterable<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public void insertHead(final E data) {
        Node<E> node = new Node<>(data);
        node.next = head;

        if (head == null)
            tail = node;
        else
            head.previous = node;

        head = node;
        size++;
    }

    public void insertTail(final E data) {
        Node<E> node = new Node<>(data);

        if (tail == null) {
            head = null;
        } else {
            tail.next = node;
            node.previous = tail;
        }

        tail = node;
        size++;
    }

    public void traverseHead() {
        Node current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    public void traverseTail() {
        Node current = tail;
        while (current != null) {
            System.out.println(current);
            current = current.previous;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator<E>(head);
    }

}
