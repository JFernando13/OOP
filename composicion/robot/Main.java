package composicion.robot;

public class Main {
  public static void printTasks(Robot robot) {
    System.out.println("Tareas " + robot.getName() + ":");
    robot.getTasks().forEach(task -> {
      System.out.printf("* %s - %s%n", task.getDescription(), task.getPriority());
    });
  
    System.out.printf("%n");
  }

  public static void printStage(Stage stage) {
    System.out.printf("%nRobots del stage: %s%n", stage.getName());
    if (stage.getRobots().size() == 0) {
      System.out.println("No tiene ningun robot");
      return;
    }
    stage.getRobots().forEach(robot -> System.out.println("- " + robot.getName()));
  }

  public static void main(String[] args) {
    Task task1 = new Task("Dar tres pasos", 3);
    Task task2 = new Task("Ser mi asistente personal", 10);
    Task task3 = new Task("Sacar a pasear a mi perro", 6);

    Stage stage1 = new Stage("La selva", new float[] { 0, 0 }, new float[] { 1, 2 });
    Stage stage2 = new Stage("La selva 2.0", new float[] { 0, 0 }, new float[] { 1, 2 });
    Stage stage3 = new Stage("La selva 3.0", new float[] { 0, 0 }, new float[] { 1, 2 });

    Robot robot1 = new Robot(task1, "Pancho");
    Robot robot2 = new Robot(task1, "Carlooxx");
    Robot robot3 = new Robot(task1, "El Maxwell");

    stage3.addRobot(robot1);
    stage2.addRobot(robot1);
    stage2.addRobot(robot2);
    stage1.addRobot(robot3);

    robot1.addTask(task2);
    robot2.addTask(task1);
    robot3.addTask(task1);
    robot2.addTask(task3);

    printStage(stage1);
    printStage(stage2);
    printStage(stage3);

    System.out.println("");
    printTasks(robot1);
    printTasks(robot2);
    printTasks(robot3);
  }
}
