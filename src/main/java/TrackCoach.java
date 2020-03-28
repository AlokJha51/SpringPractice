public class TrackCoach implements Coach {

    private HappyFortuneService happyFortuneService;

   /* public TrackCoach(HappyFortuneService happyFortuneService) {
        this.happyFortuneService = happyFortuneService;
    }
*/
   private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    private String team;
    public void setHappyFortuneService(HappyFortuneService happyFortuneService) {
        this.happyFortuneService = happyFortuneService;
    }

    public String giveDailyWorkout() {
        happyFortuneService.dailyFortune();
      System.out.println("Email : " + email + " Team : " + team);
        return "Run 5 km in 20 min";
    }

    private void startUp(){
        System.out.println("Initialization method");
    }

    private void endUp(){
        System.out.println("Destruction method");
    }

}
