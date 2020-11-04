package pl.imiajd.ged;

import java.awt.*;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x,int y,int w,int h)
    {
        super(w,h);
//        setLocation(x,y);
//        setSize(w,h);

    }
    double getPerimeter()
    {
//        return(2*(this.width)+2*(this.height));
        return(2*super.width+2*super.height);

    }
    double GetArea()
    {
        return (super.width*super.height);
//        return(this.width*this.height);

    }
}
