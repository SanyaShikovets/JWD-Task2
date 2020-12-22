package by.epam.task01.entity;

import java.util.Objects;

public class TabletPC extends Appliance{
    private Integer batteryCapacity;
    private Integer displayInches;
    private Integer memoryRom;
    private Integer flashMemoryCapacity;
    private Color color;
    private enum Color{
        RED,
        BLUE,
        GREEN
    }

    public TabletPC(Integer batteryCapacity, Integer displayInches, Integer memoryRom, Integer flashMemoryCapacity,
                    String color){
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        switch(color){
            case ("blue"):
                this.color = Color.BLUE;
                break;
            case ("red"):
                this.color = Color.RED;
                break;
            case ("green"):
                this.color = Color.GREEN;
                break;
        }
    }

    public Integer getMemoryRom() {
        return memoryRom;
    }

    public Integer getDisplayInches() {
        return displayInches;
    }

    public Color getColor() {
        return color;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public Integer getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setMemoryRom(Integer memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setDisplayInches(Integer displayInches) {
        this.displayInches = displayInches;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setFlashMemoryCapacity(Integer flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Objects.equals(batteryCapacity, tabletPC.batteryCapacity) &&
                Objects.equals(displayInches, tabletPC.displayInches) &&
                Objects.equals(memoryRom, tabletPC.memoryRom) &&
                Objects.equals(flashMemoryCapacity, tabletPC.flashMemoryCapacity) &&
                color == tabletPC.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color=" + color +
                '}';
    }
}
