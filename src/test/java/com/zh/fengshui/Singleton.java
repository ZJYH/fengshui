package com.zh.fengshui;

import com.zh.fengshui.singleton.Userqqq;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class Singleton {


    @Test
    public void nic(){

        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Userqqq.getUser());
                }
            }).start();
        }
    }

}
