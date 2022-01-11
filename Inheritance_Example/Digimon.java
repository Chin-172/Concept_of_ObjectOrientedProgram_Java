public class Digimon extends Monster{

  public Digimon(String name) {
    this.setName(name);
  }

  @Override
  public void generate(){
    System.out.println(this.getName()+" is generated.");
  }
}
