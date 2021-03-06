package patternsP.abstractFactory;

public class AbstractFactoryApp {

    public static void main(String[] args) {
        DeviceFactory factory = getFactoryByCountryCode("RU");
        Mouse mouse = factory.getMouse();
        Keyboard keyboard = factory.getKeyboard();
        Touchpad touchpad = factory.getTouchpad();

        mouse.click();
        keyboard.print();
        touchpad.track(34, 23);
    }

    private static DeviceFactory getFactoryByCountryCode(String lang) {
        switch (lang) {
            case "RU":
                return new RuDeviceFactory();
            case "EN":
                return new EnDeviceFactory();
                default:
                    throw new RuntimeException("Unsupported country code: " + lang);
        }
    }
}

interface Mouse {
    void click();
    void dblclick();
    void scroll(int direction);
}

interface Keyboard {
    void print();
    void println();
}

interface Touchpad {
    void track(int deltaX, int deltaY);
}

interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}

class RuMouse implements Mouse {
    @Override
    public void click() {System.out.println("Щелчек мышью");}
    @Override
    public void dblclick() {System.out.println("Двойной щелчек мышью");}
    @Override
    public void scroll(int direction) {
        if (direction < 0) {System.out.println("Скроллим вверх");}
        else if (direction > 0) {System.out.println("Скроллим вниз");}
        else {System.out.println("Не скроллим");}
    }
}

class RuKeyboard implements Keyboard {
    @Override
    public void print() {System.out.println("Печатаем строку");}
    @Override
    public void println() {System.out.println("Печатаем строку с переводом строки");}
}

class RuTouchPad implements Touchpad {
    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("Передвинулись на " + s + " пикселей");
    }
}

class EnMouse implements Mouse {
    @Override
    public void click() {System.out.println("Mouse click");}
    @Override
    public void dblclick() {System.out.println("Mouse double click");}
    @Override
    public void scroll(int direction) {
        if (direction < 0) {System.out.println("Up scroll");}
        else if (direction > 0) {System.out.println("Down scroll");}
        else {System.out.println("Dont scroll");}
    }
}

class EnKeyboard implements Keyboard {
    @Override
    public void print() {System.out.println("Print");}
    @Override
    public void println() {System.out.println("Print Line");}
}

class EnTouchPad implements Touchpad {
    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("Move on " + s + " pixels");
    }
}

class EnDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {return new EnMouse();}
    @Override
    public Keyboard getKeyboard() {return new EnKeyboard();}
    @Override
    public Touchpad getTouchpad() {return new EnTouchPad();}
}

class RuDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {return new RuMouse();}
    @Override
    public Keyboard getKeyboard() {return new RuKeyboard();}
    @Override
    public Touchpad getTouchpad() {return new RuTouchPad();}
}