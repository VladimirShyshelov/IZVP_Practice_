package vladimir.shyshelov;
import java.util.Scanner;

import java.util.Arrays;

public class Main {

    //------------3.1----------//

    public static void changeRowsWithMaxAndMinElements(int[][] matrix){
        int rowOfMaxElement = 0; //Variable saves max element row number
        int rowOfMinElement = 0; //Variable saves min element row number
        int tempMaxElementValue = matrix[0][0]; //Variable saves max element value
        int tempMinElementValue = matrix[0][0]; //Variable saves min element value

        for(int i = 0; i < matrix.length; i++){ //Search by matrix values
            for(int j = 0; j < matrix[i].length; j++){

                if(matrix[i][j] > tempMaxElementValue){ //If element more than max
                    tempMaxElementValue = matrix[i][j]; //Rewrite max value
                    rowOfMaxElement = i;
                }

                if(matrix[i][j] < tempMinElementValue){ //If element less than min
                    tempMinElementValue = matrix[i][j]; //Rewrite min value
                    rowOfMinElement = i;
                }

            }
        }

        for(int i = 0; i < matrix.length; i++) { //Change lines places
            int temp = matrix[rowOfMaxElement][i];
            matrix[rowOfMaxElement][i] = matrix[rowOfMinElement][i];
            matrix[rowOfMinElement][i] = temp;
        }
    }

    public static int numberOfFirstRowWithPositiveElement(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) { //If element is positive
                    return i; //Return number of element row
                }
            }
        }

        return -1;
    }
        //------------3.2----------//

        public static String findFirstVowelLetterAndChangeItToSymbol(String str, char s){
            str = str.replaceFirst("[eyuioa]{1}+", ""+s); //Replace first RegEx true symbol by character
            return str;
        }

        public static void showOnlyStringsThatStartWithDashAndSpaceSymbolsBeforeIt(String str){
            if(str.matches("^\\s*-+.*$"))
                System.out.println(str);
        }

        public static void main(String[] args){

            //------------------3.1-------------------//
            System.out.println("//------------------3.1-------------------//");


            int[][] matrix = new int[][]{{-1,-2,-3,-4,-5}, {6,7,8,9,0}, {1,2,3,4,5}, {6,7,8,9,100}, {1,2,3,4,5}};

            changeRowsWithMaxAndMinElements(matrix);


            for(int i = 0; i < matrix.length; i++){ //Matrix show
                for(int j = 0; j < matrix[i].length; j++){
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.print("\n");
            }

            System.out.println(numberOfFirstRowWithPositiveElement(matrix)+1);

            //------------------3.2-------------------//
            System.out.println("//------------------3.2-------------------//");



            Scanner s = new Scanner(System.in);

            System.out.println("Enter string");
            String str1 =  s.nextLine(); //Enter string

            System.out.println("Enter one symbol");
            String ch =  s.nextLine(); //Enter string

            str1 = findFirstVowelLetterAndChangeItToSymbol(str1,ch.charAt(0));
            System.out.println(str1); //Show function result

            System.out.println("Enter string plz");
            String str2 = s.nextLine(); //Enter string
            System.out.println("Enter string plz");
            String str3 = s.nextLine(); //Enter string
            System.out.println("Enter string plz");
            String str4 = s.nextLine(); //Enter string
            System.out.println("Enter string plz");
            String str5 = s.nextLine(); //Enter string
            System.out.println("Enter string plz");
            String str6 = s.nextLine(); //Enter string

            showOnlyStringsThatStartWithDashAndSpaceSymbolsBeforeIt(str2);
            showOnlyStringsThatStartWithDashAndSpaceSymbolsBeforeIt(str3);
            showOnlyStringsThatStartWithDashAndSpaceSymbolsBeforeIt(str4);
            showOnlyStringsThatStartWithDashAndSpaceSymbolsBeforeIt(str5);
            showOnlyStringsThatStartWithDashAndSpaceSymbolsBeforeIt(str6);

        }


}