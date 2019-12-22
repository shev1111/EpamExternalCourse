package task3.task31.model;

import task3.task31.model.entity.AbstractToy;
import java.util.Arrays;
import java.util.Comparator;

public class PlayingRoom <T extends AbstractToy> {
    private static final  int DEFAULT_CAPACITY = 10;
    private T[] box;
    private int size=0;
    private int capacity;

    public PlayingRoom(int capacity) {
        this.capacity = capacity;
        box = (T[]) new AbstractToy[capacity];
    }

    public PlayingRoom() {
        this(DEFAULT_CAPACITY);
    }

    public boolean addToy(T toy){
        if(capacity==size){
            increaseCapacity();
        }
        box[size++] = toy;
        return true;
    }

    public int getBoxSize(){
        return this.size;
    }

    public T[] sort(Comparator<? super T> comparator){
        T[] boxCopy = trimToSize(box);
        Arrays.sort(boxCopy,comparator);
        return boxCopy;
    }

    public int getGeneralToysPrice(){
        int sum =0;
        for (T elem : box) {
            if(elem!=null)sum = sum+elem.getPrice();
        }
        return sum;
    }

    public T[] getToysByParameters(int price, int age, String gender){
        int selectionIndex = 0;
        T[] selectionList = (T[]) new AbstractToy[box.length];
        for (T elem : box) {
            if(elem!=null && elem.getPrice()<=price && elem.getGender().equals(gender) && elem.getAge()<=age) selectionList[selectionIndex++]= elem;
        }
        return trimToSize(selectionList);
    }

    public T[] getToysArray(){
        return trimToSize(box);
    }

    private T[] trimToSize(T[] array) {
        int valuesIndex = 0;
        for (T elem:array) {
            if (elem!=null){
                valuesIndex++;
            }else {
                break;
            }
        }
        return  Arrays.copyOf(array, valuesIndex);
    }

    private void increaseCapacity(){
        int oldCapacity = size;
        capacity = oldCapacity + (oldCapacity >> 1);
        box = Arrays.copyOf(box, capacity);
    }

}
