public class App {

  public static void main(String[] args) {
    Digimon digimon = new Digimon("digimon");
    Hospital hospital = new Hospital();

    digimon.generate();
    digimon.evolution();
    hospital.healing();
  }
}
