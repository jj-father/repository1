package Ainimal;

public class demo {
    public static void main(String[] args) {
        Cat c= new Cat();
        c.setAge(15);
        c.setName("加菲猫");
        System.out.println(c.getAge()+c.getName());
        c.catchmouse();
        Cat c2 = new Cat(16,"加肥");
        System.out.println(c2.getAge()+c2.getName());
        c2.catchmouse();
        Dog d = new Dog();
        d.setAge(17); d.setName("大傻狗");
        System.out.println(d.getAge()+d.getName());
        Dog d2 =new Dog(18,"一刀999");
        System.out.println(d2.getAge()+d2.getName());

    }
}
