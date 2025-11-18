public class TextBox extends UIControl {
    private String text = ""; // Field

//    public TextBox() {
//        super(true);
//    }


    @Override
    public void render() {
        System.out.println("Rendering TextBox");
    }

    // @Override is called an annotation. An annotation is a label that we attach to a class member.
    // And with this we give extra information to the Java compiler.
    // In this case we're telling the Java compiler that we are overriding the two string method declared in the object class.
    @Override
    public String toString() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}
