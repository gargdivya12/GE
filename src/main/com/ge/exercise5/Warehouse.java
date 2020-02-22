package com.ge.exercise5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static com.ge.exercise5.ItemType.*;

public class Warehouse {
    private static final Logger logger = LogManager.getLogger(Warehouse.class);

    List<Item> items;

    public Warehouse() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void updateItems() {
        for (Item item : items) {
            if (item.getType() != AGEABLE && item.getType() != RARE) {
                if (item.getValue() > 0) {
                    if (item.getType() == NORMAL || item.getType() == PERISHABLE) {      //normal
                        item.setValue(item.getValue() - 1);
                        if(item.getType() == PERISHABLE) //perishable
                        {
                        	 item.setValue(item.getValue() - 1);
                        }
                    }
                }
            } else if (item.getType() != NORMAL && item.getType() != AGEABLE && item.getType() != RARE && item.getType()!= PERISHABLE) {
                if (item.getValue() > 0) {
                    item.setValue(item.getValue() - 1); //precious
                }
            } else if (item.getValue() < 50) {
                item.setValue(item.getValue() + 1); 
                if (item.getType() == RARE) {
                    if (item.getSellBy() <= 14) {
                        if (item.getValue() < 50)
                            item.setValue(item.getValue() + 1);
                    }
                    if (item.getSellBy() <= 7) {                    //rare
                        if (item.getValue() < 50)
                            item.setValue(item.getValue() + 1);
                    }
                }
            }
            
            
            if (item.getType() != PRECIOUS) {
                item.setSellBy(item.getSellBy() - 1); //SELL BY LOGIC
            }
            
            if (item.getSellBy() < 0) {
                if (item.getType() != AGEABLE) {
                    if (item.getType() != RARE && item.getType() != PERISHABLE ) {
                        if (item.getValue() > 0) {
                            if (item.getType() != PRECIOUS) {
                                item.setValue(item.getValue() - 1); //PRECIOUS AFTER SELL DATE 
                            }
                        }
                    } else {
                        item.setValue(item.getValue() - item.getValue()); //RARE AFTER SELL DATE ////assuming perishable after sell date as 0
                    }
                } else {
                    if (item.getValue() < 50) {
                        item.setValue(item.getValue() + 1); //AGEABLE AFTER SELLBY GOES TO 0
                    }
                }
            }
        }
    }
}
