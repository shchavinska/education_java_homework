package ship;

import org.apache.log4j.Logger;

public class Submarine extends MotorShip implements Shooting{
    private final static Logger LOGGER = Logger.getLogger(Submarine.class);

    @Override
    public void shoot() {
        LOGGER.info("Submarine: " + getName() + " can shoot!!!");
    }

    public Submarine(){
        super();
        setMotorType(MOTOR_TYPE_FUEL);
    }

    public Submarine(String name){
        super(name);
        setMotorType(MOTOR_TYPE_FUEL);
    }
}
