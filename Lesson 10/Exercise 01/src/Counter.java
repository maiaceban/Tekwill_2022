/**
 * Counter
 */
/*
    You are given a class named Counter. Write two instance methods:
    ● inc that increases the value of the field current by one;
    ● getCurrent that returns the current value;
     */
public class Counter {

    int current;

    public void inc() { // inc that increases the value of the field current by one;
        this.current++;
    }

    public int getCurrent() { //getCurrent that returns the current value;
        return current;
    }
}