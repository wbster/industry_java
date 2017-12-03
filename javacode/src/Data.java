import java.awt.*;
import java.io.*;

class Data {
     static Image BLOCKS;
    private final Start context;

    protected Data(Start context){
        this.context = context;
        BLOCKS = Toolkit.getDefaultToolkit().getImage(getClass().getResource("blocks16.png"));
        //BLOCKS = Toolkit.getDefaultToolkit().getImage(getClass().getResource("blocks16.png"));
        //Toolkit.getDefaultToolkit().createImage("assets/blocks16.png");
    }
     void add(int id,int x,int y,int z){
        try {
            context.map.put(x+":"+y+":"+z,id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     int get(int x,int y,int z){
        int block = 0;
        try {
            block = (int) context.map.get(x+":"+y+":"+z);//.getInt(x+":"+y+":"+z);
        } catch (Exception e) {
            block = 0;
//            if(z == 0){
//                if(rand(1,20) == 1){block = 2;}
//            }
//            if(z == -1){
//                block = 1;
//            }
//            add(block,x,y,z);
        }
        return block;
    }
     String read(String name){
        BufferedReader br = null;
        String everything = "";
        try {
            br = new BufferedReader(new FileReader(name));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        }catch (FileNotFoundException e) {
            return "";
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return everything;
    }
     void write(String name,String content){
        try{
            PrintWriter writer = new PrintWriter(name, "UTF-8");
            writer.println(content);
            writer.close();
            System.out.println("success");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    private int rand(int min,int max){
        return min+(int)(Math.random()*max);
    }


     void remove(int x, int y, int z) {
        context.map.remove(x+":"+y+":"+z);
    }
}
