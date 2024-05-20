public class Student extends Person{
    public String Cls;
    public Student(String name, int age, String Id,String Cls) {
        super(name, age, Id);
        this.Cls=Cls;
    }
    public String toString(String name, int age, String Id,String Cls) {
        return "我的名字是:"+name+"年龄是："+age+"ID是："+Id+"我的课程是："+Cls;
    }
}
