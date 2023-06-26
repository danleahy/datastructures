package datastructures.doublelinkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {

    DoubleLinkedList list;

    @BeforeEach
    void setUp() {

        list = new DoubleLinkedList(5);
    }

    @Test
    void append() {
        //Arrange
        list.printList();
        //Act
        list.append(6);
        //Assert
        assertEquals(2, list.length);
    }

    @Test
    void appendArray() {
        //Arrange
        DoubleLinkedList list = new DoubleLinkedList(2,3,4);

        list.printList();
        //Act
        list.append(6);
        //Assert
        assertEquals(4, list.length);
        list.printList();
    }

    @Test
    void removeLast() {
        //Arrange
        DoubleLinkedList list = new DoubleLinkedList(2,3,4);

        list.printList();
        //Act
        DoubleLinkedList.Node lastNode = list.removeLast();
        System.out.println(lastNode);
        //Assert
        assertEquals(2, list.length);
        list.printList();
    }

    @Test
    void removeLastNull() {
        //Arrange
        DoubleLinkedList list = new DoubleLinkedList();

        //Act
        list.removeLast();
        //Assert
        assertEquals(0, list.length);
    }

    @Test
    void removeLastNodeOnceItem() {
        //Arrange
        DoubleLinkedList list = new DoubleLinkedList(1000);

        //Act
        DoubleLinkedList.Node lastNode = list.removeLast();
        //Assert
        assertEquals(0, list.length);
        assertEquals(1000, lastNode.value);
    }

    @Test
    void prePend() {

        //Arrange
        DoubleLinkedList list = new DoubleLinkedList(1000);

        //Act
        DoubleLinkedList.Node lastNode = list.prePend(100);
        //Assert
        assertEquals(2, list.length);
        assertEquals(100, list.head.value);
    }



    @Test
    void prePendMultiple() {

        //Arrange
        DoubleLinkedList list = new DoubleLinkedList(1000,2,3,4,5);

        //Act
        DoubleLinkedList.Node lastNode = list.prePend(100);
        //Assert
        assertEquals(6, list.length);
        assertEquals(100, list.head.value);
    }
    @Test
    void prePendEmptyList() {

        //Arrange
        DoubleLinkedList list = new DoubleLinkedList();

        //Act
        DoubleLinkedList.Node lastNode = list.prePend(100);
        //Assert
        assertEquals(1, list.length);
        assertEquals(100, list.head.value);
    }

    @Test
    void removeFirst() {
        //Arrange
        DoubleLinkedList list = new DoubleLinkedList(1,2,4);

        //Act
        list.removeFirst();
        //Assert
        assertEquals(2, list.length);
        assertEquals(2, list.head.value);

    }

    @Test
    void removeFirstEmptyList() {
        //Arrange
        DoubleLinkedList list = new DoubleLinkedList();

        //Act
        list.removeFirst();
        //Assert
        assertEquals(0, list.length);
        assertNull(list.head);
        assertNull(list.tail);

    }

    @Test
    void get() {

        DoubleLinkedList list = new DoubleLinkedList(1,2,3,4,5,6,7,8,10);

        //Act
        DoubleLinkedList.Node node = list.get(0);
        DoubleLinkedList.Node node1 = list.get(4);
        DoubleLinkedList.Node node3 = list.get(8);
        DoubleLinkedList.Node nullNode = list.get(-1);

        //Assert
        assertEquals(1, node.value);
        assertEquals(5, node1.value);
        assertEquals(10, node3.value);
        assertNull(nullNode);

    }

    @Test
    void set() {
        //Arrange
        DoubleLinkedList list = new DoubleLinkedList(1,2,3,4,5,6,7,8,10);
        //Act
        list.set(0,100);
        //Assert
        assertEquals(100,list.get(0).value);
    }

    @Test
    void setInvalidIndex() {
        //Arrange
        DoubleLinkedList list = new DoubleLinkedList(1,2,3,4,5,6,7,8,10);
        //Act
        boolean isSet = list.set(-1, 100);
        //Assert
        assertFalse(isSet);
    }
}
