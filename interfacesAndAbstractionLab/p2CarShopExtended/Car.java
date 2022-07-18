package oop.interfacesAndAbstractionLab.p2CarShopExtended;

import java.io.Serializable;

public interface Car extends Serializable {

    Integer TIRES = 4;

    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();

}
