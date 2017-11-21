import java.awt.*;

class Items {
    private Start context;
     Item[] i = new Item[1000];
    protected Items(Start context){
        this.context = context;
        add(0,"Empty",null);
        i[0].ghost = true;
        add(1,"Dirt",new int[]{1,1,16});
        //SiO2 4
        add(2,"Dirt",new int[]{2,1, 16});
//        i[2].update = new Action(){
//            void update(int z,int y,int x,int world){
//                if(ru.wencor.industry.Old.GMG.world.getMap(z+1,y,x,100) == 0){
//                    if(z!=19)return;
//                    if(ru.wencor.industry.Old.Function.s(100)) ru.wencor.industry.Old.GMG.world.setMap(z,y,x,100,101);
//                }
//            }
//        };
        //Si02
        add(3,"",new int[]{15,6,16});
//        i[3].action = new Action() {
//            @Override
//            void run() {
//                if(ru.wencor.industry.Old.GMG.world.getMap(User.z-1,User.y,User.x,User.world) == 3){
//                    if(ru.wencor.industry.Old.GMG.world.getMap(User.z-1,User.y,User.x,User.world+1) == 0){
//                        ru.wencor.industry.Old.GMG.world.setMap(User.z-1,User.y,User.x,User.world,2);
//                    }
//                }
//            }
//        };
//        i[3].view = new Action() {
//            @Override
//            void draw(int z, int y, int x, int X, int Y) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+1);
//                if(id == 0){
//                    ru.wencor.industry.Old.Draw.block(3,X,Y+ ru.wencor.industry.Old.GMG.block);return;}
//                else ru.wencor.industry.Old.Draw.block(4,X,Y+ ru.wencor.industry.Old.GMG.block);
//                int size = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2);
//                ru.wencor.industry.Old.Draw.ctx.draw(
//                        new TextureRegion(
//                                User.textur,
//                                Items.i[id].textur[0],
//                                Items.i[id].textur[1],
//                                Items.i[id].textur[2],
//                                (Items.i[id].textur[3] / 16) * (size)
//                        ),
//                        X,
//                        Y+(ru.wencor.industry.Old.GMG.block / 2),
//                        (ru.wencor.industry.Old.GMG.block),
//                        (ru.wencor.industry.Old.GMG.block / 16) * size
//                );
//            }
//        };
//        i[3].update = new Action(){
//            void update(int z,int y,int x,int world){
//                if(ru.wencor.industry.Old.GMG.world.getMap(z+1,y,x,world)!=0)return;
//                boolean s = false;
//                for(int yw = y-1;yw<=y+1;yw++){
//                    for(int xw = x-1;xw<=x+1;xw++){
//                        if(ru.wencor.industry.Old.GMG.world.getMap(z,yw,xw,100) == 120){
//                            s = true;
//                        }
//                    }
//                }
//                if(s){
//                    if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,101)!=0) {
//                        if (ru.wencor.industry.Old.GMG.world.getMap(z, y, x, 102) < 16) {
//                            if (ru.wencor.industry.Old.Function.s(20))
//                                ru.wencor.industry.Old.GMG.world.setMap(z, y, x, 102, ru.wencor.industry.Old.GMG.world.getMap(z, y, x, 102) + 1);
//                        } else {
//                            if(ru.wencor.industry.Old.GMG.world.getMap(z+1,y,x,100) == 0){
//                                ru.wencor.industry.Old.GMG.world.setMap(z+1,y,x,100, ru.wencor.industry.Old.GMG.world.getMap(z,y,x,101));
//                                ru.wencor.industry.Old.GMG.world.setMap(z,y,x,101,0);
//                            }
//                        }
//                    }
//                }
//            }
//        };
        add(4,"water earth",new int[]{15,4,16},new int[]{3,1,16});
        add(5,"Stone",new int[]{3,6,32});

        add(6,"Coblestone",new int[]{4,6,32});
//        i[6].dropIn = new Action() {
//            @Override
//            boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 110){
//                    new ru.wencor.industry.Old.Furnace().add(z,y,x,6,5);
//                }
//                return false;
//            }
//        };
        addItem(7,"Stone",new int[]{15,5,16});
//        i[7].size = .5;
        add(10,"coal ore",new int[]{3,3,16});
        //C 4 + stone 5
        addItem(11,"Coal",new int[]{10,5,16});
        //C s
        add(15,"iron ore",new int[]{17,5,16},null);
        //Fe 4 + stone 5
        //i[15].in = new int[][]{{110,2,16,1}};
//        i[15].dropIn = new Action() {
//            @Override
//            boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 110){
//                    new ru.wencor.industry.Old.Furnace().add(z,y,x,15,16);
//                }
//                return false;
//            }
//        };
        add(16,"iron ingot",new int[]{18,5,16},null);
        //Fe 16
        add(17,"iron dust",new int[]{0,0,0},null);
        add(19,"iron block",new int[]{19,5,16});
        //Fe 144

        add(20,"gold ore",new int[]{17,6,16});
//        i[20].dropIn = new Action(){
//            @Override
//            boolean drop(int z, int y, int x) {
////                int id = Function.getMap(z,y,x,User.world);
////                if(id == 110)new Furnace().add(z,y,x,20,21);
//                return false;
//            }
//        };
        //Au 4 + stone 5
        add(21,"gold ingot",new int[]{18,6,16},null);
        //Au s
        add(22,"gold dust",new int[]{0,0,0},null);
        add(24,"gold block",new int[]{19,6,16});
        //Au 144

        add(25,"cooper ore",new int[]{17,1,16});
//        i[25].dropIn = new Action(){
//            @Override
//            boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 110)new ru.wencor.industry.Old.Furnace().add(z,y,x,25,26);
//                return false;
//            }
//        };
        //Cu 4 + stone 5
        add(26,"cooper ingot",new int[]{18,1,16},null);
        //Cu s
        add(27,"cooper dust",new int[]{0,0,0},null);
        add(29,"cooper block",new int[]{19,1,16});
        //Cu 144

        add(30,"tin ore",new int[]{17,2,16});
//        i[30].dropIn = new Action(){
//            @Override
//            boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 110)new ru.wencor.industry.Old.Furnace().add(z,y,x,30,31);
//                return false;
//            }
//        };
        //Sn 4 + stone 5
        add(31,"tin ingot",new int[]{18,2,16},null);
        //Sn s
        add(32,"tin dust",new int[]{0,0,0},null);
        add(34,"tin block",new int[]{19,2,16});
        //Sn 144

        add(35,"uran",new int[]{17,3,16});
        //U s

        add(40,"Quarz",new int[]{17,7,16},null);
//        i[40].dropIn = new Action(){
//            @Override
//            boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 110)new ru.wencor.industry.Old.Furnace().add(z,y,x,40,41);
//                return false;
//            }
//        };
        addItem(41,"Quarz",new int[]{18,7,16});
        add(42,"Quarz dust",new int[]{20,7,16},null);
        add(44,"Quarz block",new int[]{19,7,16});


        add(99,"LOADING",new int[]{1,5,16});
        add(100,"shadow",new int[]{3,2,16});
        add(101,"grass",new int[]{3,7,32},new int[]{1,7,32});
        //SiO2 4 + C55H72O5N4Mg
        add(102,"InfoBook",new int[]{7,7,16},null);
//        i[102].shadow = false;
//        i[102].item = true;
//        i[102].size = .8;
//        i[102].click = new Action() {
//            @Override
//            void click(int z, int y, int x) {
//                ru.wencor.industry.Old.GMG.view = new InfoBook();
//            }
//        };
        addItem(103,"Grass",new int[]{2,5,16});//.ghost = true;
        //i[103].shadow = false;
//        i[103].click = new Action() {
//            @Override
//            void click(int z, int y, int x) {
//                if(ru.wencor.industry.Old.Function.s(3))User.invPlus(104,1);
//                else if(ru.wencor.industry.Old.Function.s(3))User.invPlus(107,1);
//                else if(ru.wencor.industry.Old.Function.s(2))User.invPlus(162,2);
//                ru.wencor.industry.Old.GMG.world.setMap(z, y, x, User.world, 0);
//            }
//        };
        add(104,"Catton seed",new int[]{16,6,16},null);
//        i[104].dropIn = new Action() {
//            @Override
//            boolean drop(int z, int y, int x) {
//                z = ru.wencor.industry.Old.Function.blockNo0(z,y,x,User.world);
//                if(ru.wencor.industry.Old.Function.seed(z,y,x,User.world,105)){
//                    User.invDel(104,1);
//                    return true;
//                }return false;
//            }
//        };
        add(105,"Catton",new int[]{16,4,16},null);
//        i[105].shadow = false;
        add(106,"Catton",new int[]{16,5,16},null);

        add(107,"Seed",new int[]{9,7,16},null);
//        i[107].dropIn = new Action() {
//            @Override
//            boolean drop(int z, int y, int x) {
//                z = ru.wencor.industry.Old.Function.blockNo0(z,y,x,User.world);
//                if(ru.wencor.industry.Old.Function.seed(z,y,x,User.world,108)){
//                    User.invDel(107,1);
//                    return true;
//                }return false;
//            }
//        };
        add(108,"Wheat",new int[]{8,7,16},null);
        add(109,"Wheat",new int[]{9,8,16},null);
        add(110,"Furnace",new int[]{9,4,16},new int[]{2,6,32});
//        i[110].click = new ru.wencor.industry.Old.Func(){
//            @Override
//            void click(int z, int y, int x) {
//                ru.wencor.industry.Old.GMG.view = new ru.wencor.industry.Old.Furnace(z,y,x);
//            }
//        };

//        i[110].update = new Action(){
//            @Override
//            void update(int z, int y, int x, int world) {
//                if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,world+2)!=0)
//                    ru.wencor.industry.Old.GMG.world.setMap(z,y,x,world+5, ru.wencor.industry.Old.GMG.world.getMap(z,y,x,world+5)+1);
//                else ru.wencor.industry.Old.GMG.world.setMap(z,y,x,world+5,0);
//                if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,world+5) == 16){
//                    ru.wencor.industry.Old.GMG.world.setMap(z,y,x,world+2, ru.wencor.industry.Old.GMG.world.getMap(z,y,x,world+2)-1);
//                    ru.wencor.industry.Old.GMG.world.setMap(z,y,x,world+7, ru.wencor.industry.Old.GMG.world.getMap(z,y,x,world+7)+1);
//                    ru.wencor.industry.Old.GMG.world.setMap(z,y,x,world+5,0);
//                }
//            }
//        };
//        i[110].view = new Action() {
//            @Override
//            void draw(int z, int y, int x, int X, int Y) {
//                ru.wencor.industry.Old.Draw.block(110, X, Y+ ru.wencor.industry.Old.GMG.block);
//            }
//        };
//        i[110].item = true;i[110].size = .8;
        add(111,"WorkTable",new int[]{2,7,32},new int[]{7,4,16});
//        i[111].click = new Action(){
//            @Override
//            public void click(Start context, int x, int y, int z) {
//                context.stage = new CraftTable(context,x,y,z);
//            }
//        };
        //C6H10O5 32
//        i[111].click = new Action() {
//            @Override
//            void click(int z, int y, int x) {
//                ru.wencor.industry.Old.GMG.view = new ru.wencor.industry.Old.Craft(z,y,x);
//            }
//        };
//        i[111].item = true;i[111].size = .8;
        addItem(112,"Wood",new int[]{6,2,16});
//        i[112].shadow = false;
//        i[112].item = true;
//        i[112].size = .7;
        //C6H10O5 16
//        i[112].dropIn = new Action() {
//            @Override
//            boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 110) new ru.wencor.industry.Old.Furnace().add(z,y,x,112,11);
//
//                return false;
//            }
//        };
        add(113,"Planks",new int[]{4,1,16});
        //C6H10O5 4
        add(114,"wooden",new int[]{4,1,16});
        i[114].view = new Action(){
            @Override
            public void draw(Graphics g, int X, int Y, int x, int y, int z) {
                int[] t = context.items.i[114].textur;
                g.drawImage(Data.BLOCKS,X+context.block/3,Y+context.block/3,X+context.block/3*2,Y+context.block/3*2,t[0],t[1],t[2],t[3],null);
                if(context.data.get(x-1,y,z) == 114){
                    g.drawImage(Data.BLOCKS,X-context.block+context.block/3,Y+context.block/3,X+context.block/3*2,Y+context.block/3*2,t[0],t[1],t[2],t[3],null);
                }
                if(context.data.get(x,y-1,z) == 114){
                    g.drawImage(Data.BLOCKS,X+context.block/3,Y-context.block+context.block/3,X+context.block/3*2,Y+context.block/3*2,t[0],t[1],t[2],t[3],null);
                }
            }
        };
        //add(114,"torch",new int[]{13,2,16},null);
//        i[114].ghost = true;
//        i[114].item = true;
//        i[114].size = .7;
        //C6H10O5 2 C 16
        add(115,"chemTable",new int[]{16,7,16},new int[]{16,8,16});//.item = true;i[115].size = .8;
//        i[115].click = new Action(){
//            @Override
//            void click(int z, int y, int x) {
//                ru.wencor.industry.Old.Function.alert("Скоро");
//            }
//        };
        add(116,"Chest",new int[]{3,5,32},null);//.shadow = false;
        //C6H10O5 32
//        i[116].click = new Action() {
//            @Override
//            void click(int z, int y, int x) {
//                ru.wencor.industry.Old.GMG.chest.play();
//                ru.wencor.industry.Old.GMG.view = new Chest(z,y,x);
//            }
//        };
        add(117,"Bucket",new int[]{7,8,16},null);
//        i[117].dropIn = new Action(){
//            boolean drop(int z,int y,int x){
//                z-=1;
//                if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world) == 120){
//                    if(User.invPlus(118,1)){
//                        User.invDel(117,1);
//                        ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world,0);
//                        return true;
//                    }
//                }
//                return false;
//            }
//        };
        add(118,"Bucket(Water)",new int[]{8,8,16},null);
        add(120,"water",new int[]{11,3,16},null);
        i[120].ghost = true;
//        i[120].shadow = false;
//        i[120].view = new Action(){
//            @Override
//            void draw(int z, int y, int x, int X, int Y) {
//                ru.wencor.industry.Old.Draw.block(120,X, Y+(ru.wencor.industry.Old.GMG.block*3/4) +((ru.wencor.industry.Old.GMG.block/4)*(16- ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+1))/16));
//            }
//        };
//        i[120].update = new Action(){
//            @Override
//            void update(int z, int y, int x, int world) {
//                if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,world+1) >15){
//                    ru.wencor.industry.Old.GMG.world.setMap(z,y,x,world,0);
//                }
//                for(int wz = z-1;wz<=z;wz++) {
//                    for (int wy = y - 1; wy <= y + 1; wy++) {
//                        for (int wx = x - 1; wx <= x + 1; wx++) {
//                            if (wy != y && wx != x) {
//                                if (ru.wencor.industry.Old.GMG.world.getMap(wz, wy, wx, world) == 120) {
//                                    if (ru.wencor.industry.Old.GMG.world.getMap(z, y, x, world + 1) + 1 < ru.wencor.industry.Old.GMG.world.getMap(wz, wy, wx, world + 1)) {
//                                        ru.wencor.industry.Old.GMG.world.setMap(z, y, x, world + 1, ru.wencor.industry.Old.GMG.world.getMap(z, y, x, world + 1) + 1);
//                                        ru.wencor.industry.Old.GMG.world.setMap(wz, wy, wx, world + 1, ru.wencor.industry.Old.GMG.world.getMap(wz, wy, wx, world + 1) - 1);
//                                    }
//                                } else if (ru.wencor.industry.Old.GMG.world.getMap(wz, wy, wx, world) == 0) {
//                                    ru.wencor.industry.Old.GMG.world.setMap(wz, wy, wx, world, 120);
//                                    ru.wencor.industry.Old.GMG.world.setMap(z, y, x, world + 1, ru.wencor.industry.Old.GMG.world.getMap(z, y, x, world + 1) + 1);
//                                    ru.wencor.industry.Old.GMG.world.setMap(wz, wy, wx, world + 1, 15);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        };
        //H20 16
        add(121,"lava",new int[]{10,3,16});
//        i[121].action = new Action(){
//            void run(){
//                if(ru.wencor.industry.Old.GMG.world.getMap(User.z-1,User.y,User.x,User.world) == 121 && User.gravity){
//                    User.z--;
//                }
//                User.hp-=5;
//            }
//        };
        add(122,"Obsid",new int[]{6,3,16});
        //SiO2 16 * Mg0 8
        add(123,"Bed",new int[]{10,1,16},new int[]{14,4,16});
        add(130,"Dead tree",new int[]{2,4,32},null);
//        i[130].click = new Action(){
//            @Override
//            public void click(Start context, int x, int y, int z) {
//                context.u.invPlus(132,1);
//            }
//        };
        //Cell
//        i[130].model = "tree";
//        add(131,"tree",new int[]{3,4,32},null);
//        i[131].model = "tree";
//        i[131].click = new Action(){
//            @Override
//            public void click(Start context, int x, int y, int z) {
//                if(context.u.invSearch(132,3)){if(!s(50))return;}
//                context.u.invPlus(132,1);
//            }
//        };
//        i[131].shadow = false;
//        i[131].view = new Action(){
//            void draw(int z,int y,int x,int X,int Y){
//                ru.wencor.industry.Old.Draw.ctx.draw(
//                        new TextureRegion(
//                                User.textur,(3-1)*32,(4-1)*32,32,32
//                        ),X,Y, ru.wencor.industry.Old.GMG.block, ru.wencor.industry.Old.GMG.block*2
//
//                );
//            }
//        };
//        addItem(132,"Stick",new int[]{11,5,16});
        //C6H10O5 2
        add(135,"Stairs",new int[]{8,5,16},new int[]{8,5,16});
//        i[135].view = new Action(){
//            void draw(int z,int y,int x,int X,int Y){
//                ru.wencor.industry.Old.Draw.side(135,X,Y+ ru.wencor.industry.Old.GMG.block*2);
//            }
//        };
//        i[135].click = new Action(){
//            void click(int z,int y,int x){
//                User.getXYZ(z,y,x);
//                ru.wencor.industry.Old.GMG.view = new Stairs();
//            }
//        };
        add(140,"Arm Macerator",new int[]{11,7,16},new int[]{11,8,16});
//        i[140].click = new Action(){
//            @Override
//            void click(int z, int y, int x) {
//                ru.wencor.industry.Old.GMG.view = new ArmMacerator(z,y,x);
//            }
//        };
        add(150,"empty(mobs)",new int[]{13,2,16},null);
//        i[150].shadow = false;
//        i[150].click = new Action(){
//            @Override
//            public void click(int z, int y, int x) {
//                ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world+4, ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+4)-5);
//                if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+4)<1)
//                    ru.wencor.industry.Old.GMG.world.delete(z,y,x,User.world);
//            }
//        };
//        i[150].update = new Action(){
//            @Override
//            void update(int z, int y, int x, int world) {
//                //1 id
//                //2 p
//                //3 step
//                //4 hp
//                if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,world+2) == 0)
//                    ru.wencor.industry.Old.GMG.world.setMap(z,y,x,world+2,4);
//                if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,world+3) == 3){
//                    int[] b = Mobs.m[ru.wencor.industry.Old.GMG.world.getMap(z,y,x,world+1)].logic.logic(z,y,x,world);
//                    if(b[0] == 0 && b[1] == 0)return;
//                    ru.wencor.industry.Old.GMG.world.replace(z,y,x,z,y+b[1],x+b[0],world);
//                    ru.wencor.industry.Old.GMG.world.setMap(z,y+b[1],x+b[0],world+3,0);
//                }
//                else ru.wencor.industry.Old.GMG.world.setMap(z,y,x,world+3, ru.wencor.industry.Old.GMG.world.getMap(z,y,x,world+3)+1);
//            }
//        };
//        i[150].view = new Action() {
//            @Override
//            public void draw(int z, int y, int x, int X, int Y) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+1);
//                int tx;
//                int ty;
//                int p = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2);
//                int step = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+3);
//                switch (p) {
//                    case 1:Y-=(3-step)*(ru.wencor.industry.Old.GMG.block/4);break;
//                    case 2:X+=(3-step)*(ru.wencor.industry.Old.GMG.block/4);break;
//                    case 3:X-=(3-step)*(ru.wencor.industry.Old.GMG.block/4);break;
//                    case 4:Y+=(3-step)*(ru.wencor.industry.Old.GMG.block/4);break;
//                }
//
//                tx = ((step == 3)?1:step)*32;
//                ty = ru.wencor.industry.Old.Function.stepPXX(p);
//                ru.wencor.industry.Old.Draw.ctx.draw(
//                        new TextureRegion(
//                                User.mobs,
//                                Mobs.m[id].x+tx,
//                                Mobs.m[id].y+ty,
//                                32,32
//                        ),
//                        X,Y, ru.wencor.industry.Old.GMG.block, ru.wencor.industry.Old.GMG.block);
//            }
//        };
        //150
        add(151,"lapis",new int[]{13,4,16});
        //Na8Al1SiO4SO4 16
        add(152,"stonebrick",new int[]{5,1,16},new int[]{6,1,16});
        add(153,"brickblock",new int[]{7,1,16});
        add(154,"tntblock",new int[]{8,1,16},new int[]{13,3,16});
        //C6H2(NO2)3C7H8 4 Cell 12
        add(155,"emeraldore",new int[]{11,1,16});
        //Be3Al2(SiO3)6 15 Cr2O3 1 stone 5
        add(156,"Emerald",new int[]{0,0,0});
        //Be3Al2(SiO3)6 15 Cr2O3 1
        add(185,"emeraldblock",new int[]{10,2,16});
//        i[185].mine = false;
        //Be3Al2(SiO3)6 135 Cr2O3 9
        addItem(156,"flower",new int[]{15,1,16});
        addItem(157,"flower",new int[]{16,1,16});
        addItem(158,"flower",new int[]{1,6,16});
        addItem(159,"flower",new int[]{2,6,16});
        addItem(160,"flower",new int[]{3,6,16});
        addItem(161,"flower",new int[]{4,6,16});

        add(162,"seed barley",new int[]{5,6,16},null);
//        i[162].dropIn = new Action(){
//            public boolean drop(int z,int y,int x){
//                z = ru.wencor.industry.Old.Function.blockNo0(z,y,x,User.world);
//                if(ru.wencor.industry.Old.Function.seed(z,y,x,User.world,163)){
//                    User.invDel(162,1);
//                    return true;
//                }
//                return true;
//            }
//        };
        add(163,"barley",new int[]{6,6,16},null);
        add(164,"Barley",new int[]{7,6,16},null);

        add(165,"Barley Flour",new int[]{8,6,16},null);
//        i[165].dropIn = new Action(){
//            public boolean drop(int z,int y,int x){
//                if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world) == 110){
//                    if(User.invPlus(166,1))User.invDel(165,1);
//                }
//                return true;
//            }
//        };
        add(166,"Bread",new int[]{9,6,16},null);
        add(173,"seed",new int[]{16,6,16});
        add(174,"boolshelf",new int[]{4,3,16});
        add(175,"mosscobl",new int[]{5,3,16});

        add(176,"Sand",new int[]{2,3,16});
//        i[176].dropIn = new Action(){
//
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 250){
//                    if(User.invPlus(181,1))User.invDel(176,1);
//                }
//                return false;
//            }
//        };
        //SiO2 s
//        i[176].dropIn = new Action() {
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 110){
//                    if(User.invPlus(181,1)){
//                        User.invDel(110,1);
//                        return true;
//                    }
//                }
//                return false;
//            }
//        };
        add(178,"diamond ore",new int[]{3,4,16});
        //C 64 stone 5
        addItem(179,"diamond",new int[]{12,5,16});
        //C 256
        add(180,"diamondblock",new int[]{9,2,16});
        //C 2304
        add(181,"glass",new int[]{2,4,16});
//        i[181].shadow = false;
        //SiO2 s
        //182 panel glass
        add(183,"rubyore",new int[]{12,2,16});
        //AlO2 12 + Cr 4 * 5 stone
        add(186,"lapisblock",new int[]{13,1,16});
        //Na8Al1SiO4SO4 144
        add(190,"Gear",new int[]{20,1,16},null);//.shadow = false;
//        i[190].click = new Action() {
//            @Override
//            public void click(int z, int y, int x) {
//                ru.wencor.industry.Old.GMG.view = new Setting();
//            }
//        };
        add(191,"stone gear",new int[]{21,1,16},null);
        add(192,"iron gear",new int[]{22,1,16},null);
        //add(193,"gold gear",new int[]{23,1,s},null);
        //add(194,"diamond gear",new int[]{24,1,s},null);
        addItem(195,"Hammer",new int[]{14,5,16});
        //pickaxe
        addItem(196,"Blade of Sword",new int[]{12,11,16});
        addItem(197,"Blade of a Shovel",new int[]{12,12,16});
        addItem(198,"Axe-handle",new int[]{12,14,16});
        addItem(199,"Blade of Hoe",new int[]{12,15,16});

        addItem(200,"Stone Sword",new int[]{13,11,16});
        addItem(201,"Stone Shovel",new int[]{13,12,16});
//        i[201].dropIn = new Action(){
//            @Override
//            public boolean drop(Start context, int x, int y, int z) {
//                int block = context.world.getBlockId(x,y,z);
//                if(block == 1){
//                    if(context.u.invPlus(218,1)){
//                        context.u.invDel(201,1);
//                    }
//                }
//                return false;
//            }
//        };
//        i[201].dropIn = new Action(){
//            public boolean drop(int z,int y,int x){
//                z = ru.wencor.industry.Old.Function.blockNo0(z,y,x,User.world);
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 1 || id == 2 || id == 101){
//                    if(User.invPlus(2,1)) ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world,0);
//                }
//                else if(id == 3){
//                    ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world+1,0);
//                }
//                else if(id == 217){
//                    if(User.invPlus(i[217].drop[0],i[217].drop[1])){
//                        ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world,0);
//                    }
//                }
//                else if(id == 176){
//                    if(User.invPlus(176,1)) ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world,0);
//                }
//                return true;
//            }
//        };
        addItem(202,"Stone Axe",new int[]{13,14,16});
//        i[202].dropIn = new Action(){
//            @Override
//            public boolean drop(Start context, int x, int y, int z) {
//                int block = context.world.getBlockId(x,y,z);
//                if(block == 131){if(context.u.invPlus(112,1)) context.world.remove(x,y,z);}
//                else if(block == 111){if(context.u.invPlus(111,1))context.world.remove(x,y,z);}
//                return false;
//            }
//        };
//        i[202].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 131){
//                    if(User.invPlus(112,2)) ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world,0);
//                }
//                else if(id == 130){
//                    if(User.invPlus(11,2)){
//                        ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world,0);}
//                }
//                return true;
//            }
//        };
        addItem(203,"Stone hoe",new int[]{13,15,16});
//        i[203].dropIn = new Action() {
//            @Override
//            public boolean drop(int z, int y, int x) {
//                z = ru.wencor.industry.Old.Function.blockNo0(z,y,x,User.world);
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 101){
//                    ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world,3);return true;}
//                return false;
//            }
//        };
        addItem(204,"Cooper stone",new int[]{10,6,16});//.item = true;
//        i[204].size = .6;
//        i[204].shadow = false;
//        i[204].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                z = ru.wencor.industry.Old.Function.blockNo0(z,y,x,User.world);
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 231 &&
//                        (ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+1) == 204 ||
//                                ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2) == 0)
//                        && ru.wencor.industry.Old.GMG.world.getMap(z-1,y,x,User.world) == 121
//                        ){
//                    ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world+1,204);
//                    if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2)<18){
//                        ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world+2, ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2)+1);
//                        User.invDel(204,1);
//                    }
//                }
//                return false;
//            }
//        };
        add(216,"Cooper Chest",new int[]{20,2,16},new int[]{20,3,16});
//        i[216].click = new Action(){
//            @Override
//            public void click(int z, int y, int x) {
//                ru.wencor.industry.Old.GMG.view = new ru.wencor.industry.Old.CooperChest(z,y,x);
//            }
//        };
        add(217,"Clay",new int[]{14,6,16});
        addItem(218,"Clay",new int[]{13,8,16});
        i[218].ghost = false;
//        i[218].click = new Action(){
//            @Override
//            public void click(Start context, int x, int y, int z) {
//                context.stage = new MindClay(context,x,y,z);
//            }
//        };
//        i[218].click = new Action(){
//            @Override
//            public void click(int z, int y, int x) {
//                ru.wencor.industry.Old.GMG.view = new MindClay(z,y,x);
//            }
//        };
        addItem(219,"Clay mold axe",new int[]{21,2,16});//.shadow = false;
//        i[219].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 250){
//                    if(User.invPlus(226,1))User.invDel(219,1);
//                }
//                return false;
//            }
//        };
        addItem(220,"Clay mold sword",new int[]{22,2,16});//.shadow = false;
//        i[220].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 250){
//                    if(User.invPlus(227,1))User.invDel(220,1);
//                }
//                return false;
//            }
//        };
        addItem(221,"Clay mold shovel",new int[]{23,2,16});//.shadow = false;
//        i[221].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 250){
//                    if(User.invPlus(228,1))User.invDel(221,1);
//                }
//                return false;
//            }
//        };
        addItem(222,"Clay mold pick",new int[]{24,2,16});//.shadow = false;
//        i[222].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 250){
//                    if(User.invPlus(229,1))User.invDel(222,1);
//                }
//                return false;
//            }
//        };
        addItem(223,"Clay mold hoe",new int[]{25,2,16});//.shadow = false;
//        i[223].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 250){
//                    if(User.invPlus(230,1))User.invDel(223,1);
//                }
//                return false;
//            }
//        };

        addItem(224,"Clay pot",new int[]{26,2,16});
//        i[224].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 250){
//                    if(User.invPlus(231,1))User.invDel(224,1);
//                }
//                return false;
//            }
//        };
        addItem(225,"Clay Vessel",new int[]{27,2,16});
//        i[225].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 250){
//                    if(User.invPlus(252,1))User.invDel(225,1);
//                    return true;
//                }
//                return false;
//            }
//        };

        addItem(226,"mold axe",new int[]{21,3,16});//.shadow = false;
//        i[226].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 231){
//                    if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+1) == 204){
//                        if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2)>=9){
//                            if(User.invPlus(235,1))
//                                ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world+2, ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2)-9);
//                        }
//                    }
//                }
//                return false;
//            }
//        };
        addItem(227,"mold sword",new int[]{22,3,16});//.shadow = false;
//        i[227].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 231){
//                    if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+1) == 204){
//                        if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2)>=18){
//                            if(User.invPlus(236,1))
//                                ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world+2, ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2)-18);
//                        }
//                    }
//                }
//                return false;
//            }
//        };
        addItem(228,"mold shovel",new int[]{23,3,16});//.shadow = false;
//        i[228].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 231){
//                    if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+1) == 204){
//                        if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2)>=9){
//                            if(User.invPlus(237,1))
//                                ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world+2, ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2)-9);
//                        }
//                    }
//                }
//                return false;
//            }
//        };
        addItem(229,"mold pick",new int[]{24,3,16});//.shadow = false;
//        i[229].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 231){
//                    if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+1) == 204){
//                        if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2)>=18){
//                            if(User.invPlus(238,1))
//                                ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world+2, ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2)-18);
//                        }
//                    }
//                }
//                return false;
//            }
//        };
        addItem(230,"mold hoe",new int[]{25,3,16});//.shadow = false;
//        i[230].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 231){
//                    if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+1) == 204){
//                        if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2)>=9){
//                            if(User.invPlus(239,1))
//                                ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world+2, ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2)-9);
//                        }
//                    }
//                }
//                return false;
//            }
//        };

        add(231,"POT",new int[]{26,3,16},null);
//        i[231].view = new Action(){
//            public void draw(int z, int y, int x, int X, int Y) {
//                ru.wencor.industry.Old.Draw.block(231,X,Y+ ru.wencor.industry.Old.GMG.block);
//                if(ru.wencor.industry.Old.GMG.world.getMap(z-1,y,x,User.world) != 121)return;
//                ru.wencor.industry.Old.Draw.block(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+1),X,Y+ ru.wencor.industry.Old.GMG.block/2);
//                ru.wencor.industry.Old.GMG.text.draw(ru.wencor.industry.Old.Draw.ctx,""+ ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2)+"/18",X,Y+((int)(ru.wencor.industry.Old.GMG.block*1.2)));
//            }
//        };

        addItem(235,"Cooper head axe",new int[]{21,4,16});
        addItem(236,"Cooper blade sword",new int[]{22,4,16});
        addItem(237,"Cooper head shovel",new int[]{23,4,16});
        addItem(238,"Cooper head pick",new int[]{24,4,16});
        addItem(239,"Cooper head hoe",new int[]{25,4,16});

        addItem(240,"Cooper axe",new int[]{21,5,16});
//        i[240].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                return i[202].dropIn.drop(z,y,x);
//            }
//        };
        addItem(241,"Cooper sword",new int[]{22,5,16});
        addItem(242,"Cooper shovel",new int[]{23,5,16});
//        i[242].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                return i[201].dropIn.drop(z,y,x);
//            }
//        };
        addItem(243,"Cooper pick",new int[]{24,5,16});
//        i[243].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                z = ru.wencor.industry.Old.Function.blockNo0(z,y,x,User.world);
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 5 || id == 6){if(User.invPlus(6,1)) ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world,0);}
//                if(id == 10){if(User.invPlus(11,1)) ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world,0);}
//                if(id == 15){if(User.invPlus(15,1)) ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world,0);}
//                if(id == 30){if(User.invPlus(30,1)) ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world,0);}
//                if(id == 40){if(User.invPlus(41,1)) ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world,0);}
//                return true;
//            }
//        };
        addItem(244,"Cooper hoe",new int[]{25,5,16});
