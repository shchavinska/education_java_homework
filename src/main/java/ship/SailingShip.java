package ship;

import org.apache.log4j.Logger;

public class SailingShip extends Ship{
    private final static Logger LOGGER = Logger.getLogger(SailingShip.class);
    private int sailAmount;

    public SailingShip(){
        super();
        sailAmount = 0;
    }

    public SailingShip(String name){
        super(name);
        sailAmount = 0;
    }

    public void setSailAmount(int sailAmount) {
        this.sailAmount = sailAmount;
    }

    public int getSailAmount() {
        return sailAmount;
    }

    @Override
    public void printFields() {
        super.printFields();
        LOGGER.info("sailAmount: " + sailAmount);
    }
}
