public class MarsRover {
    MarsRoverPosition marsRoverPosition;
    public MarsRover(int coordinateX, int coordinateY, String direction) {
        this.marsRoverPosition = new MarsRoverPosition(coordinateX,coordinateY,direction);
    }

    public MarsRoverPosition receiveCommands(String commands) {
        String[] commandsParsed = parseCommands(commands);
        marsRoverPosition.move(commandsParsed);
        return marsRoverPosition;
    }

    private String[] parseCommands(String commands) {
        String[] commandsParsed = new String[commands.length()];
        for(int i = 0 ; i < commands.length(); i++) {
            commandsParsed[i] = String.valueOf(commands.charAt(i));
        }
        return commandsParsed;
    }
}
