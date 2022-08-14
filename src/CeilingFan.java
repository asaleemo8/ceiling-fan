/**
 * Celing Fan
 *
 * An assessment set by Medavie Blue Cross recruitment team.
 *
 * Test statement follows:
 *
 * In Java,  implement a simple ceiling fan with these characteristics:
 * •    The unit has 2 pull cords:   One increases the speed each time it is pulled.  There are 3 speed settings, and an “off” (speed 0) setting.   If the cord is pulled on speed 3, the fan returns to the “off” setting. One reverses the direction of the fan at the current speed setting. Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.
 * •    You can assume the unit is always powered (no wall switch)
 *
 * @author Adnan Saleem
 * @date 14 Aug 2022
 */


public class CeilingFan {

    private int speed = 0;
    private boolean rotateClockWise = false;

    public CeilingFan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void pullSpeedCord() {
        this.speed++;
        if(speed > 3) {
            speed = 0;
        }
    }

    public boolean isRotateClockWise() {
        return rotateClockWise;
    }

    public void pullReverseCord() {
        this.rotateClockWise = !this.rotateClockWise;
    }

    @Override
    public String toString() {
        return "CeilingFan{" +
                "speed=" + speed +
                ", rotateClockWise=" + rotateClockWise +
                '}';
    }

    public static void main(String[] args) {
        CeilingFan fan = new CeilingFan();
        System.out.println(fan);
        System.out.println("Pulling Speed Cord");
        fan.pullSpeedCord();
        System.out.println(fan);
        System.out.println("Pulling Speed Cord");
        fan.pullSpeedCord();
        System.out.println(fan);
        System.out.println("Pulling Speed Cord");
        fan.pullSpeedCord();
        System.out.println(fan);

        // pull rotation cord.
        System.out.println("Pulling Reverse Cord");
        fan.pullReverseCord();
        System.out.println(fan);

        System.out.println("Pulling Speed Cord");
        fan.pullSpeedCord();
        System.out.println(fan);

    }
}
