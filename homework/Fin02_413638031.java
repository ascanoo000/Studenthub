//-----Fin02 413638031 王鼎元
public static void Fin02(){
    int[] list1 = new int[]{1, 4, 5, 8, 9};
    int[] list2 = new int[]{2, 4, 6, 8,};
    int[] res = intersect(list1,list2);

    for(int i = 0; i < res.length; i++){
        System.out.print(res[1]);
        if (i <res.length - 1) {
            System.out.println(", ");
        }
    }
    System.out.print("\n");
}

public static int[] intersect(int[ ]list1, int[] list2){
    int[] tmp =new int[list1.length];
    int k =0;
    for (int i = 0; i < list1.length; i++){
        for(int i = 0; i < list2.length; j++){
            if(list1[i] == list2[j]){
                tmp[k] = list1[i];
                k++;
            }
        }
    }
    int[] res = new int[k];
    for(int i = 0; i < k; i++){
        res[i] = tmp[i];
    }
    return res;
}