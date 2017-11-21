import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Start extends Canvas implements Runnable{
    private static final long serialVersionUID = 1L;
    private boolean running;
     Stage stage;
     Mouse mouse;
     User user;
     int block = 51;
     Items items;
     Data data;
     JSONObject map;
     void start(){
        running = true;
        data = new Data(this);
        try {
            map = new JSONObject(data.read("data.json"));
        } catch (JSONException e) {
            map = new JSONObject();
        }

        items = new Items(this);
        user = new User(this);
        stage = new GameView(this);
        mouse = new Mouse(this);
        addMouseListener(mouse);
        addMouseMotionListener(mouse);
        addMouseWheelListener(mouse);
        addKeyListener(mouse);
        new Thread(this).start();
    }
    public void run() {
        long time = System.currentTimeMillis();
        long delta = System.currentTimeMillis();
        while(running) {
            if(System.currentTimeMillis()-time>10){render();time = System.currentTimeMillis();
            stage.update(System.currentTimeMillis()-delta);
            delta = System.currentTimeMillis();}
        }
    }
     void render() {
        BufferStrategy bs = getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(2);
            requestFocus();
            return;
        }
        Graphics g = bs.getDrawGraphics();
        stage.draw(g);
        g.dispose();
        bs.show();
    }
    public static void main(String[] args) {
        Start game = new Start();
        game.setPreferredSize(new Dimension(1000, 650));
        JFrame frame = new JFrame("game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(game, BorderLayout.CENTER);
        frame.getContentPane().setBackground(Color.BLACK);
        //ns frame.setIconImage(new ImageIcon(getClass().getResource("clear512.png")).getImage());
        //hiden cursor
//        frame.setCursor(frame.getToolkit().createCustomCursor(
//                new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(5, 5),
//                "null"));
        frame.pack();
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        game.start();
    }
}
