package com.company;

import java.util.Arrays;

class Queue{
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    Queue(int size){
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void dequeue(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
        }

        System.out.println("Removing " + arr[front]);

        front = (front + 1) % capacity;
        count--;
    }

    public void enqueue(int item){
        if (isFull()){
            System.out.println("Queue is full");
        }

        System.out.println("Inserting " + item);

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return arr[front];
    }

    public int size() {
        return count;
    }

    public Boolean isEmpty() {
        return (size() == 0);
    }

    public Boolean isFull() {
        return (size() == capacity);
    }

    public void Display(){
        System.out.print("The Line Up is ");
        for (int A : arr) {
            if (A != 0){
                System.out.print(A + ", ");
            }
        }
    }

}

