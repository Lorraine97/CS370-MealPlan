package emory.mealplan;

public class poi {
    String name;
    double X;
    double Y;

    public poi (double X, double Y, String name) {
        this.name = name;
        this.X = X;
        this.Y = Y;
    }

    public poi (){

    }

    void setX (int x) {
        X = x;
    }

    void setPoiName (String n) {
        name = n;
    }

    void setY (int y) {
        Y = y;
    }

    double getX () {
        return X;
    }

    double getY () {
        return Y;
    }

    String getPoiName() {
        return name;
    }

}
