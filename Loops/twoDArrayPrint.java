public class twoDArrayPrint {
public static void main(String[] args) {
    //printing 2D ARRAY in matrix format
    int [][] arrayItems = {{1, 7897, 34}, {2, 364, 53}, {3, 613, 979}};

    for (int i=0; i<= arrayItems.length-1; i++){
        for (int j=0; j<= arrayItems[i].length-1; j++ ){
            System.out.print(arrayItems[i][j]+" ");
        }
        System.out.println();
    }
}
    
} 