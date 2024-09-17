package javaconceptpractice;

import org.testng.annotations.Test;

public class ThisKeyword {
    @Test
    public  void main() {

        ThisKeyword th=new ThisKeyword();
        ThisKeyword th1=new ThisKeyword();
        System.out.println(th);
        System.out.println(th1);
        System.out.println(this);}
}
