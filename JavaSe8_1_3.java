public class JavaSe8_1_3 {
    private String name;
    private int age;

    // 情況1：自己寫的「無參數建構子」（no-arg constructor）
    public JavaSe8_1_3() {
        this.name = "未知姓名";   // 給預設值
        this.age  = 0;
        System.out.println("使用無參建構子建立 Person");
    }

    // 情況2：自己寫的「有參數建構子」（多載之一）
    public JavaSe8_1_3(String name, int age) {
        this.name = name;
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("年齡不能負數");
        }
        System.out.println("使用有參建構子建立 Person");
    }

    // 情況3：另一個多載（overloading）
    public JavaSe8_1_3(String name) {
        this(name, 18);   // 委託給上面的建構子（constructor delegation）
        System.out.println("只給名字，預設年齡18");
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        JavaSe8_1_3 p1 = new JavaSe8_1_3();               // 呼叫無參建構子
        JavaSe8_1_3 p2 = new JavaSe8_1_3("小明");         // 呼叫只有名字的建構子
        JavaSe8_1_3 p3 = new JavaSe8_1_3("小華", 25);     // 呼叫完整參數建構子

        System.out.println(p1);   // Person{name='未知姓名', age=0}
        System.out.println(p2);   // Person{name='小明', age=18}
        System.out.println(p3);   // Person{name='小華', age=25}
    }
}