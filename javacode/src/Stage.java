import java.awt.*;
import java.awt.event.KeyEvent;

 class Stage {
     Start context;
    protected Stage(Start context){
        this.context = context;
    }
     void draw(Graphics g){}
     void mouseDown(int x,int y,int m){}
     void mouseUp(int x,int y,int m){}
     void muuseMove(int x,int y,int m){}
     void keyDown(KeyEvent e){}
     void keyUp(KeyEvent e){}
     int[] getBlock(int x,int y,int block){
        //y = Gdx.graphics.getHeight()-y;
        int width = context.getWidth();
        int height = context.getHeight();
        if(x-(width/2)>0){x+=block/2;}
        else{x-=block/2;}
        if(y-(height/2)>0){y+=block/2;}
        else{y-=block/2;}
        return new int[]{
                ((x-(width/2))/block),
                ((y-(height/2))/block)
        };
    }

     public void mouseWheel(int wheelRotation) {
         if(wheelRotation == 1){
             context.block-=context.block/4;
         }else{context.block+=context.block/4;}
         if(context.block<5)context.block = 5;
     }

     public void update(long delta) {

     }
 }
