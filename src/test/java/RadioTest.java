import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testStation_1() {
        Radio radio = new Radio();
        radio.setCarrentStation(5);
        radio.setCarrentStation(0);
        radio.next();
        int actual = radio.getCarrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStation_2() {
        Radio radio = new Radio();
        radio.setCarrentStation(5);
        radio.setCarrentStation(8);
        radio.next();
        int actual = radio.getCarrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStation_3() {
        Radio radio = new Radio();
        radio.setCarrentStation(9);
        radio.next();
        int actual = radio.getCarrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStation_4() {
        Radio radio = new Radio();
        radio.setCarrentStation(5);
        radio.setCarrentStation(0);
        radio.prev();
        int actual = radio.getCarrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStation_5() {
        Radio radio = new Radio();
        radio.setCarrentStation(1);
        radio.prev();
        int actual = radio.getCarrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStation_6() {
        Radio radio = new Radio();
        radio.setCarrentStation(11);
        radio.prev();
        int actual = radio.getCarrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStation_7() {
        Radio radio = new Radio();
        radio.setCarrentStation(-11);
        radio.prev();
        int actual = radio.getCarrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testVolume_1() {
        Radio radio = new Radio();
        radio.setCarrentVolume(0);
        radio.up();
        int actual = radio.getCarrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume_2() {
        Radio radio = new Radio();
        radio.setCarrentVolume(101);
        radio.up();
        int actual = radio.getCarrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume_3() {
        Radio radio = new Radio();
        radio.setCarrentVolume(100);
        radio.up();
        int actual = radio.getCarrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume_4() {
        Radio radio = new Radio();
        radio.setCarrentVolume(0);
        radio.down();
        int actual = radio.getCarrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume_5() {
        Radio radio = new Radio();
        radio.setCarrentVolume(100);
        radio.down();
        int actual = radio.getCarrentVolume();
        int expected = 99;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume_6() {
        Radio radio = new Radio();
        radio.setCarrentVolume(-1);
        radio.down();
        int actual = radio.getCarrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}