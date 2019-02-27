public class Speaker {
  public static final String hashtag = "TechTalkSE";

  public String name = "Zuzanna Pacholczyk";
  public String talk = "Heal the code make it a better place";

  private int age = 25;
  private Integer fearAndStressLevel = 70;

  public InspiringTalk supportTheSpeaker(Set<Smile> stressKillers) {
    this.fearAndStressLevel -= 50;
    return this.conference.talk(this.name, this.talk);
  }
}
