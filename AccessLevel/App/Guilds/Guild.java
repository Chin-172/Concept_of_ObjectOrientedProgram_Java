package Guilds;
import Jobs.Job;

import java.util.ArrayList;
import java.util.Arrays;

public class Guild extends Job{
  public String name;
  private int countOfWizards = 0;
  private int countOfJobs = 0;
  private String[] members = new String[countOfWizards];
  private Job[] jobs = new Job[countOfJobs];
  public Guild() {
    // if a child (Wizard) doesn't join any guild yet, this constructor will be called
  }

  public Guild(String name) {
    // When a guild generated , this constructor should be called.
    this.name = name;
    this.countOfWizards = 0;
  }

  protected void showJobs(){
    if(countOfJobs == 0 ){
      System.out.println("There is no any jobs yet!");
    }else{
      for(int i = 0 ; i < countOfJobs ; i++){
        // Notice that if jobPreview is protected Method !
        // jobs[i].jobPreview() <- Error
        // jobPreview() <- Works
        // Since Job is different package with Guild
        // The object from different package
        // even the method is protected , the class is subclass
        // there is no way to call out the protected methods with different package's object
        jobs[i].jobPreview();
      }
    }

  }

  protected void havingDinner(Wizard wizard){
    System.out.println(wizard.getName()+" having a dinner");
  }

  protected void learning(Wizard wizard){
    System.out.println(wizard.getName()+" is learning magic");
  }

  protected void join(Wizard wizard){
    countOfWizards += 1;
    ArrayList<String>newMember = new ArrayList<String>(Arrays.asList(members));
    newMember.add(wizard.getName());
    members = newMember.toArray(members);
    System.out.println("You are the member now , Welcome "+wizard.getName());
  }

  public void getMembers(){
    for (int i = 0 ; i < countOfWizards ; i++){
      System.out.println(members[i]);
    }
  }

  public void newJob(){
    Job job = new Job("Here is content.","Find a key",100,2);
    ArrayList<Job>newJob = new ArrayList<>(Arrays.asList(jobs));
    newJob.add(job);
    jobs = newJob.toArray(jobs);
    countOfJobs += 1;
  }

  public void newJob(String content,String title ,int reward , int wizards){
    Job job = new Job(content,title,reward,wizards);
    ArrayList<Job>newJob = new ArrayList<>(Arrays.asList(jobs));
    newJob.add(job);
    jobs = newJob.toArray(jobs);
    countOfJobs += 1;
  }
}