//        i[244].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                return i[203].dropIn.drop(z,y,x);
//            }
//        };
        addItem(245,"Clay Mold",new int[]{28,2,16});
//        i[245].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 250){
//                    if(User.invPlus(256,1))User.invDel(245,1);
//                }
//                return false;
//            }
//        };
        addItem(246,"Ceramic Mold",new int[]{28,3,16});
//        i[246].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 231){
//                    if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+1) == 204){
//                        if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2)>=9){
//                            if(User.invPlus(26,1))
//                                ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world+2, ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2)-9);
//                        }
//                    }
//                    else if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+1) == 30){
//                        if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2)>=1){
//                            if(User.invPlus(31,1)){
//                                ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world+2, ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2)-1);
//                            }
//                        }
//                    }
//                }
//                return false;
//            }
//        };
        addItem(247,"Clay saw",new int[]{29,2,16});
//        i[247].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 250){
//                    if(User.invPlus(248,1))User.invDel(247,1);
//                }
//                return false;
//            }
//        };
        addItem(248,"Mold saw",new int[]{29,3,16});
//        i[248].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 231){
//                    if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+1) == 204){
//                        if(ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2)>=12){
//                            if(User.invPlus(249,1))
//                                ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world+2, ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world+2)-12);
//                        }
//                    }
//                }
//                return false;
//            }
//        };
        addItem(249,"Head Cooper saw",new int[]{29,4,16});

        add(250,"Firepit",new int[]{11,9,16},null);//.shadow = false;
