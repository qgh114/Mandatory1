import java.util.Random;

public class Octopus extends Animal {
    int act;

    @Override
    public String move() {
        return "Swish Swoosh";
    }

    private static final Random random = new Random();
    private static final int min = 1;
    private static final int max = 10;


    public void makeDoActivity() {
        while (true) {
            try {
                String activity = activity();
                System.out.println(activity());
                if (activity.equals("Mate")) {
                    GameOfOctopus gameThread = new GameOfOctopus();
                    gameThread.start();
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(activity());
        }
    }




    private String activity() {
        String activity = null;

        int activityNumber = random.nextInt(max) + min;
        switch (activityNumber) {
            case 1:
                activity = "Dancing";
                //System.out.println("Dancing");
                break;
            case 2:
                activity = "Fighting";
                //System.out.println("Fighting");
                break;
            case 3:
                activity = "Sleeping";
                // System.out.println("Sleeping");
                break;
            case 4:
                activity = "Laughing";
                //System.out.println("Laughing");
                break;
            case 5:
                activity = "Swooshing";
                //System.out.println("Swooshing");
                break;
            case 6:
                activity = "Mate";
                // System.out.println("Relaxing");
                break;
            default:
                activity = "no activity";
                //System.out.println("no activity");
        }
        return activity;

    }


    public String species() {
        String activity = null;

        int activityNumber = random.nextInt(max) + min;
        switch (activityNumber) {
            case 1:
                activity = "I am a Octopus Vulgaris";

                break;
            case 2:
                activity = "I am a Bathypolypus Arcticus";
                //System.out.println("Fighting");
                break;
            case 3:
                activity = "I am a Eledone Cirrhosa";
                break;
            case 4:
                activity = "I am a Haliphron Atlanticus";
                break;

            default:
                activity = "I dont know, I thouht you knew \uD83D\uDC19 ";
        }
        return activity;

    }

    public String cornyjokes() {
        String activity = null;

        int activityNumber = random.nextInt(max) + min;
        switch (activityNumber) {
            case 1:
                activity = "What did the janitor say when he jumped out of the closet?      Supplies!";

                break;
            case 2:
                activity = "Have you heard about the chocolate record player? It sounds pretty sweet.";

                break;
            case 3:
                activity = "I only know 25 letters of the alphabet. I don't know y.";
                break;
            case 4:
                activity = "What did one wall say to the other? I'll meet you at the corner.";
                break;

            default:
                activity = "Which animal is the absolute expert in navigating the internet? A spider. Because spiders know all about the web! ";
        }
        return activity;

    }

    public String secret(){
        return "You better give this assignment good feedback. Or else \uD83D\uDD2B \uD83D\uDC19";
    }

}

