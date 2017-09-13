public class Runner {


    public static void main(String[] args) {

        GamePiece gamePiece = new GamePiece();


        if (!gamePiece.isFrozen()) {
            gamePiece.freeze();
            if (gamePiece.isFrozen()) {
                System.out.println("Verified freeze method works");
            } else System.out.println("Freeze method does not work");

        }

        if (gamePiece.isFrozen()) {
            gamePiece.unfreeze();
            if (!gamePiece.isFrozen()) {
                System.out.println("unfreeze method works");
            } else System.out.println("unfreeze method does not work");
        }

        if (!gamePiece.isFrozen()) {
            gamePiece.move(5, 8);
                if(!gamePiece.isFrozen()){
                    System.out.println("Verified move method works");
                } else System.out.println("Move method has errors");

        }
        if(gamePiece.isFrozen()) {
            gamePiece.move(0,0);
            if(gamePiece.isFrozen()) {
                System.out.println("Verified move method does not change position when frozen");
            } else System.out.println("Move method has is overactive");
        }
    }
}
