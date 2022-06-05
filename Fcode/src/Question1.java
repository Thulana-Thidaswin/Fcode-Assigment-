public class Question1 {
    public static void main(String[] args){
        //Since the question states "Given an array" I assumed that user input is not necessary
        //Declaring a 2D array so all the integers could be added and cross-checked and manually assigned
        int[][] numberArray=new int[6][2];
        numberArray[0][0]=3;
        numberArray[0][1]=4;
        numberArray[1][0]=1;
        numberArray[1][1]=2;
        numberArray[2][0]=5;
        numberArray[2][1]=2;
        numberArray[3][0]=7;
        numberArray[3][1]=10;
        numberArray[4][0]=4;
        numberArray[4][1]=3;
        numberArray[5][0]=2;
        numberArray[5][1]=5;
        //Two for loops are called for to traverse from so EVERY possible way can be calculated
        //It will keep the left hand variable constant and check for all the combinations on the right for example
        // [1,0],[1,1],[1,2] after the right hand reachess the counter it would start again with 2, [2,0],[2,1],[2,2]
        for (int counter1 = 0; counter1 < 6; counter1++){  //This For loop is for the first increment
            for (int counter2=0 ; counter2 < 6; counter2++){ //This For loop is for the Second increment
                if (numberArray[counter1][0]==numberArray[counter2][1]){
                    //Compares the first value of the two integer array with the second value of ALL the combinations
                    //and prints it out
                    System.out.println(numberArray[counter1][0]+" "+numberArray[counter1][1]);
                }
            }
        }

    }
}
