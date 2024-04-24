package array;

public class ArrayDi0 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        arr[0][0] = 1; //0행, 0열
        arr[0][1] = 2; //0행, 1열
        arr[0][2] = 3; //0행, 2열
        arr[1][0] = 4; //1행, 0열
        arr[1][1] = 5; //1행, 1열
        arr[1][2] = 6; //1행, 2열

        for(int row=0; row<2;row++){
            for(int col=0; col<3; col++){
                System.out.println("arr["+row+"]["+col+"]="+arr[row][col]);
            }
        }

        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(arr2.length);
        for(int row=0; row< arr2.length;row++){
            for(int col=0; col< arr2[row].length; col++){
                System.out.println("arr2["+row+"]["+col+"]="+arr[row][col]);
            }
        }


        int[][] arr3 = new int[2][3];
        int i = 1;
        // 2차원 배열의 길이를 활용
        for (int row = 0; row < arr3.length; row++) {
            for (int column = 0; column < arr3[row].length; column++) {
                arr3[row][column] = i++;
                System.out.print(arr3[row][column] + " ");
            }
            System.out.println();
        }
    }
}
