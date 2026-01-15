package practice_8.task_5;

public class Box<T> {
    public T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
