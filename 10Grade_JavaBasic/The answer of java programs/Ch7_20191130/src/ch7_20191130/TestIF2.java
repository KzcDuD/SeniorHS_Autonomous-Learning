/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20191130;

/**
 *
 * @author xvpow
 */
public interface TestIF2 {
    public default void testDefault(){
        System.out.println("TestIF2!!");
    }
     public static void testStatic(){
        System.out.println("TestIF2!!");
    }
}