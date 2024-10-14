package org.example;

public class Hello implements HelloMBean {

    private long count = 0;

    @Override
    public long getCount() {
        return this.count;
    }

    public void increment() {
        this.count++;
    }


}
