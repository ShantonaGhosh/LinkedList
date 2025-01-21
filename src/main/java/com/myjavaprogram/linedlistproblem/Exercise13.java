/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myjavaprogram.linedlistproblem;

import java.util.LinkedList;

public class Exercise13 {

    public static void main(String[] args) {
        LinkedList<String> data = new LinkedList<String>();
        data.add("Red");
        data.add("Green");
        data.add("Orange");
        data.add("Black");
        String a = data.removeFirst();
        System.out.println(a);
        String b = data.removeLast();
        System.out.println(b);

    }

}
