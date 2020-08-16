
public class Button {
    public interface ClickListener {
        void perform();
    }

    private ClickListener mClickListener = null;
    public void setClickListener(ClickListener clickListener) {
        mClickListener = clickListener;
    }

    public void click() {
        if (mClickListener != null)
            mClickListener.perform();
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.setClickListener(() -> {
            System.out.println("Click");
        });

        button.click();
    }
}

