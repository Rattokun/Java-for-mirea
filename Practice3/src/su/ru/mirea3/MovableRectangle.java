package su.ru.mirea3;

public class MovableRectangle implements Movable{
    public MovablePoint topLeft;
    public MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean speedEquality()
    {
        if ((this.topLeft.xSpeed == this.bottomRight.xSpeed)&&(this.topLeft.ySpeed == this.bottomRight.ySpeed))
        {
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "topLeft - " + topLeft + ", bottomRight - " + bottomRight + "x1,x2 - " + this.topLeft.x +","+this.bottomRight.x
                +"y1,y2 - "+this.topLeft.y+","+this.bottomRight.y + "Top Left speed x,y - " +this.topLeft.xSpeed+","+this.bottomRight.ySpeed
                +"Bottom speed x,y - "+this.bottomRight.xSpeed+","+this.bottomRight.ySpeed;
    }

    @Override
    public void moveUp() {
        if (speedEquality())
        {
            MovablePoint temp1 = this.topLeft;
            MovablePoint temp2 = this.bottomRight;
            temp1.y += this.topLeft.xSpeed;
            temp1.y += this.bottomRight.xSpeed;
        }
        else
            System.out.println("Not equal speed");
    }

    @Override
    public void moveDown() {
        if (speedEquality())
        {
            MovablePoint temp1 = this.topLeft;
            MovablePoint temp2 = this.bottomRight;
            temp1.y -= this.topLeft.xSpeed;
            temp1.y -= this.bottomRight.xSpeed;
        }
        else
            System.out.println("Not equal speed");
    }

    @Override
    public void moveLeft() {
        if (speedEquality())
        {
            MovablePoint temp1 = this.topLeft;
            MovablePoint temp2 = this.bottomRight;
            temp1.x -= this.topLeft.xSpeed;
            temp1.x -= this.bottomRight.xSpeed;
        }
        else
            System.out.println("Not equal speed");
    }

    @Override
    public void moveRight() {
        if (speedEquality())
        {
            MovablePoint temp1 = this.topLeft;
            MovablePoint temp2 = this.bottomRight;
            temp1.x += this.topLeft.xSpeed;
            temp1.x += this.bottomRight.xSpeed;
        }
        else
            System.out.println("Not equal speed");
    }
}
