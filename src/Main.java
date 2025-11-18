//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Upcasting: Casting an object to one of its super (parent) types
        // Downcasting: Casting an object to one of its sub (children) types

        var control = new UIControl(true);
//        show(control);

        // This will also work because text box object inherits all the members of the control object.
        // So every textbox object is also a control object.
        // That is why its said that inheritance represents an is/a relationship.
        // In this case a textbox IS A control object.

        var textBox = new TextBox();
        show(control);
    }

    public static void show(UIControl control){

        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }
}