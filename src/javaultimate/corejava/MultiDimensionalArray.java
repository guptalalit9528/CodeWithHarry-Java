package corejava;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int [][] flats = new int[2][3];
        flats[0][0] = 85;
        flats[0][1] = 10;
        flats[0][2] = 80;
        flats[1][0] = 43;
        flats[1][1] = 54;
        flats[1][2] = 23;


        //int [][] flats = {{12,11,22,32},{43,65,76,34}};

        for(int i = 0; i < flats.length; i++){
            for(int j = 0; j < flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
