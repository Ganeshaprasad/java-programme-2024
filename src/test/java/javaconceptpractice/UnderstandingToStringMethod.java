package javaconceptpractice;

public class UnderstandingToStringMethod {
    String name;
    long mobileNo;
    int empId;


    public UnderstandingToStringMethod(String name, long mobileNo, int empId) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.empId = empId;
    }

    @Override
    public String toString()
    {
        return name+" "+mobileNo+" "+empId;
    }

    public static void main(String[] args) {
        UnderstandingToStringMethod demo = new UnderstandingToStringMethod("Ganesh", 7760705981l, 1234);
        System.out.println(demo.toString());
    }
}
