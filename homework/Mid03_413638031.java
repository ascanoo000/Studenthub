//----Mid03 413638031 王鼎元

import java.util.Random;

public static void Mid03(){
    Random rand = new Random();

    int[] s = new int[15];

    for( int i = 0;  i < s.length; i++) {
        s[i] = rand.nextInt(9) + 1;
    }

    for( int i = 0; i < s.length; i++) {
        System.out.print(s[i] + " ");

        if ((i+1) % 5 == 0){
            System.out.print("\n");
        }
    }
    System.out.print("\n");
    int k = 0;
    for(int i = 0; i < 5; i++){
        for(int j = 0; j< i+1; j++){
            System.out.print(s[k] + " ");
            k++;
        }
        System.out.println();
    }
}