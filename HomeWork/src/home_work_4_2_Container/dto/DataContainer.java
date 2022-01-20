package home_work_4_2_Container.dto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public int add(T item) {
        for (int index = 0; index < data.length; index++) {
            if (data[index] == null) {
                data[index] = item;
                return index;
            }
        }
        this.data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = item;
        return data.length - 1;
    }

    public T get(int index) {
        if (index >= data.length || index < 0) {
            return null;
        }
        return data[index];
    }

    public T[] getItems() {
        return data;
    }

    public boolean delete (int index){

        if (index > 0 && index <= data.length){
            data[index] = null;
            return true;
        } else {
            return false;
        }
    }

    public boolean delete(T item){
        for (int index = 0; index < data.length; index++){
            if (Objects.equals(data[index],item)){
                delete(index);
                return true;
            }
        } return false;
    }

    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = data.length - 1; j > i; j--) {
                if (comparator.compare(data[j - 1], data[j]) > 0) {
                    T arr = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = arr;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "DataContainer{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
