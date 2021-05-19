package at.dbo.cc.objects.bike;

public class Light {

    private boolean isOn = false;
    private COLOR color;

    public Light(COLOR color) {
        this.color = color;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    // toString
    @Override
    public String toString() {
        return "Light{" +
                "isOn=" + isOn +
                ", color=" + color +
                '}';
    }
}
