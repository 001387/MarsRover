public class MarsRoverPosition {
    int coordinateX;
    int coordinateY;
    String direction;
    public MarsRoverPosition(int coordinateX, int coordinateY, String direction) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    protected void move(String[] commands) {
        for (String command:commands) {
            if(command.equals("M")) {
                moveToward();
            } else if(command.equals("R")) {
                trunRight();
            } else if(command.equals("L")) {
                turnLeft();
            }
        }
    }

    private void turnLeft() {
        if(direction.equals("N")) {
            direction = "W";
        } else if(direction.equals("E")) {
            direction = "N";
        } else if(direction.equals("S")) {
            direction = "E";
        } else if(direction.equals("W")) {
            direction = "S";
        }
    }

    private void trunRight() {
        if(direction.equals("N")) {
            direction = "E";
        } else if(direction.equals("E")) {
            direction = "S";
        } else if(direction.equals("S")) {
            direction = "W";
        } else if(direction.equals("W")) {
            direction = "N";
        }
    }

    private void moveToward() {
        if(direction.equals("N")) {
            coordinateY++;
        } else if(direction.equals("S")) {
            coordinateY--;
        } else if(direction.equals("E")) {
            coordinateX++;
        } else if(direction.equals("W")) {
            coordinateX--;
        }
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public String getDirection() {
        return direction;
    }
}
