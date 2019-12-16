package task3.task31.model.entity;

import java.util.Arrays;
import java.util.Comparator;


public class PlayingRoom <E> {
    private static final  int DEFAULT_CAPACITY = 10;
    private Object[] box;
    private int size=0;
    private int capacity;
    private int selectionSize = 0;

    public PlayingRoom(int capacity) {
        this.capacity = capacity;
        box =  new Object[capacity];
    }

    public PlayingRoom() {
        this(DEFAULT_CAPACITY);
    }


    public boolean addToy(E toy){
        if(capacity==size){
            inciseCapacity();
        }
        box[size++] = toy;
        return true;
    }

    public int getBoxSize(){
        return this.size;
    }

    public E[] sort(Comparator<? super E> comparator){
        E[] boxCopy = (E[])Arrays.copyOf(box,box.length);
        Arrays.sort(boxCopy,comparator);
        return boxCopy;
    }

    public int getGeneralToysPrice(){
        int sum =0;
        for (Object elem : box) {
            if(elem instanceof AbstractToy){
                sum = sum+((AbstractToy) elem).getPrice();
            }

        }
        return sum;
    }

    public E[] getToysByParameters(int price, int age, String gender){
        E[] selectionList = (E[]) new Object[box.length];
        getToysBeforePrice(selectionList, price);
        getToysBeforeAge(selectionList,age);
        getToysByGender(selectionList,gender);
        return selectionList;
    }

    public E[] getToysBeforePrice(E[] list,int price){
        for (Object elem : box) {
            if(elem instanceof AbstractToy){
                AbstractToy toy = (AbstractToy) elem;
                if(toy.getPrice()<=price){
                    list[selectionSize++]= (E) toy;
                }
            }

        }
        return list;
    }

    public E[] getToysByGender(E[] list, String gender){
        for (Object elem : box) {
            if(elem instanceof AbstractToy){
                AbstractToy toy = (AbstractToy) elem;
                if(toy.getGender().equals(gender)){
                    list[selectionSize++]= (E) toy;
                }
            }

        }
        return list;
    }

    public E[] getToysBeforeAge(E[] list, int age){
        for (Object elem : box) {
            if(elem instanceof AbstractToy){
                AbstractToy toy = (AbstractToy) elem;
                if(toy.getAge()<=age){
                    list[selectionSize++]= (E) toy;
                }
            }

        }
        return list;
    }

    private void inciseCapacity(){
        int oldCapacity = size;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        box = Arrays.copyOf(box, newCapacity);
    }







}
