public class Runner {


    public static void main(String[] args) {

    GamePiece gamePiece = new GamePiece();

        gamePiece.setName("Bishop");
        gamePiece.setColor("Black");
        gamePiece.move(1, 2);
        System.out.println(gamePiece.getPositionX());
        System.out.println(gamePiece.getPositionY());


    }
}
