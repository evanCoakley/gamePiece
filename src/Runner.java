public class Runner {


    public static void main(String[] args) {

    GamePiece gamePiece = new GamePiece();




        if(!gamePiece.isFrozen()) {
            gamePiece.freeze();
            System.out.println("Now Frozen");
        }
        if(gamePiece.isFrozen()) {
            System.out.println("Position unchanged");

        }

        if(gamePiece.isFrozen()) {
            gamePiece.unfreeze();
            System.out.println("No Longer Frozen");
        }
        if(!gamePiece.isFrozen()) {
            System.out.println("positionX before moving: " + gamePiece.getPositionX());
            System.out.println("positionY before moving: " + gamePiece.getPositionY());
            gamePiece.move( 5, 8);
            System.out.println("positionX after moving: " + gamePiece.getPositionX());
            System.out.println("positionY after moving: " + gamePiece.getPositionY());
        }



















    }
}
