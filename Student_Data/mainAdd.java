package Encapsulation;

public class mainAdd extends student {
    public static void main(String[] args) {
        mainAdd m1= new mainAdd();
        m1.setname("knaha");
        m1.setbranch("EEE");
        m1.setrollno(42);
        System.out.println(m1.getname());
        System.out.println(m1.getbranch());
        System.out.println(m1.getrollno());
    }
}
