package composicion.robot;

import java.util.ArrayList;

public class Robot {
  private String name;
  private float coordinateX;
  private float coordinateY;
  private Orientation orientation;
  private boolean state;
  private Stage stage;
  private ArrayList<Task> tasks = new ArrayList<Task>();

  public Robot(Task task, String name) {
    this.orientation = Orientation.NORTH;
    this.state = true;
    this.tasks.add(task);
    this.name = name;
  }

  public Robot(float coordinateX, float coordinateY, Orientation orientation, Stage stage, boolean state, Task task) {
    this.coordinateX = coordinateX;
    this.coordinateY = coordinateY;
    this.orientation = orientation;
    this.state = state;
    this.stage = stage;
    this.tasks.add(task);
  }

  public String getName() {
    return name;
  }

  public float getCoordinateX() {
    return coordinateX;
  }

  public float getCoordinateY() {
    return coordinateY;
  }

  public Orientation getOrientation() {
    return orientation;
  }

  public boolean getState() {
    return this.state;
  }

  public void setState(boolean state) {
    this.state = state;
  }

  public void setStage(Stage stage) {
    this.stage = stage;
  }

  public Stage getCurrentStage() {
    return this.stage;
  }

  public ArrayList<Task> getTasks() {
    return tasks;
  }

  public void addTask(Task task) {
    if (this.tasks.indexOf(task) == -1)
      this.tasks.add(task);
  }

  public void deleteTask(int index) {
    this.tasks.remove(index);
  }

  public void rotateForwards() {
    if (this.orientation == Orientation.NORTH) {
      this.orientation = Orientation.EAST;
    } else if (this.orientation == Orientation.EAST) {
      this.orientation = Orientation.SOUTH;
    } else if (this.orientation == Orientation.SOUTH) {
      this.orientation = Orientation.WEST;
    } else {
      this.orientation = Orientation.NORTH;
    }
  }

  public void rotateBackwards() {
    if (this.orientation == Orientation.NORTH) {
      this.orientation = Orientation.WEST;
    } else if (this.orientation == Orientation.WEST) {
      this.orientation = Orientation.SOUTH;
    } else if (this.orientation == Orientation.SOUTH) {
      this.orientation = Orientation.EAST;
    } else {
      this.orientation = Orientation.NORTH;
    }
    ;
  }

  public void move(int distanceToMove) {
    if (this.orientation == Orientation.NORTH) {
      this.coordinateY += distanceToMove;
    }

    if (this.orientation == Orientation.SOUTH) {
      this.coordinateY -= distanceToMove;
    }

    if (this.orientation == Orientation.EAST) {
      this.coordinateX += distanceToMove;
    }

    if (this.orientation == Orientation.WEST) {
      this.coordinateX -= distanceToMove;
    }
  }

  public void move(int coordinateX, int coordinateY) {
    this.coordinateX = coordinateX;
    this.coordinateY = coordinateY;
  }
}