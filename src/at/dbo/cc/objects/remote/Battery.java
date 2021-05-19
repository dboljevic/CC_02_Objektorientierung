package at.dbo.cc.objects.remote;

public class Battery {

    private double voltage;

    public Battery() {
        this.voltage = 3.5;
    }

    public double getVoltage(){
        return voltage;
    }

    public double powerConsumption (double consumption){
        this.voltage -= consumption;
        return voltage;
    }




}
