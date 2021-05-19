package at.dbo.cc.objects.car;

public class RearMirror {

    private int size;
    private int position; // 0 = standard, -10 = links-Pos., +10 = rechts-Pos.

    public RearMirror(int size, int position) {
        this.size = size;
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "RearMirror{" +
                "size=" + size +
                ", position=" + position +
                '}';
    }
}
