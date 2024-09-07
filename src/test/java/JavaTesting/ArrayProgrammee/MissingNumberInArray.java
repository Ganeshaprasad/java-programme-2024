package JavaTesting.ArrayProgrammee;

public class MissingNumberInArray {
    public static void main(String[] args) {

        int a[] ={ 1, 2, 3, 5, 6};

        int lengthOfArray = a.length + 1;// expected lenght of array

        int expectedSum = lengthOfArray * (lengthOfArray + 1) / 2;// expected sum

        int actualSum=0;
        for(int b:a)
        {
            actualSum=actualSum+b;
        }
        int missingNumber=expectedSum-actualSum;
        System.out.println(missingNumber);



    }
}
