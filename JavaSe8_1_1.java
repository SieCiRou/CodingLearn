public class JavaSe8_1_1 {
    // 這{}為class scope，類別內容可以放 欄位（fields / instance variables）方法（methods）
    int x = 10;     // 欄位（instance variable）
    String msg = "Hello Java";
    public static void main(String args[]){
        // main 方法的 {} 就是 method scope
        int y = 20; //區域變數

        System.out.println(y);
        // System.out.println(x); 靜態方法不能直接用非靜態欄位，x 是「物件的欄位」還沒產生物件

        JavaSe8_1_1 obj = new JavaSe8_1_1(); //建立物件
        System.out.println(obj.x); //透過物件存取
    }
}

