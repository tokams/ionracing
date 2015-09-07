package com.ionracing.main;

import com.ionracing.io.TestReader;

/**
 * Created by fabriece on 06.02.2015.
 */
public class Test {

    public static void main(String[] args){
        System.out.println("test");
        System.out.println((char)50);
        TestReader reader = new TestReader();
        System.out.println(reader.getSensor());
    }
}
