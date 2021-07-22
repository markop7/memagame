package memorygame;

import javax.swing.JButton;

public class Dugme extends JButton {

    private int id;

    public Dugme(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
