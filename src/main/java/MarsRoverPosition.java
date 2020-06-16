public class MarsRoverPosition {
    int coordinateX;
    int coordinateY;
    String direction;
    public MarsRoverPosition(int coordinateX, int coordinateY, String direction) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
