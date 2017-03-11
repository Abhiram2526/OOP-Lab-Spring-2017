/**
 * Created by Batakrishna Sahu.
 * Desktop Radio class having additional states (on, off, current volume, current station)
 * and behavior (turn on, turn off, increase volume, decrease volume, seek, scan, and tune.
 */
class Radio {

        String state = "on";
        int volume = 0;
        double stationSeek = 0.0;
        double stationScan = 0.0f;
        double stationTune = 0.0f;


        void changeState(String newState)
        {
            state = newState;
        }

        void increaseVolume(int newVolume)
        {
            volume = volume + newVolume;
        }

        void decreaseVolume(int newVolume)
        {
             volume = volume - newVolume;
        }

        void showStates()
        {
            System.out.println("State:" + state + " Volume:" +
                    volume );
        }

        void getStationSeek(double newStationSeek)
        {
             stationSeek = newStationSeek;
        }

        void getStationScan(double newStationScan)
        {
            stationScan = newStationScan;
        }

        void getStationTune(double newStationTune)
        {
            stationTune = newStationTune;
        }

        void showBehavior()
        {
            System.out.println("Seeked_Station:" + stationSeek + " Scaned_Station:" +
                    stationScan + " Tuned_Sation:" + stationTune );
        }
}

