package com.github.enesusta.edevat.lists;

import java.util.Iterator;

public class LinkedListIterator<E> implements Iterator<E> {

    private Node<E> head;

    LinkedListIterator(final Node<E> head) {
        this.head = head;
    }

    @Override
    public boolean hasNext() {
        return head != null;
    }

    @Override
    public E next() {
        E data = head.data;
        head = head.next;
        return data;
    }
}
