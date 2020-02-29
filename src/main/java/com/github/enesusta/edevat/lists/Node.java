package com.github.enesusta.edevat.lists;

public class Node<E> {

    final E data;
    Node next;
    Node previous;

    Node(final E data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }

}
