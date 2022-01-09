package Jobs;

public class Job {

  private String content;
  private String title;
  private int reward;
  private int wizardsRequire;

  public Job(){
    // When a child (Guild) generated , here is no necessary to initialize the job
  }
  public Job(String content, String title, int reward, int wizardsRequire) {
    // When a Job is generated , the caller should provide the info of the job
    this.content = content;
    this.title = title;
    this.reward = reward;
    this.wizardsRequire = wizardsRequire;
  }

  protected boolean acceptJob(String guild , int countOfWizards){
    if (countOfWizards >= wizardsRequire){
      System.out.println(guild+" applied the job successfully.");
      return true;
    }
    return false;
  }

  public void jobPreview(){
    System.out.println("Title : "+this.title);
    System.out.println("Content : "+this.content);
    System.out.println("Wizards Require : "+this.wizardsRequire);
    System.out.println("Reward : "+ this.reward);
  }


}
