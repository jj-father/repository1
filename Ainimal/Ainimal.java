package Ainimal;

public class Ainimal {
    private int age;
    private  String name ;

    public Ainimal(){
    }
public Ainimal(int age,String name)
{
    this.age =age;
    this.name = name;
 age=15;
 name ="dsf";

}
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public void show (){
    System.out.println("动物萌萌哒");
}

}
