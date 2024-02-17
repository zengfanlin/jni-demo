package com.j;

/**
 * @Classname com.j.HelloJNI
 * @Description
 * @Date 2024/2/17 15:05
 * @Created by Administrator
 */
public class HelloJNI {
    static {
        System.loadLibrary("hello"); // Load native library at runtime
        // hello.dll (Windows) or libhello.so (Unixes)
    }

    // Declare a native method sayHello() that receives nothing and returns void
    public native void sayHello(int param);

    // Test Driver
    public static void main(String[] args) {
        try {
            while (true) {

                int i = 1;
                new HelloJNI().sayHello(i);
                Thread.sleep(3000);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