//        i[250].item = true;
//        i[250].size = 1.1;

        add(251,"Cooper saw",new int[]{29,5,16},null);
//        i[251].dropIn = new Action(){
//            @Override
//            public boolean drop(int z, int y, int x) {
//                int id = ru.wencor.industry.Old.GMG.world.getMap(z,y,x,User.world);
//                if(id == 112){
//                    if(User.invPlus(113,2)){
//                        ru.wencor.industry.Old.GMG.world.setMap(z,y,x,User.world,0);
//                    }
//                }
//                return true;
//            }
//        };
        add(252,"Vessel",new int[]{27,2,16},null);//.shadow = false;
        add(253,"BlueGlass",new int[]{9,11,16});
//        i[253].shadow = false;

        add(301,"UP",new int[]{12,10,16},null);
        add(302,"LEFT",new int[]{13,10,16},null);
        add(303,"RIGHT",new int[]{14,10,16},null);
        add(304,"DOWN",new int[]{15,10,16},null);
        add(305,"quest",new int[]{27,1,16});


        addItem(500,"INVENTARY",new int[]{25,1,16});
        addItem(501,"magic",new int[]{26,1,16});

        addc(1001,"H");
        addc(1002,"He");
        addc(1003,"Li");
        addc(1004,"Be");
        addc(1005,"B");
        addc(1006,"C");
        addc(1007,"N");
        addc(1008,"O");
        addc(1009,"F");
        addc(1010,"Ne");
        addc(1011,"Na");
        addc(1012,"Mg");
        addc(1013,"Al");
        addc(1014,"Si");
        addc(1015,"N");
        addc(1016,"S");
        addc(1024,"Cr");
        addc(1026,"Fe");
        addc(1029,"Cu");
        addc(1050,"Sn");
        addc(1079,"Au");
        addc(1092,"U");
    }

    private void addc(int i, String h) {

    }

    private void addItem(int id, String name, int[] textur) {
        add(id,name,textur);
        i[id].side = null;
    }

    private void add(int id, String s, int[] textur, int[] side) {
        add(id,s,textur);
        if(side!=null)i[id].side = new int[]{side[0],side[1],side[0]+side[2],side[1]+side[2]};
    }

    private void add(int id, String name, int[] textur) {
        i[id] = new Item();
        i[id].id = id;
        i[id].name = name;
        if(textur!=null)i[id].textur = new int[]{(textur[0]-1)*textur[2],(textur[1]-1)*16,textur[0]*textur[2],textur[1]*textur[2]};
        i[id].ghost = false;
    }

     class Item{
        int id = 0;
        String name = "";
         int[] textur = new int[]{0,0,0,0};
        int[] side = new int[]{0,0,0,0};
         boolean ghost = false;
         public Action view = null;
         public Action update = null;
     }
}
class Action{
    public void draw(Graphics g,int X,int Y,int x,int y,int z){}
    public void update(long delta,int x,int y,int z,Start context){}
}