import java.awt.*;

 class User {
    int anim = 0;
    Start context;
     Image sprite;
     User(Start start) {
        this.context = start;
        sprite = getSprite();
    }
     int x = 0,y = 0,z = 0;
     void set(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
     Image getSprite(){
        return Toolkit.getDefaultToolkit().getImage(getClass().getResource("def.png"));
    }
     Image setSprite(String link){
        return Toolkit.getDefaultToolkit().createImage(link);
    }
}
