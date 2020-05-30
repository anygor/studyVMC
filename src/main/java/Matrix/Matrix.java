package Matrix;

import java.util.ArrayList;
import java.util.Collections;

public class Matrix {
    private int size;
    private ArrayList<Integer>[] rows;

    public Matrix(int size){
        this.size = size;
        rows = new ArrayList[size];
        for(int i = 0; i < size; i++) {
            rows[i] = new ArrayList(Collections.nCopies(size, null));
        }
    }

    public void add(int x, int y, int value){
        if (x < 0 || x >= size || y < 0 || y >= size) {
            System.out.println("Out of bounds");
        }
        else rows[x].add(y, value);
    }

    public Integer get(int x, int y){
        if (x < 0 || x >= size || y < 0 || y >= size) {
            System.out.println("Out of bounds");
            return null;
        }
        else return rows[x].get(y);
    }

    public void printMatrix(){
        for(int i = 0; i < size; i++){
            System.out.print(i + ". ");
            for(int j = 0; j < size; j++){
                System.out.print(rows[i].get(j) + " ");
            }
            System.out.println("\n");
        }
    }
}
