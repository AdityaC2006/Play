class Player{
  //Variables
  private String name;
  private int height;
  private int weight;
  private String team;
  private int number;

 //superclass constructer
  public Player(String name, int height, int weight, String team, int number) {

    this.height = height;
    this.weight = weight;
    this.team = teamteam;
    this.number = number;
  }
 //getter
  public String getName(){
    return name;
  }
  public int getHeight(){
    return height;
  }
  public int getWeight() {
    return weight;
  }
  public String getTeam() {
    return team;
  }
  public int getNumber(){
    return number;
  }
}
