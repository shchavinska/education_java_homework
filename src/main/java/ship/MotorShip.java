package ship;

import org.apache.log4j.Logger;

public class MotorShip extends Ship{
    private final static Logger LOGGER = Logger.getLogger(MotorShip.class);

    private String motorType;
    public static final String MOTOR_TYPE_UNKNOWN = "Unknown";
    public static final String MOTOR_TYPE_STEAM = "Steam";
    public static final String MOTOR_TYPE_ELECTRIC = "Electric";
    public static final String MOTOR_TYPE_FUEL = "Fuel";

    public MotorShip(){
        super();
        motorType = MOTOR_TYPE_UNKNOWN;
    }

    public MotorShip(String name){
        super(name);
        motorType = MOTOR_TYPE_UNKNOWN;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public String getMotorType() {
        return motorType;
    }

    @Override
    public void printFields() {
        super.printFields();
        LOGGER.info("motorType: " + motorType);
    }

    @Override
    public void swim(){
        LOGGER.info(getName() + ": ");
        switch (this.motorType){
            case MOTOR_TYPE_STEAM:
                LOGGER.info("Chuh-chuh");
                break;
            case MOTOR_TYPE_ELECTRIC:
                LOGGER.info("Bzzz-zzz");
                break;
            case MOTOR_TYPE_FUEL:
                LOGGER.info("Drin-drin");
                break;
            case MOTOR_TYPE_UNKNOWN:
            default:
                LOGGER.info("**silence**");
                break;
        }
    }
}
