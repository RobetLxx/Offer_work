package text_java_interview;

/**
 * @author: lingjunhao
 * create at:  2019-05-18  14:58
 * @description:
 */
public class Sun extends Father {
    public Sun() {
        super();
    }

    public Sun(int x) {
        System.out.println("sun"+x);
    }

    @Override
    public void sout() {
        System.out.println("sun_out");
    }

    public static void main(String[] args) {
        Sun sun=new Sun();
        int a[]={};

    }
}
