package com.thaole.runableAndThread;

import static com.thaole.runableAndThread.ThreadColor.ANSI_RED;

/**
 * Created by Thao.le
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnable's implementation of run()");
    }
}
