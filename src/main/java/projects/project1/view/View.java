package projects.project1.view;

import java.util.Collection;

public class View {

    public void print(String msg) {
        System.out.print(msg);
    }

    public void println(String msg) {
        System.out.println(msg);
    }

    public void printerr(String msg){
        System.err.println(msg);
    }

    public void printCollection(Collection<?> c) {
        for (Object o : c) {
            System.out.println(o);
        }
    }

}
