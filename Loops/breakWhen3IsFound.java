public class breakWhen3IsFound {
    public static void main(String[] args) {
        Integer [] arraySample = {1,2,3,4,5,6,7,8,9,10};
        for (int i=0; i < arraySample.length; i++){
            System.out.print(arraySample[i]+" : ");
            for (int j = 0; j < arraySample.length; j++){
                if (arraySample[i] == 3 && arraySample[j] == 3){
                    break;
                }
                System.out.print(arraySample[j] + "  ");
            }
            System.out.println();

        }
    }
}
