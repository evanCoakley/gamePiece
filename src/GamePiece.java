public class GamePiece {

    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
        this.name = name;
        this.color = color;
    }

    void move(int positionX, int positionY) {
        if(positionX > 0 && positionY > 0) {
            this.positionX = positionX;
            this.positionY = positionY;
        }else System.out.println("Cannot make this move");
    }


    void freeze() {
        this.frozen = true;

    }
    void unfreeze() {
        this.frozen = false;

    }


}
