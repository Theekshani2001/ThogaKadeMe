/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thogakade;

/**
 *
 * @author Niroth Samarawickram
 */
public class A {
    private static A ob;
    private A(){
        
    }
    public static A getInstance(){
        if(ob==null){
            ob=new A();
        }
        return ob;
    }
}
