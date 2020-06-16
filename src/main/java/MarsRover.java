public class MarsRover {
    MarsRoverPosition marsRoverPosition;
    public MarsRover(int coordinateX, int coordinateY, String direction) {
        this.marsRoverPosition = new MarsRoverPosition(coordinateX,coordinateY,direction);
    }

    public MarsRoverPosition receiveCommands(String commands) {
        marsRoverPosition.moveToward(commands);
        return marsRoverPosition;
    }


}
