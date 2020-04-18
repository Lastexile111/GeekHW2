package ru.hw.multithreading;

public class Main {

    static final int size = 10000000;
    static final int h = size / 2;



    public static void main (String[] args){

        float[] arr = new float[size];

        for(int i = 0; i < size; i++){
            arr[i] = 1.0f;
        }

        System.out.println("result 1");
        long a = System.currentTimeMillis();

        for(int i = 0; i < size; i++){
            arr[i] = (float)(arr[i]*Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);

        float[] a1 = new float[h];
        float[] a2 = new float[h];

        System.out.println("result 2");
        a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread thread1 = new CountingThread("Thread-1", a1,0);
        Thread thread2 = new CountingThread("Thread-2", a2,h);

        thread1.start();
        thread2.start();

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.out.println(System.currentTimeMillis() - a);
    }
}
