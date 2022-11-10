public class ball {
    private int x;
    private int y;
    private int vx;
    private int vy;

    public ball(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(){
        x = vx;
        y = vy;
    }

    public void bounce(paddle p){

    }

    public void bounce() {
        vx += vx;
        vy += vx;
    }
}
