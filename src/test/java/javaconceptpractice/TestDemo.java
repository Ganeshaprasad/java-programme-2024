package javaconceptpractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {

        Element el1= new Element("Mar1","mar11");
        Element el2= new Element("Mar2","mar12","Url");

        List<Element> list =new ArrayList<>();
        list.add(el1);
        list.add(el2);

        MarqueeComponent mc=new MarqueeComponent("main hello","maintype",list);

        System.out.println(mc);
        // need toadd Gson dependcy comvert java obj to json


        LinkedList list1 =new LinkedList<>();

        ArrayList list2 =new ArrayList<>();
    }
}
