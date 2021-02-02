package testMock;

import port.Seaport;
import ship.MotorShip;
import ship.Rowboat;
import ship.SailingShip;
import ship.Submarine;
import utils.JsonConverter;

import org.apache.log4j.Logger;

public class CreateSeaport {

    private final static Logger LOGGER = Logger.getLogger(CreateSeaport.class);
    static JsonConverter jsonAction = new JsonConverter();

    public static void createPort () {
        LOGGER.info("Seaport created");

        Seaport port = new Seaport();

        Submarine submarine = new Submarine("Phobe");
        submarine.setWeight(100500);
        submarine.shoot();
        port.addShipToPort(submarine);

        Rowboat rowboat = new Rowboat("Chandler");
        rowboat.setYearOfCreation(1994);
        port.addShipToPort(rowboat);

        SailingShip sailingShip = new SailingShip("Monica");
        sailingShip.setSailAmount(2);
        port.addShipToPort(sailingShip);

        MotorShip motorShipRacel = new MotorShip("Racel");
        motorShipRacel.setYearOfCreation(2020);
        motorShipRacel.setMotorType(MotorShip.MOTOR_TYPE_STEAM);
        port.addShipToPort(motorShipRacel);

        MotorShip motorShipChip = new MotorShip("Chip");
        motorShipChip.setYearOfCreation(2020);
        motorShipChip.setMotorType(MotorShip.MOTOR_TYPE_ELECTRIC);
        port.addShipToPort(motorShipChip);

        MotorShip motorShipPaolo = new MotorShip("Paolo");
        motorShipPaolo.setYearOfCreation(2020);
        motorShipPaolo.setMotorType(MotorShip.MOTOR_TYPE_FUEL);
        port.addShipToPort(motorShipPaolo);

        MotorShip motorShipBarry = new MotorShip("Barry");
        motorShipBarry.setYearOfCreation(2020);
        motorShipBarry.setMotorType(MotorShip.MOTOR_TYPE_UNKNOWN);
        port.addShipToPort(motorShipBarry);

        port.printEveryoneInPort();
        jsonAction.toJsonFile(port, "ship.json");
    }
}
