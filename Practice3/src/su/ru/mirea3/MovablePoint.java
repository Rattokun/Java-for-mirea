package su.ru.mirea3;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    };

    public String toString(){
        return "x -"+this.x+"y - "+y+"Speed ("+x+","+y+")";
    };

    @Override
    public void moveUp() {
        this.y = this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y = this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x = this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x = this.xSpeed;
    }
}
