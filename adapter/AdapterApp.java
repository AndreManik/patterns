package patternsP.adapter;

import patternsP.adapter.model.RasterGraphics;
import patternsP.adapter.model.VectorAdapterFromRaster;
import patternsP.adapter.model.VectorAdapterFromRaster2;
import patternsP.adapter.model.VectorGraphicsInterface;

public class AdapterApp {
    public static void main(String[] args) {
        //1 type extends realisation
        VectorGraphicsInterface vectorGraphicsInterface = new VectorAdapterFromRaster();
        vectorGraphicsInterface.drawLine();
        vectorGraphicsInterface.drawSquare();

        //2 composing
        VectorGraphicsInterface vectorGraphicsInterface1 = new VectorAdapterFromRaster2(new RasterGraphics());
        vectorGraphicsInterface1.drawLine();
        vectorGraphicsInterface1.drawSquare();
    }
}
