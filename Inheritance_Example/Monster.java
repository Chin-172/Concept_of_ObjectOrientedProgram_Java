public class Monster {
  private String name;
  private int Hp;

  public void generate(){
    System.out.println("Monster is genertated");
  }

  public final void evolution(){
    System.out.println(getName()+" evolution!!!!");
  }
  public String getName() {
    return name;
  }

  public void setHp(int hp) {
    Hp = hp;
  }

  public void setName(String name) {
    this.name = name;
  }
}
