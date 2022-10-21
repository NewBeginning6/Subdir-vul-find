package org.example;

import java.util.ArrayList;
import java.util.List;

public class CheckTarget {
    public  static List<String> CheckU(String target) {
        List<String> targetlist = new ArrayList<String>();
        List<String> backlist = new ArrayList<String>();
        if (target.indexOf("#") != -1) {
            target = target.substring(0, target.lastIndexOf("#"));
        }
        if (target.indexOf("?") != -1) {
            target = target.substring(0, target.lastIndexOf("?"));
        }
        if (target.startsWith("http://")) {
            target = target.substring(7);
            System.out.println(target);
            while (target.contains("/") == true){
                target = target.substring(0, target.lastIndexOf("/"));
                backlist.add("http://"+target);
            }
            backlist.add("http://"+target);
        }
        if (target.startsWith("https://")) {
            target = target.substring(8);
            //System.out.println(target);
            while (target.contains("/") == true){
                target = target.substring(0, target.lastIndexOf("/"));
                backlist.add("https://"+target);
            }
            backlist.add("https://"+target);
        }
        return backlist;
    }
}