public class MarsRover {
    private int coordinateX;
    private int coordinateY;
    private String direction;
    private  MarsRoverPosition marsRoverPosition;
    public MarsRover(int coordinateX, int coordinateY, String direction) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
        this.marsRoverPosition = new MarsRoverPosition(coordinateX,coordinateY,direction);
    }

    public MarsRoverPosition receiveCommands(String commands) {
        if(commands.equals("M")) {
            marsRoverPosition.setCoordinateY(++coordinateY);
        }
        return marsRoverPosition;
    }
}
