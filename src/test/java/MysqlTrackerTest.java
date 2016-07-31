import com.github.chenmingang.core.MysqlTracker;

import java.io.IOException;

/**
 * Created by hp on 14-9-3.
 */
public class MysqlTrackerTest {

    public static void main(String[]args) throws IOException {
        MysqlTracker tracker = new MysqlTracker("root", "root", "127.0.0.1", 3306, Long.valueOf(1234));
        tracker.mainProc();

    }

}
