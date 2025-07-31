class ExampleMethods {
    private void privateMethod(int num) {
        System.out.println("I am a Private Method");
    }

    public ExampleMethods() {
        System.out.println("I am a Constructor");
    }

    public static void staticMethod() {
        System.out.println("I am a Static Method");
    }

    public final void finalMethod() {
        System.out.println("I am a Final Method");
    }

    public void normalMethod() {
        System.out.println("I am a Normal Method");
    }
}

public class OverrideExample extends ExampleMethods {

    
    public void privateMethod(int num) {
        System.out.println("Child class method with same name - Not overridden");
    }

    
    // Hides the static method, not overridden
    public static void staticMethod() {
        System.out.println("Child's Static Method (Hiding)");
    }

    // Cannot override final method
    /*
    public void finalMethod() {
        System.out.println("Trying to override final method - Not Allowed!");
    }
    */

    //Properly overridden method
    @Override
    public void normalMethod() {
        System.out.println("I am a Normal Overridden Method");
    }

    public static void main(String[] args) {
        OverrideExample obj = new OverrideExample();

        obj.normalMethod(); // Overridden method
        obj.privateMethod(10); // This is child method, not override

        
        ExampleMethods.staticMethod(); // Parent version
        OverrideExample.staticMethod(); // Child version

        obj.finalMethod(); // Parent final method

      
    }
}
