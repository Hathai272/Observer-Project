/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observer;
import java.util.Observable;

/**
 *
 * @author sarun
 */
public class Senior implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(
	 "(senior) headquater is updated to " + 
                ((HeadQuater)o).getSomeData());
    }
}
