//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UIControl[] controls = { new UIControl(), new TextBox(), new Checkbox() };
        for (var control : controls) {
            control.render();
        }
    }
}