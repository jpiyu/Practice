// file name: Main.java
class Base {
    public void foo() {}
}

class Derived extends Base {
    private void foo() {} // compiler error
}

public class Main {
    public static void main(String args[]) {
        Derived d = new Derived();
    }
}
