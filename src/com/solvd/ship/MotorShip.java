package com.solvd.ship;


public class MotorShip extends Ship{

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
        System.out.println("motorType: " + motorType);
    }

    @Override
    public void swim(){
        System.out.print(getName() + ": ");
        switch (this.motorType){
            case MOTOR_TYPE_STEAM:
                System.out.println("Chuh-chuh");
                break;
            case MOTOR_TYPE_ELECTRIC:
                System.out.println("Bzzz-zzz");
                break;
            case MOTOR_TYPE_FUEL:
                System.out.println("Drin-drin");
                break;
            case MOTOR_TYPE_UNKNOWN:
            default:
                System.out.println("**silence**");
                break;
        }
    }
}