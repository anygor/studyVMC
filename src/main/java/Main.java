import AVLTree.AVLTreeMenu;
import LinkedList.LinkedListMenu;
import Matrix.MatrixMenu;
import Queue.QueueMenu;
import Stack.StackMenu;
import BinaryTree.BinaryTreeMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Stack");
        System.out.println("2 - Queue");
        System.out.println("3 - Linked List");
        System.out.println("4 - Stream List (tba)");
        System.out.println("5 - Matrix");
        System.out.println("6 - Binary Tree");
        System.out.println("7 - AVL Tree");

        loop:
        while (true) {
            System.out.println("Chose the menu");
            String command = input.nextLine();
            switch (command) {
                case "1":{
                    StackMenu.menu();
                    break;
                }
                case "2":{
                    QueueMenu.menu();
                    break;
                }
                case "3":{
                    LinkedListMenu.menu();
                    break;
                }
                case "5":{
                    MatrixMenu.menu();
                    break;
                }
                case "6":{
                    BinaryTreeMenu.menu();
                    break;
                }
                case "7" :{
                    AVLTreeMenu.menu();
                    break;
                }
                case "quit":{
                    System.out.println("cya");
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
