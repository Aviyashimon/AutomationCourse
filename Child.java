public class Child extends Parent {
    private int b = 200;

    // prints a variable directly from base class
    public void getAFromBase() {
        System.out.println(super.a);
    }

    public void getAFromChild() {
        System.out.println(a);
    }

    // call method directly from parent
    public void callShow() {
        show(); // no need for super
    }
}
