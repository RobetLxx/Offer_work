package test;


/**
 * @author: lingjunhao
 * create at:  2019-06-13  15:12
 * @description:
 */
public class servletdemo {
    public void print(){
        String a1=new String("122");
        String a2=new String("122");
        System.out.println(a1.equals(a2));
        Integer x1=new Integer(1);
        Integer x2=new Integer(1);
        System.out.println(x1.equals(x2));
    }

    public static void main(String[] args) {
        servletdemo servletdem=new servletdemo();
        servletdem.print();
    }

}
