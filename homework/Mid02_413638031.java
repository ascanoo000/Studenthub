//----Mid02  413638031 王鼎元
public static void Mid02() {

    for(int i = 1; i<=3; i++){
        System.out.printf(i + "  "+"%.4f", pi(i));
        System.out.println();
}
    System.out.println();

    for(int i = 0; i < 10; i++);{
        int j = i*100 + 1;
        if (j==1){
            System.out.print("00"+ j);
        }else{
            System.out.print(j );
        }
        System.out.printf("  "+"%.4f", pi(j));
        System.out.println();
    }
}
public static double pi(int i){
    double ans =0.0 ;
    for(int n = 1; n <= i; n++){
        ans += Math.pow(-1,n+1)/(2*n - 1);
    }
    return 4*ans;
}