import entity.Island;
import entity.Location;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Сижу в болезненных раздумьях
// Юра, прости за такой бардак...сложно)

public class Application {
    public static void main(String[] args) {
       Island island = new Island();

        for (int i = 0; i < island.map.length; i++) {
            for (int j = 0; j < island.map[i].length; j++) {
                island.map[i][j] = new Location(i, j, island);
            }
        }
        ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(3);
        for (int i = 0; i < island.map.length; i++) {
            for (int j = 0; j < island.map[i].length; j++) {
                threadPool.scheduleAtFixedRate(island.map[i][j], 0, 1, TimeUnit.SECONDS);
            }
        }
        threadPool.scheduleAtFixedRate(island, 0, 1 , TimeUnit.SECONDS);


    }
}
