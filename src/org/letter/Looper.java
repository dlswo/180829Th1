package org.letter;

public class Looper {

    public void loop(){

        for(int i = 0; i <100000; i++){
            System.out.println(Thread.currentThread().getName()+":"+i+this+":"+i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
