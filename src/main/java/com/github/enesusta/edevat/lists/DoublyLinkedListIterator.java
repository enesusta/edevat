package com.github.enesusta.edevat.lists;

import java.util.Iterator;

public class DoublyLinkedListIterator<E> implements Iterator<E> {

    private Node<E> head;

    DoublyLinkedListIterator(final Node<E> head) {
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
