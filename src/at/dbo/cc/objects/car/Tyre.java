package at.dbo.cc.objects.car;

import java.util.Random;

public class Tyre {

    public enum TYPE {WINTER, SUMMER}
    private TYPE type;
    private int tyreWidth;
    private int inches;
    private int usage;

    public Tyre (TYPE type, int tyreWidth, int inches) {
        this.type = type;
        this.tyreWidth = tyreWidth;
        this.inches = inches;
        this.usage  = new Random().nextInt(80 - 20)+40;
    }

    public int getUsage() {
        return usage;
    }
}
