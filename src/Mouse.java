import java.awt.event.*;

 class Mouse implements MouseListener, MouseMotionListener, MouseWheelListener, KeyListener {
    Start context;
     Mouse(Start start) {
        this.context = start;
    }

    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {
        int m = 0;
        switch(e.getButton()){
            case MouseEvent.BUTTON1:m = 1;break;
            case MouseEvent.BUTTON2:m = 2;break;
            case MouseEvent.BUTTON3:m = 3;break;
        }
//        System.out.println(m);
        context.stage.mouseDown(e.getX(),e.getY(),m);
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        int m = 0;
        switch(e.getButton()){
            case MouseEvent.BUTTON1:m = 1;break;
            case MouseEvent.BUTTON2:m = 2;break;
            case MouseEvent.BUTTON3:m = 3;break;
        }
        context.stage.mouseUp(e.getX(),e.getY(),m);
    }
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mouseDragged(MouseEvent e) {
        int m = 0;
        switch(e.getButton()){
            case MouseEvent.BUTTON1:m = 1;break;
            case MouseEvent.BUTTON2:m = 2;break;
            case MouseEvent.BUTTON3:m = 3;break;
        }
        context.stage.muuseMove(e.getX(),e.getY(),m);
    }
    @Override
    public void mouseMoved(MouseEvent e) { }
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        //System.out.println(e.getWheelRotation());
        context.stage.mouseWheel(e.getWheelRotation());
    }
    @Override
    public void keyTyped(KeyEvent e) {}
    boolean up = false;
    boolean down = false;
    boolean left = false;
    boolean right = false;
    @Override
    public void keyPressed(KeyEvent e) {
        context.stage.keyDown(e);
    }
    @Override
    public void keyReleased(KeyEvent e) {
        context.stage.keyUp(e);
    }
}
