public class ball {
    private int x;
    private int y;
    private int vx;
    private int vy;

    public ball(int x, int y, int vx, int vy) {
        this.x = x;
        this.y = y;
        this.vx = 1;
        this.vy = 1;
    }

    public void move(){
        x += vx;
        y += vy;
    }

    public void bounce() {
        vy -= vy;
    }

    public void bounce(paddle p){
        p.getX();
        p.getY();
        p.getWidth();

        if ((p.getY() >= y) && (y <= p.getWidth())){
            if (p.getX() + p.getY() == this.x + this.y) {
                vx -= vx;
            }
        }



    }


}
