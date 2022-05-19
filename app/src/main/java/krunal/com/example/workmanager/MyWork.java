package krunal.com.example.workmanager;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class MyWork extends Worker {

    private static final String TAB = MyWork.class.getSimpleName();

    public MyWork(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {

        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(2000);
                Log.e(TAB, "Working in BackGround 2");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

        return Result.success();
    }
}
