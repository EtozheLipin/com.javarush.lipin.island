import entity.Island;
import entity.Location;
import utill.Settings;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class Application {
    public static void main(String[] args) {
        Island island = new Island(Settings.x, Settings.y);

        Location location = new Location();



        ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(1);
        threadPool.scheduleAtFixedRate(location, 0, 1, TimeUnit.SECONDS);




    }
}
