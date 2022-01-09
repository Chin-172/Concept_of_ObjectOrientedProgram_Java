package Guilds;

public class Wizard extends Guild{
  private String name;
  private String magicType;
  private String position;

  public Wizard(String guild, String name, String magicType, String position) {
    // Generate a wizard who joined a guild already
    super(guild);
    this.name = name;
    this.magicType = magicType;
    this.position = position;
  }

  public Wizard(String name, String magicType, String position) {
    // Generate a wizard who didn't join any guild yet
    this.name = name;
    this.magicType = magicType;
    this.position = position;
  }

  void attack(){
    // This is non-modifier method (only same package classes can be called out )
    System.out.println(name+" attack!");
  }

  void protect(){
    // This is non-modifier method (only same package classes can be called out )
    System.out.println(name+" protect!");
  }

  public String getName() {
    return name;
  }

  public void joinGuild(Guild guild){
    guild.join(this);
  }

  public void jobPreview(Guild guild){
    // showJobs();
    // Since extended class (Guild) is in the same package with this class
    // Here can call out the protected methods with same package's object
    // guild.showJobs(); <- It works !
    guild.showJobs();
  }
}
