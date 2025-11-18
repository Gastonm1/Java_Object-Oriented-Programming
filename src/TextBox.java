public class TextBox extends UIControl {
    private String text = ""; // Field

    public TextBox() {
        // use the super() to call the constructor of the base class. In this instance is UIControl and we pass the parameters. In this case is a boolean. IT MUST BE FIRST
        super(true);
        System.out.println("TextBox constructor");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}
