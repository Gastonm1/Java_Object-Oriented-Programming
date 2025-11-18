//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // So when we use a new TextBox instance the textbox has the setText method AND the disabled and isEnabled methods
        var control = new TextBox();
        control.disable();
        System.out.println(control.isEnabled());
    }
}