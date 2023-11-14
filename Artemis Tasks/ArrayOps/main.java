package fop.w3simple;

public class Arrays extends MiniJava {
    public static void print(int[] arr) {
	// TODO
    StringBuilder text = new StringBuilder("{");
    for(int i = 0 ; i < arr.length; i++){
        text.append(arr[i]);
        if(i <= (arr.length-2)) {
            text.append(", ");
        }
    }
    text.append("}");
    writeConsole(text.toString());
    }

    public static void minAndMax(int[] arr) {
	// TODO
        int Max = 0;
        int Min = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i == 0){
                Max = arr[i];
                Min = arr[i];
            }
            if(arr[i] > Max){
                Max = arr[i];
            }
            if(arr[i] < Min){
                Min = arr[i];
            }
        }
        writeConsole("Minimum = " + Min +", Maximum = " + Max);
    }

    public static int[] invert(int[] arr) {
	// TODO
        int[] inverted = new int[arr.length];
        for(int i = (arr.length-1); i >= 0; i--){
            inverted[arr.length - i - 1] = arr[i];
        }
        return inverted;
    }

    public static int[] cut(int[] arr, int len) {
	// TODO
        int[] newArray = new int[len];
        for(int i = 0; i < len; i++){
            if(i < arr.length){
                newArray[i] = arr[i];
            }else{
                newArray[i] = 0;
            }
        }
        return newArray;
    }

    public static int[] linearize(int[][] arr) {
	// TODO
        int totalElements = 0;
        for(int i = 0; i < arr.length; i++){
            totalElements += arr[i].length;
        }
        int[] newArray = new int[totalElements];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            for(int a = 0; a < arr[i].length; a++){
                newArray[index] = arr[i][a];
                index++;
            }
        }
        return newArray;
    }

    public static void main(String[] args){
        int[] test = new int[] {-1, 2, 3, 4, 5};
        int[][] TwoD = new int[][] {{1, 3, 5}, {-5, 0}, {5}};
        //minAndMax(test);
        //write(java.util.Arrays.toString(invert(test)));
        //write(java.util.Arrays.toString(cut(test, 3)));
        //write(java.util.Arrays.toString(linearize(TwoD)));
    }
}
