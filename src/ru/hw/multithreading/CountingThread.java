package ru.hw.multithreading;

public class CountingThread extends Thread{

    float[] array;
    int startIndex;
    CountingThread(String name, float[] array, int startIndex){
        super(name);
        this.array = array;
        this.startIndex = startIndex;
    }

    @Override
    public void run(){
        for(int i = 0; i < array.length; i++){
            array[i] = (float)(array[i] * Math.sin(0.2f + (i + startIndex) / 5) * Math.cos(0.2f + (i + startIndex) / 5) * Math.cos(0.4f + (i + startIndex) / 2));
        }
    }
}
