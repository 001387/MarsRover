public class MarsRoverPosition {
    int coordinateX;
    int coordinateY;
    String direction;
    public MarsRoverPosition(int coordinateX, int coordinateY, String direction) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    protected void moveToward(String commands) {
        if(direction.equals("N")) {
            setCoordinateY(getCoordinateY()+1);
        }
        if(direction.equals("S")) {
            setCoordinateY(getCoordinateY()-1);
        }
        if(direction.equals("E")) {
            setCoordinateX(getCoordinateX()+1);
        }
        if(direction.equals("W")) {
            setCoordinateX(getCoordinateX()-1);
        }
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
