import javafx.scene.control.Tab;

import java.util.Arrays;

public class Heap {

    public int leftChild(int i) {
        return 2 * i;
    }

    public int rightChild(int i) {
        return (2 * i) + 1;
    }

    public int showParents(int i) {
        return (i - 1) / 2;
    }

    public void swap(int i, int j) {
    }

    public Heap() {


        for (int i = heapSize - 1; i >= 0; i--) {
            heapify(i);
        }
    }


    int[] tablica = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
    int[] tablica2 = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
    int heapSize = tablica.length;


    private int getLargest(int i, int left, int right) {
        int largest;

        if (left < heapSize && tablica[left] > tablica[i]) {
            largest = left;
        } else {
            largest = i;
        }

        if (right < heapSize && tablica[right] > tablica[largest]) {
            largest = right;
        }
        return largest;
    }

    public void heapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int largest;

        largest = getLargest(i, left, right);

        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }
    }

    public void print() {
        System.out.println(Arrays.toString(tablica));
    }
}