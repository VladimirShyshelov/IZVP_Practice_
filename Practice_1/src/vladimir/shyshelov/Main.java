package vladimir.shyshelov;

public class Main {
    public static boolean increasingArray(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){
            //Вoolean Variable saves increasing array or not (1 - Y, 0 - N)
            boolean greaterOrEqual = arr[i] > arr[i + 1];
            //If next element value more than previous value variable greaterOrEqual will be True and function return False
            if (greaterOrEqual) return false;
        }

        return true;
    }

    public static void fizzBuzz(){
        for(int i = 0; i <= 100; i++){

            boolean numberMultipleOf3 = i % 3 == 0; //Variable saves did number divided by 3
            boolean numberMultipleOf5 = i % 5 == 0; //Variable saves did number divided by 3

            //Show numbers
            if (numberMultipleOf3 && numberMultipleOf5) System.out.println("FizzBuzz");
            else if (numberMultipleOf3) System.out.println("Fizz");
            else if (numberMultipleOf5) System.out.println("Buzz");
            else System.out.println(i);

        }
    }


    public static boolean halfArraySum(int[] arr){
        int length = arr.length;
        //Variables saves sum of first and second halves of array
        int sumFirstHalfArray = 0, sumSecondHalfArray = 0;

        for(int i=0;i<length;i++){ //Loop, that calculates sum of array halves
            if(i <=length/2){
                sumFirstHalfArray += arr[i];
            }  else{
                sumSecondHalfArray +=arr[i];
            }
        }

        if(sumFirstHalfArray == sumSecondHalfArray) //If halves are equal - return true, else - false
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int[] firstArray = {1,2,3,4,5,6}; //First test array
        int[] secondArray = {1,2,3,0,2,3,1}; //Second test array

        boolean successIncreasing = increasingArray(firstArray);
        boolean failIncreasing = increasingArray(secondArray);

        if(successIncreasing) System.out.println("True");
        else System.out.println("False");

        if(failIncreasing) System.out.println("True");
        else System.out.println("False");

        fizzBuzz();

        boolean failHalfEqual = halfArraySum(firstArray);
        boolean successHalfEqual = halfArraySum(secondArray);

        if(failHalfEqual) System.out.println("True");
        else System.out.println("False");

        if(successHalfEqual) System.out.println("True");
        else System.out.println("False");
    }

    //Hello this is my commit to Vova
}
