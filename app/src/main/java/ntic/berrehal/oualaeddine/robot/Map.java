package ntic.berrehal.oualaeddine.robot;

/**
 * Created by berre on 11/16/2016.
 */
public class Map {
    private int Xrange,Yrange;

    public Map(int xrange, int yrange) {
        Xrange = xrange;
        Yrange = yrange;
    }

    public int getYrange() {
        return Yrange;
    }

    public void setYrange(int yrange) {
        Yrange = yrange;
    }

    public int getXrange() {
        return Xrange;
    }

    public void setXrange(int xrange) {
        Xrange = xrange;
    }
}
