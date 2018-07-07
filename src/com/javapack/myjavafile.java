package com.javapack;

import com.learn.myktfile;

public class myjavafile {
    public static void main(String[] args) {

        System.out.println(myktfile.display(10, 3));
        
//JvmOverloads
        System.out.println("Without Height: "+myktfile.findVolume(10, 5));
        System.out.println("With Height: "+myktfile.findVolume(10, 5, 20));
    }
    public static int multi(int x, int y){

        return (x * y);
    }
}
