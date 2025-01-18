import entity.Island;
import entity.Location;
import utill.Settings;


public class Application {
    public static void main(String[] args) {
        Island island = new Island(Settings.x, Settings.y);

        Location location = new Location();

        Thread thread = new Thread(location);
        thread.start();


    }
}
