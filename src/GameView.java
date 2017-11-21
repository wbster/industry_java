import java.awt.*;
import java.awt.event.KeyEvent;

 class GameView extends Stage {
    int radius = 20;
     GameView(Start context) {
        super(context);
        this.context = context;
    }

    @Override
     void mouseDown(int x, int y,int m) {
        int[] c = getBlock(x,y,context.block);
        if(m == 3){context.data.remove(context.user.x/100+c[0],context.user.y/100+c[1],context.user.z);return;}
        context.data.add(1,context.user.x/100+c[0],context.user.y/100+c[1],context.user.z);
    }

    private int q(int x){return x*x;}
    @Override
     void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, context.getWidth(), context.getHeight());
        int w = context.getWidth()/context.block + 4;
        int h = context.getHeight()/context.block + 4;
        if(w%2 == 0)w++;
        if(h%2 == 0)h++;
        int X = context.getWidth()/2-(context.block*(w/2))-(context.block/2);
        int Y = context.getHeight()/2-(context.block*(h/2))-(context.block/2);
        X-=(double)(context.block/100.0)*(context.user.x%100);
        Y-=(double)(context.block/100.0)*(context.user.y%100);
//        Y+=context.block/3;
        for(int z = context.user.z-2;z<=context.user.z;z++) {
            g.setColor(new Color(0,0,0,.5f));
            g.fillRect(0,0,context.getWidth(),context.getHeight());
            for (int y = context.user.y / 100 - (h / 2); y <= context.user.y / 100 + (h / 2); y++) {
                for (int x = context.user.x / 100 - (w / 2); x <= context.user.x / 100 + (w / 2); x++) {
                    if (Math.pow(q(x - context.user.x / 100) + q(y - context.user.y / 100), .5) < radius)
                        if(context.block<context.getHeight()/50){
                            if(context.data.get(x,y,z) == 114){g.setColor(Color.WHITE);}
                            else{g.setColor(Color.black);}
                            g.fillRect(X,Y,context.block,context.block);
                        }else{
                        if(context.items.i[context.data.get(x,y,z)].view==null)drawItem(g, context.data.get(x, y, z), X, Y, context.block);
                        else context.items.i[context.data.get(x,y,z)].view.draw(g,X,Y,x,y,z);}
                    X += context.block;
                }
                X -= context.block * w;
                Y += context.block;
            }
            //X-=context.block*w;
            Y-=context.block*h;
        }
        int x = 32;
        int y = 0;
        if(context.mouse.up)y = 96;
        if(context.mouse.down)y = 0;
        if(context.mouse.left)y = 32;
        if(context.mouse.right)y = 64;
        g.drawImage(
                context.user.sprite,
                context.getWidth()/2-context.block/2,
                context.getHeight()/2-context.block/2,
                context.getWidth()/2+context.block/2,
                context.getHeight()/2+context.block/2,x*context.user.anim,y,x*context.user.anim+32,y+32,null);
        g.setColor(Color.WHITE);

        g.drawString(context.user.x+":"+context.user.x/100+":"+context.user.y+":"+context.user.y/100+":"+context.user.z,50,context.getHeight()-100);
    }
     int useeisanim(){
        int c = 0;
        if(context.mouse.up)c++;
        if(context.mouse.left)c++;
        if(context.mouse.right)c++;
        if(context.mouse.down)c++;
        return c;
    }
     private int g(int x){
         if(x<0)return ((x-100)/100);
         else return x/100;
     }
    long time = 0;
    public void update(long delta) {
        int step = (int) (delta/3);
        if(context.mouse.up)
            if(
                    context.items.i[context.data.get(g(context.user.x+20),g(context.user.y-step),context.user.z)].ghost &&
                    context.items.i[context.data.get(g(context.user.x+80),g(context.user.y-step),context.user.z)].ghost
                    )
            context.user.y-=step;
        if(context.mouse.left)
            if(
                    context.items.i[context.data.get(g(context.user.x-step),g(context.user.y+20),context.user.z)].ghost&&
                            context.items.i[context.data.get(g(context.user.x-step),g(context.user.y+80),context.user.z)].ghost
                    )
                context.user.x-=step;
        if(context.mouse.right)
            if(context.items.i[context.data.get(g(context.user.x+100+step),g(context.user.y+20),context.user.z)].ghost&&
                    context.items.i[context.data.get(g(context.user.x+100+step),g(context.user.y+80),context.user.z)].ghost)
                context.user.x+=step;
        if(context.mouse.down)
            if(
                    context.items.i[context.data.get(g(context.user.x+20),g(context.user.y+100+step),context.user.z)].ghost &&
                    context.items.i[context.data.get(g(context.user.x+80),g(context.user.y+100+step),context.user.z)].ghost)
                context.user.y+=step;
        if(useeisanim()>0){
            if(System.currentTimeMillis()-time>100){
                context.user.anim+=1;
                if(context.user.anim == 3)context.user.anim = 0;
                time = System.currentTimeMillis();
            }
        }
    }


    private void drawItem(Graphics g, int i, int x, int y, int block) {
        if(context.items.i[i].textur == null)return;
        g.drawImage(Data.BLOCKS,x,y,x+block,y+block,context.items.i[i].textur[0],context.items.i[i].textur[1],context.items.i[i].textur[2],context.items.i[i].textur[3],null);
    }

    @Override
     void keyDown(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_W:context.mouse.up = true;break;
            case KeyEvent.VK_A:context.mouse.left = true;break;
            case KeyEvent.VK_D:context.mouse.right = true;break;
            case KeyEvent.VK_S:context.mouse.down = true;break;
            case KeyEvent.VK_Z:context.stage = new MapEditor(context);break;
        }
        System.out.println(e.getKeyCode());
    }

    @Override
     void keyUp(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_W:context.mouse.up = false;break;
            case KeyEvent.VK_A:context.mouse.left = false;break;
            case KeyEvent.VK_D:context.mouse.right = false;break;
            case KeyEvent.VK_S:context.mouse.down = false;break;
            case KeyEvent.VK_X:context.data.write("data.json",context.map.toString());break;
        }
    }

}
