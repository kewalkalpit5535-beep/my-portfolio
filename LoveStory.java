
public class LoveStory {

    public static void main(String[] args) throws InterruptedException {
        String name1 = "Kewal Kalpit";
        String name2 = "Bindamaya Tamang";

        printWithDelay("Once upon a time, in a small town, lived " + name1 + ".", 1000);
        printWithDelay(name1 + " was kind, curious, and always full of dreams.", 1000);

        printWithDelay("One day, " + name1 + " met " + name2 + " at a quiet little café.", 1000);
        printWithDelay(name2 + " had a smile that could light up the darkest sky.", 1000);

        printWithDelay("They started talking, laughing, and sharing their dreams.", 1000);
        printWithDelay("Day by day, their bond grew stronger.", 1000);

        printWithDelay("They supported each other, believed in one another,", 1000);
        printWithDelay("and promised to walk together no matter what.", 1000);

        printWithDelay("And so, " + name1 + " and " + name2 + " began their beautiful journey,", 1000);
        printWithDelay("hand in hand, heart with heart. 💕", 1000);

        printWithDelay("The End. Or maybe... just the beginning. 🌟", 1500);
    }

    public static void printWithDelay(String text, int delay) throws InterruptedException {
        System.out.println(text);
        Thread.sleep(delay); // adds a pause to simulate storytelling
    }
}
