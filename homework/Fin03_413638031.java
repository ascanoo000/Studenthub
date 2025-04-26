//----Fin03 413638031 王鼎元

import java.util.Random;

public static void Fin03(){
    int[] res1 = getRandArr(3, 1, 2, 5, 8, 9);
    disPlayArr(res1)

    int[] res2 = getRandArr(4, 1, 2, 5);
    disPlayArr(res2);

} 

public static void disPlayArr(int[] arr){
    if(arr.length != 0){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("\n\n");
    }else{
        System.out.println("null array");
    }
}

public static int[ ] getRandArr(int n, int... numbers){
    if(n > numbers.length) {
        return new int[0];
    }
    int[] result = new int[0];
    boolean[] used = new boolean[numbers.length];
    Random random = new Random();

    for (int i = 0; i < n; ){
        int index = random.nextInt(numbers.length);
        if (!used[index]) {
            result[i] = numbers[index];
            used[index] = true;
            i++;
        }
    }
    return result
}