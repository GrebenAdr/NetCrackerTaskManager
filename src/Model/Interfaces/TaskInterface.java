package Model.Interfaces;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 * Created by Opsymonroe on 06.11.2017.
 */
public interface TaskInterface extends Serializable {
    public String toString();
    public String getName();
    public GregorianCalendar getDate();
    public void setDate(GregorianCalendar date);
}
