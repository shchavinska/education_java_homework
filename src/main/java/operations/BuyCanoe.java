package operations;

import exceptions.InputExceptions;
import port.CanoeToBuy;
import ship.Canoe;
import utils.ReadingFromFile;
import utils.WritingToFile;

import org.apache.log4j.Logger;

public class BuyCanoe {
    private final static Logger LOGGER = Logger.getLogger(BuyCanoe.class);

    public static void buyCanoe (CanoeToBuy canoeToBuy) throws InputExceptions {
        LOGGER.info("Do you want to bye canoe: (yes/no) ");
        String answer = Input.inputStr();

        if ("no".equals(answer)){
            LOGGER.info("Okay.");
        }
        else if ("yes".equals(answer)){
            LOGGER.info("Which canoe do you want to buy: ");
            String answer2 = Input.inputStr();
            Canoe boughtCanoe = canoeToBuy.removeCanoe(answer2);
            if (boughtCanoe!=null) {
                LOGGER.info("Okay, You just buy canoe " + answer2 + "!!!");
                WritingToFile wasBoughtWrite = new WritingToFile();
                wasBoughtWrite.writeToFile("boughtCanoe.txt", "Canoe " + boughtCanoe.getName() + " was bought.");
                ReadingFromFile wasBoughtRead = new ReadingFromFile();
                LOGGER.info(wasBoughtRead.readFromFile("boughtCanoe.txt"));
            }
            else {
                throw new InputExceptions("Can't found canoe " + answer2);
            }
        }
        else {
            throw new InputExceptions("Sorry, I don't know what you mean.");
        }
    }
}
