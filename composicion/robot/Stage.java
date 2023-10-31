package composicion.robot;

import java.util.ArrayList;

public class Stage {
  private String name;
  private float[] upperCoordinates;
  private float[] lowerCoordinates;
  private ArrayList<Robot> robots = new ArrayList<Robot>();

  public Stage(String name, float[] upperCoordinates, float[] lowerCoordinate) {
    this.name = name;
    this.lowerCoordinates = lowerCoordinate;
    this.upperCoordinates = upperCoordinates;
  }

  public String getName() {
    return name;
  }

  public float[] getUpperCoordinates() {
    return upperCoordinates;
  }

  public float[] getLowerCoordinates() {
    return lowerCoordinates;
  }

  public void addRobot(Robot robot) {
    if (robot.getCurrentStage() != null && robot.getCurrentStage().getRobots().indexOf(robot) != -1) {
      this.robots.add(robot);
      robot.getCurrentStage().removeRobot(robot);
      robot.setStage(this);
      return;
    }
    this.robots.add(robot);
    robot.setStage(this);
  }

  public void removeRobot(Robot robot) {
    this.robots.remove(robot);
  }

  public ArrayList<Robot> getRobots() {
    return robots;
  }
}