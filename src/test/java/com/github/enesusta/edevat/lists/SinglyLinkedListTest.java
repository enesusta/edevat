package com.github.enesusta.edevat.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SinglyLinkedListTest {

    @Test
    public void iteratorShouldWork() {

        SinglyLinkedList<Integer> integers = new SinglyLinkedList<>();
        integers.insertHead(15);
        integers.insertHead(25);
        integers.insertHead(35);

        for (Integer integer : integers) {
            System.out.println("integer = " + integer);
        }

    }
}
