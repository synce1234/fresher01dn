
package viewmodel;

import java.util.ArrayList;

import model.dto.Bee;

public class BeeViewModel {

    private ArrayList<Bee> alb = null;

    public BeeViewModel() {

    }

    public BeeViewModel(ArrayList<Bee> alb) {

        this.alb = alb;
    }

    public ArrayList<Bee> getAlb() {

        return this.alb;
    }

    public void setAlb(ArrayList<Bee> alb) {

        this.alb = alb;
    }
}
