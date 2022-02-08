public class StaticTest {
    public static void main(String[] args) {
        StaticExample e = new StaticExample();
        System.out.println(e.password2);

        System.out.println(StaticExample.password);
        StaticExample.password = "111";
        System.out.println(StaticExample.password);


        // todo: This will not work, because password2 is not static..
        //System.out.println(StaticExample.password2);
    }
}
