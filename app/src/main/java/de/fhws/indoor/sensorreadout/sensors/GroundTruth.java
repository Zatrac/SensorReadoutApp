package de.fhws.indoor.sensorreadout.sensors;

import android.app.Activity;
import android.os.SystemClock;

/**
 * Virtual Ground-Truth sensor
 * <p>
 *     This sensor inserts the ground-truth events generated by user-interaction.
 * </p>
 * @author Toni Fetzer
 */
public class GroundTruth extends mySensor {

    public GroundTruth(final Activity act){
        //empty as my soul
    }

    public void writeGroundTruth(final int groundTruthCounter){
        if (listener != null){listener.onData(SensorType.GROUND_TRUTH, SystemClock.elapsedRealtimeNanos(),
                Integer.toString(groundTruthCounter)
        );}
    }

    public void writeInitData(int pathID, int numGroundTruthPoints){

        if (listener != null){listener.onData(SensorType.GROUND_TRUTH_PATH, SystemClock.elapsedRealtimeNanos(),
                Integer.toString(pathID) + ";" +
                Integer.toString(numGroundTruthPoints)
        );}
    }

    @Override
    public void onResume(Activity act) {

    }

    @Override
    public void onPause(Activity act) {

    }
}
