package BAI8;

import java.awt.Graphics;

public interface Actable {
    public void drawn(Graphics graphics);
    public void moveTo(Graphics graphics, int a, int b);
    public void erase(Graphics graphics);
}
