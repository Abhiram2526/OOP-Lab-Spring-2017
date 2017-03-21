/**
 * Created by Batakrishna Sahu.
 * A java program to use Desktop Radio class which have additional states (on, off, current volume, current station)
 * and behavior (turn on, turn off, increase volume, decrease volume, seek, scan, and tune.
 */
public class TurnOnRadio {
    public static void main(String[] args) {

        //Creating New Radio Objects
        Radio radio1 = new Radio();
        Radio radio2 = new Radio();

        //Invoking Methords on the object's state
        radio1.changeState("ON");
        radio1.increaseVolume(76);
        radio1.decreaseVolume(26);
        radio2.changeState("OFF");
        radio1.showStates();
        radio2.showStates();

        //Invoking Methords on the objects's behavior
        radio1.getStationSeek(92.4);
        radio2.getStationSeek(101.4);
        radio1.getStationScan(88.1);
        radio2.getStationScan(94.2);
        radio1.getStationTune(88.6);
        radio2.getStationTune(99.1);
        radio1.showBehavior();
        radio2.showBehavior();
    }
}
