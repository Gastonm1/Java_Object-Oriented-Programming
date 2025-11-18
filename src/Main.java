//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Polymorphism - many forms. This is one of the features of object0-oriented programming languages that allows an object to take different forms.

        UIControl[] controls = { new TextBox(), new Checkbox() };
        for (var control : controls) {
            control.render();
        }
    }
}