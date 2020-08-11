package com.github.enesusta.edevat.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {

    @Test
    public void test1() {

        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.insertHead(35);
        doublyLinkedList.insertHead(25);
        doublyLinkedList.insertHead(15);
        doublyLinkedList.insertTail(45);
        doublyLinkedList.insertTail(65);

        for (Integer integer : doublyLinkedList) {
            System.out.println("integer = " + integer);
        }


    }

}
