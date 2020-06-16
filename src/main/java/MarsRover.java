public class MarsRover {
    MarsRoverPosition marsRoverPosition;
    public MarsRover(int coordinateX, int coordinateY, String direction) {
        this.marsRoverPosition = new MarsRoverPosition(coordinateX,coordinateY,direction);
    }

    public MarsRoverPosition receiveCommands(String commands) {
        if(commands.equals("M")) {
            if(marsRoverPosition.direction.equals("N")) {
                marsRoverPosition.setCoordinateY(marsRoverPosition.getCoordinateY()+1);
            }
            if(marsRoverPosition.direction.equals("S")) {
                marsRoverPosition.setCoordinateY(marsRoverPosition.getCoordinateY()-1);
            }
        }
        return marsRoverPosition;
    }
}
