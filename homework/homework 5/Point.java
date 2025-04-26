public class Point {
    // 成員變數
    int x;
    int y;

    // 建構子：初始化 x 和 y
    public Point(int x1, int y1) {
        this.x = x1;
        this.y = y1;
    }

    // 預設建構子：初始化 x 和 y 為 0, 0
    public Point() {
        this(0, 0); // 呼叫另一個建構子來初始化 x 和 y 為 0
    }

    // 設定點的座標
    public void setPoint(int setX, int setY) {
        this.x = setX;
        this.y = setY;
    }
}

