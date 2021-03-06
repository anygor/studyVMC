package LinkedList;

import java.util.Scanner;

public class LinkedListMenu {
    public static void menu(){
        LinkedList<String> list = new LinkedList<String>();
        String command;
        String executableString;

        Scanner scanner = new Scanner(System.in);

        System.out.println("This is your list management tool");
        System.out.println("Type help to see available commands");
        System.out.println("Type quit to finish program");

        loop:
        while (true) {
            System.out.println("Digit a command:");
            command = scanner.nextLine();
            switch (command) {
                case "help": {
                    System.out.println("pushFront - to add a certain value to the head of list");
                    System.out.println("pushBack - to add a certain value to the tail of list");
                    System.out.println("peekFront - to look at the head of list");
                    System.out.println("peekBack - to look at the tail of list");
                    System.out.println("popFront - to return and remove the head of your list");
                    System.out.println("popBack - to return and remove the tail of your list");
                    System.out.println("takeFromFile - get values from data file to your list");
                    System.out.println("putToFile - export list to file");
                    System.out.println("pushAtIndex - to add element at certain place");
                    System.out.println("popAtIndex - to get element from certain place");
                    System.out.println("peekAtIndex - to observe element at certain place");
                    System.out.println("clear - clear list");
                    System.out.println("printQueue - to see elements from head to tail");
                    break;
                }
                case "pushFront" : {
                    System.out.println("Type a value you want to push");
                    executableString = scanner.nextLine();
                    scanner = new Scanner(System.in);
                    list.pushFront(executableString);
                    System.out.println("Pushed " + executableString + " to the front of your list");
                    break;
                }
                case "pushBack" : {
                    System.out.println("Type a value you want to push");
                    executableString = scanner.nextLine();
                    scanner = new Scanner(System.in);
                    list.pushBack(executableString);
                    System.out.println("Pushed " + executableString + " to the back of your list");
                    break;
                }
                case "pushAtIndex" : {
                    System.out.println("Type a value you want to push");
                    executableString = scanner.nextLine();
                    scanner = new Scanner(System.in);
                    System.out.println("Type index");
                    int index = scanner.nextInt();
                    scanner = new Scanner(System.in);
                    list.pushAtIndex(executableString, index);
                    System.out.println("Success");
                    break;
                }
                case "popAtIndex" : {
                    System.out.println("Type index");
                    int index = scanner.nextInt();
                    scanner = new Scanner(System.in);
                    System.out.println("Removed element " + list.popAtIndex(index) + " from the list");
                    break;
                }
                case "peekAtIndex" : {
                    System.out.println("Type index");
                    int index = scanner.nextInt();
                    scanner = new Scanner(System.in);
                    System.out.println("Element " + list.peekAtIndex(index) + " on position " + index);
                    break;
                }
                case "peekFront" : {
                    System.out.println("Current head of list is " + list.peekFront());
                    break;
                }
                case "peekBack" : {
                    System.out.println("Current tail of list is " + list.peekBack());
                    break;
                }
                case "popFront" : {
                    System.out.println("Removed head with value " + list.popFront());
                    break;
                }
                case "popBack" : {
                    System.out.println("Removed tail with value " + list.popBack());
                    break;
                }
                case "clear" : {
                    list.clear();
                    System.out.println("List cleared");
                    break;
                }
                case "printList" : {
                    new LinkedListHelper().printList(list);
                    break;
                }
                case "takeFromFile" : {
                    new LinkedListHelper().takeFromFile(list);
                    break;
                }
                case "putToFile" : {
                    new LinkedListHelper().putToFile(list);
                }
                case "quit":{
                    System.out.println("Fare thee well");
                    break loop;
                }
                default:{
                    System.out.println("Invalid command, try again");
                    break;
                }
            }
        }
    }
}
