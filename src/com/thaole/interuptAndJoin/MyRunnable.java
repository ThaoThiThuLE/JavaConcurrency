package com.thaole.interuptAndJoin;

import static com.thaole.interuptAndJoin.ThreadColor.ANSI_RED;

/**
 * Created by Thao.Le
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of run()");
    }
}
