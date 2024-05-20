public class Test {
    String name;
    int age;
    String ID;
    public Test() {
        System.out.println("执行第一个构造方法");
        name="张";
        //没有参数的构造方法
    }
    public Test(String name,int age,String ID){
        System.out.println("执行第二个构造方法");
        this.name=name;
        //重载构造方法，构造方法含有三个参数
    }
    public Test(int age,String name,String ID){
        System.out.println("执行第三个构造方法");
        this.name=name;
        //重载构造方法，在同一形参位置不同类型
    }
    public static void main(String[] args) {
        Test text1=new Test();
        Test text2=new Test("张山",18,"1000001");
        Test text3=new Test(18,"李四","1000002");
        System.out.println(text1.name);
        System.out.println(text2.name);
        System.out.println(text3.name);
    }
}
