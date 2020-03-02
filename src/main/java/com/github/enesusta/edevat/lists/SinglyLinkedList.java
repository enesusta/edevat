package com.github.enesusta.edevat.lists;

import java.util.Iterator;

public class SinglyLinkedList<E> implements Iterable<E> {

    private Node<E> head;
    private int size;

    void insertHead(final E data) {
        Node<E> node = new Node<>(data);
        node.next = head;
        head = node;
        size++;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator<>(head);
    }
}
