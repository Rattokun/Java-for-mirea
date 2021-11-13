package su.ru.mirea3;

public class MovableCircle implements Movable{

    public int radius;
    public MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    };

    public String toString(){
        return "x = " + center.x + " y = " + center.y + " xSpeed = " + center.xSpeed + " ySpeed = " + center.ySpeed;

    };

    @Override
    public void moveUp() {
        MovablePoint temp = this.center;
        temp.y += this.center.ySpeed;
    }

    @Override
    public void moveDown() {
        MovablePoint temp = this.center;
        temp.y -= this.center.ySpeed;
    }

    @Override
    public void moveLeft() {
        MovablePoint temp = this.center;
        temp.x -= this.center.xSpeed;
    }

    @Override
    public void moveRight() {
        MovablePoint temp = this.center;
        temp.x += this.center.xSpeed;
    }
}
