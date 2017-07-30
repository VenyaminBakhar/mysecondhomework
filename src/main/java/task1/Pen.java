package task1;




/**
 * @author Veniamin
 */

public class Pen {
    private double kernelDiametr;

    private double penDiametr;

    private double penHigh;

    private boolean isWrite;

    private String penColor;

    private String kernelColor;

    public Pen(double kernelDiametr,double penDiametr,double penHigh,boolean isWrite,String penColor,String kernelColor){
        this.kernelDiametr = kernelDiametr;
        this.penDiametr = penDiametr;
        this.penHigh = penHigh;
        this.isWrite = isWrite;
        this.penColor = penColor;
        this.kernelColor = kernelColor;
    }


    public boolean write(String s) {
        if (isWrite()) {
            System.out.println(s);
            return true;
        }
        else System.out.println("В ручке нет стержня");
        return false;
    }

    public double getKernelDiametr() {
        return kernelDiametr;
    }

    public void setKernelDiametr(double kernelDiametr) {
        this.kernelDiametr = kernelDiametr;
    }

    public double getPenDiametr() {
        return penDiametr;
    }

    public void setPenDiametr(double penDiametr) {
        this.penDiametr = penDiametr;
    }

    public double getPenHigh() {
        return penHigh;
    }

    public void setPenHigh(double penHigh) {
        this.penHigh = penHigh;
    }

    public boolean isWrite() {
        return isWrite;
    }

    public void setWrite(boolean write) {
        isWrite = write;
    }

    public String getPenColor() {
        return penColor;
    }

    public void setPenColor(String penColor) {
        this.penColor = penColor;
    }

    public String getKernelColor() {
        return kernelColor;
    }

    public void setKernelColor(String kernelColor) {
        this.kernelColor = kernelColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (Double.compare(pen.kernelDiametr, kernelDiametr) != 0) return false;
        if (Double.compare(pen.penDiametr, penDiametr) != 0) return false;
        if (Double.compare(pen.penHigh, penHigh) != 0) return false;
        if (isWrite != pen.isWrite) return false;
        if (penColor != null ? !penColor.equals(pen.penColor) : pen.penColor != null) return false;
        return kernelColor != null ? kernelColor.equals(pen.kernelColor) : pen.kernelColor == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(kernelDiametr);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(penDiametr);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(penHigh);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isWrite ? 1 : 0);
        result = 31 * result + (penColor != null ? penColor.hashCode() : 0);
        result = 31 * result + (kernelColor != null ? kernelColor.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Pen{" +
                "kernelDiametr=" + kernelDiametr +
                ", penDiametr=" + penDiametr +
                ", penHigh=" + penHigh +
                ", isWrite=" + isWrite +
                ", penColor='" + penColor + '\'' +
                ", kernelColor='" + kernelColor + '\'' +
                '}';
    }
}
