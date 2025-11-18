//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var textbox = new TextBox();
        //Because of the annotation in TextBox.java we will see the content of the object. Instead of seeing the object itself.
        // This is Overriding a method.
        // you will see Hello World in the terminal
        textbox.setText("Hello World");
        System.out.println(textbox);

    }
}