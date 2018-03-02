package model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Table {

    private final SimpleIntegerProperty rID;
    private final SimpleStringProperty rName;
    private final SimpleStringProperty rDate;
    private final SimpleIntegerProperty rRating;

    public Table(int sID, String sName, String sDate, Integer sRating)
    {
        this.rID = new SimpleIntegerProperty(sID);
        this.rName = new SimpleStringProperty(sName);
        this.rDate = new SimpleStringProperty(sDate);
        this.rRating = new SimpleIntegerProperty(sRating);
    }

    public Integer getRID()
    {
        return rID.get();
    }
    public void setRID(Integer v)

    {
        rID.set(v);
    }
    public String getRName()
    {
        return rName.get();
    }
    public void setRName(String v)
    {
        rName.set(v);
    }
    public String getRDate()
    {
        return rDate.get();
    }
    public void setRDate(String v)
    {
        rDate.set(v);
    }
    public Integer getRRating()
    {
        return rRating.get();
    }
    public void setRRating(Integer v)
    {
        rRating.set(v);
    }
}
