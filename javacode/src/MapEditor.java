import java.awt.*;
import java.awt.event.KeyEvent;

 class MapEditor extends Stage {
    int x = 0;
    int y = 0;
    int z = 0;
     MapEditor(Start context) {
        super(context);
        this.context = context;
         x = context.user.x/100;
         y = context.user.y/100;
         z = context.user.z;
    }
    int m = 0;
    @Override
     void mouseDown(int x, int y,int m) {
        int[] c = getBlock(x,y,context.block);
        this.m = m;
        if(m == 3){context.data.remove(this.x +c[0], this.y +c[1],z);return;}
        context.data.add(item, this.x +c[0], this.y +c[1],z);
    }

    @Override
     void muuseMove(int x, int y, int m) {
        int[] c = getBlock(x,y,context.block);
        if(this.m == 3){context.data.remove(this.x +c[0], this.y +c[1],z);return;}
        context.data.add(item, this.x + c[0], this.y + c[1], z);
    }
     private int q(int x){return x*x;}
    @Override
     void draw(Graphics g) {
        int radius = 35;
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, context.getWidth(), context.getHeight());
        int w = context.getWidth()/context.block + 4;
        int h = context.getHeight()/context.block + 4;
        if(w%2 == 0)w++;
        if(h%2 == 0)h++;
        int X = context.getWidth()/2-(context.block*(w/2))-(context.block/2);
        int Y = context.getHeight()/2-(context.block*(h/2))-(context.block/2);
//        X-=(double)(context.block/100.0)*(x%100);
//        Y-=(double)(context.block/100.0)*(y%100);

        for(int z = this.z-2;z<=this.z;z++) {
            g.setColor(new Color(0,0,0,.5f));
            g.fillRect(0,0,context.getWidth(),context.getHeight());
            for (int y = this.y - (h / 2); y <= this.y + (h / 2); y++) {
                for (int x = this.x - (w / 2); x <= this.x + (w / 2); x++) {
                    if (Math.pow(q(x - this.x) + q(y - this.y), .5) < radius) {
                        if (context.block < context.getHeight() / 50) {
                            if (context.data.get(x, y, z) == 114) {
                                g.setColor(Color.WHITE);
                            } else {
                                g.setColor(Color.black);
                            }
                            g.fillRect(X, Y, context.block, context.block);
                        } else {
                            if (context.items.i[context.data.get(x, y, z)].view == null)
                                drawItem(g, context.data.get(x, y, z), X, Y, context.block);
                            else context.items.i[context.data.get(x, y, z)].view.draw(g, X, Y, x, y, z);
                        }
                    }
                    X += context.block;
                }
                X -= context.block * w;
                Y += context.block;
            }

            Y-=context.block*h;
        }
        g.setColor(Color.WHITE);
        g.drawString(this.x +":"+ this.y +":"+this.z,context.getWidth()-50,context.getHeight()-100);
        items(g);
    }
    static int item = 1;
    private void items(Graphics g) {
        drawItem(g,item,context.getWidth()-context.block,context.getHeight()-context.block,context.block);
    }


     private void drawItem(Graphics g, int i, int x, int y, int block) {
         if(context.items.i[i].textur == null)return;
        g.drawImage(Data.BLOCKS,x,y,x+block,y+block,context.items.i[i].textur[0],context.items.i[i].textur[1],context.items.i[i].textur[2],context.items.i[i].textur[3],null);
    }
    @Override
     void keyDown(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_Q:z++;break;
            case KeyEvent.VK_E:z--;break;
            case KeyEvent.VK_W:y--;break;
            case KeyEvent.VK_A:x--;break;
            case KeyEvent.VK_D:x++;break;
            case KeyEvent.VK_S:y++;break;
            case KeyEvent.VK_X:
                context.data.write("data.json",context.map.toString());
                break;
            case KeyEvent.VK_Z:context.stage = new GameView(context);break;
            case KeyEvent.VK_1:
                previtem();break;
            case KeyEvent.VK_2:nextItem();break;
        }
    }

     private void nextItem() {
         while(true){
             item++;
             if(item>=context.items.i.length){item = 0;break;}
             if(context.items.i[item] != null)break;
         }
     }

     private void previtem() {
        while(true){
            item--;
            if(item<0){item = context.items.i.length-1;}
            if(context.items.i[item]!=null)break;
        }
     }
 }
