package org.letter;

import java.io.InputStream;
import java.net.URL;

public class MultiRequest {

    public static void main(String[] args) throws Exception{
        String str = "http://www.ilbe.com/index.php?/mid=epicurism8page=";

        for(int i = 1; i <=24000; i++){
            int finall =i;
            new Thread(() -> {
                System.out.println(str + finall);

                try {
                    URL url = new URL(str + (finall%240) + 1);
                    InputStream in = url.openStream();
                    in.close();
                }catch (Exception e){

                }
            }).start();
        }
    }
}
