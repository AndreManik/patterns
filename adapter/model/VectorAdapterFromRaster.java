package patternsP.adapter.model;

//реализация через наследование
public class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface {
    public void drawLine() {drawRasterLine();}
    public void drawSquare() {drawRasterSquare();}
}