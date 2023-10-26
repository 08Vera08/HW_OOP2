import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {

    @Test
    public void shouldStation() {
        Radio enerdgy = new Radio();

        enerdgy.setCurrentStation(7);

        int expected = 7;
        int actual = enerdgy.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationAboveMax() {
        Radio enerdgy = new Radio();

        enerdgy.setCurrentStation(10);

        int expected = 0;
        int actual = enerdgy.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationBelowMin() {
        Radio enerdgy = new Radio();

        enerdgy.setCurrentStation(-1);

        int expected = 9;
        int actual = enerdgy.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        Radio enerdgy = new Radio();

        enerdgy.setCurrentStation(9);

        int expected = 9;
        int actual = enerdgy.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStation() {
        Radio enerdgy = new Radio();

        enerdgy.setCurrentStation(0);

        int expected = 0;
        int actual = enerdgy.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio enerdgy = new Radio();

        enerdgy.setCurrentStation(5);
        enerdgy.nextStation();
        int expected = 6;
        int actual = enerdgy.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio enerdgy = new Radio();

        enerdgy.setCurrentStation(7);
        enerdgy.prevStation();
        int expected = 6;
        int actual = enerdgy.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationBelowBorder() {
        Radio enerdgy = new Radio();

        enerdgy.setCurrentStation(9);
        enerdgy.nextStation();
        int expected = 0;
        int actual = enerdgy.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationAboveBorder() {
        Radio enerdgy = new Radio();

        enerdgy.setCurrentStation(0);
        enerdgy.prevStation();
        int expected = 9;
        int actual = enerdgy.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio enerdgy = new Radio();

        enerdgy.setCurrentVolume(101);

        int expected = 0;
        int actual = enerdgy.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio enerdgy = new Radio();

        enerdgy.setCurrentVolume(-1);

        int expected = 0;
        int actual = enerdgy.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio enerdgy = new Radio();

        enerdgy.setCurrentVolume(15);
        enerdgy.increaseVolume();

        int expected = 16;
        int actual = enerdgy.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeToMax() {
        Radio enerdgy = new Radio();

        enerdgy.setCurrentVolume(99);
        enerdgy.increaseVolume();

        int expected = 100;
        int actual = enerdgy.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio enerdgy = new Radio();

        enerdgy.setCurrentVolume(100);
        enerdgy.increaseVolume();

        int expected = 100;
        int actual = enerdgy.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio enerdgy = new Radio();

        enerdgy.setCurrentVolume(15);
        enerdgy.decreaseVolume();

        int expected = 14;
        int actual = enerdgy.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeToMin() {
        Radio enerdgy = new Radio();

        enerdgy.setCurrentVolume(1);
        enerdgy.decreaseVolume();

        int expected = 0;
        int actual = enerdgy.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio enerdgy = new Radio();

        enerdgy.setCurrentVolume(0);
        enerdgy.decreaseVolume();

        int expected = 0;
        int actual = enerdgy.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}