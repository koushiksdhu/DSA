import java.util.*;

public class customArrayList<T extends Number> {        // Only extends Number class. (Number class contains Integer, Float, Double, etc)
    // Now, T should either be Number or it subclasses.
    
    private Object[] data;
    private int DEFAULT_SIZE = 10;  
    private int size = 0;

    public customArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if(this.isFull()) {
            this.resize();
        }
        this.data[size++] = num;
    }

    public boolean isFull() {
        return this.size == this.data.length;
    }

    public void resize() {
        Object newData[] = new Object[this.data.length * 2];
        for(int i = 0; i < this.data.length; i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
    }
     
    // public int remove(T idx) {
    //     T removed = (T)(this.data[idx]);
    //     for(int i = idx; i < this.data.length-1; i++) {
    //         this.data[i] = this.data[i+1];
    //     }
    //     this.data[data.length - 1] = 0;
    //     return removed;
    // }

    public T remove() {
        return (T)(this.data[--this.size]);
    }

    public T get(int idx) {
        return (T)(this.data[idx]);
    }

    public int size() {
        return this.size;
    }

    public void set(int idx, T value) {
        this.data[idx] = value;
    }

    public void getList(List<? extends Number> list) {      // List<? extends Number> -> This means we can pass number as well as its subclasses like Integer, Float, etc.
        // do something
    }

    public String toString() {
        return "List: "+Arrays.toString(this.data)+" \tSize: "+this.size;
    }
    
    public static void main(String args[]) {
        customArrayList<Integer> list = new customArrayList<>();
        // list.add("Koushik");
        // list.add("Shuvam");
        // list.add("Pranay");
        // list.add("Anmol");
        // list.add("Adarsh");
        for(int i = 0; i < 10; i++) {
            list.add(i * 2 % 7);
        }
        list.add(100);
        System.out.println(list);
    }
}
