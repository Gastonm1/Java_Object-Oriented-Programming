// the extends UIControl extends all methods into Textbox (checkout main)
public class TextBox extends UIControl {
    private String text = ""; // Field

    public void setText(String text) {
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}
