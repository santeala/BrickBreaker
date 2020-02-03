import java.awt.*;

public class Paddle {

    int x, y;
    final int Width = 20, Height = 20;
    double dx = 2, dy = 20;
    Game game;
    Board board;

    public Paddle(Board board, Game game){
        x = board.getWidth()/2;
        y = board.getHeight()/2;
        this.board = board;
        this.game = game;
    }

    public void move(){
        if(game.isRightPressed() && (getX() + getWidth()) < board.getWidth()){
            x+=dx;
        }
        if(game.isLeftPressed() && getX() > 0){
            x-=dx;
        }
    }

    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(x, y, Width, Height);
    }

    public int getX() {
        return x;
    }

    public int getWidth() {
        return Width;
    }
}
