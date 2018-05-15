package patternsP.adapter.model;

//реализация адаптера через композицию
public class VectorAdapterFromRaster2 implements VectorGraphicsInterface {
    private RasterGraphics rasterGraphics;

    public VectorAdapterFromRaster2(RasterGraphics rasterGraphics) {
        this.rasterGraphics = rasterGraphics;
    }
    public void drawLine() {rasterGraphics.drawRasterLine();}
    public void drawSquare() {rasterGraphics.drawRasterSquare();}
}