import Guilds.*;

public class App {

  public static void main(String[] args) {
    Guild fairy_tail = new Guild("Fairy Tail");
    Wizard lucy = new Wizard("Lucy","holderMagic","legacyWizards");
    lucy.joinGuild(fairy_tail);
    fairy_tail.getMembers();
    fairy_tail.newJob();
    lucy.jobPreview(fairy_tail);

    Guild saber_tooth = new Guild("SaberTooth");
    Wizard sting_eucliffe = new Wizard("Sting_Eucliffe","holderMagic","Master");
    sting_eucliffe.joinGuild(saber_tooth);
    saber_tooth.getMembers();
    saber_tooth.newJob("Here is content","Save the village",10204,3);
    sting_eucliffe.jobPreview(saber_tooth);
  }
}
