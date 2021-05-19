package at.dbo.cc.objects.remote;

import java.util.ArrayList;
import java.util.List;

public class Remote {

    private List<Battery> batteries;

    public Remote() {
        this.batteries = new ArrayList<>();
    }

    public void addBattery (Battery battery){
        this.batteries.add(battery);
    }

    public void selectChannel (int channel){
        System.out.println("Channel " + channel + " selected");
        for (Battery battery: batteries) {
            battery.powerConsumption(0.3);
        }
    }

    public double getStatus (){
        double status = (batteries.get(0).getVoltage() + batteries.get(1).getVoltage());
        return status;
    }

    public int getVoltagePercentage() {
        double x = getStatus() * 100.0 / 7.0;
        int y = (int) x;
        return y;
    }

    public List<Battery> getBatteries() {
        return batteries;
    }
}


