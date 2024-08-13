public class searchANumIn2DArray {
    public static void main(String[] args) {
        int [][] intArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int searchNumber =7;
        boolean isFound = false;

        for(int i = 0; i < intArray.length; i++){
            for (int j = 0; j < intArray.length; j++){
                if (intArray[i][j] == searchNumber){
                    isFound = true;
                }
            }
            System.out.println();
        }
        System.out.println("The value is Found: " +isFound);
    }
}
