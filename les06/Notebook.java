package les06;

public class Notebook {
    private Integer ramVolume;
    private int storageVolume;
    private String OSver;
    private String color;
    private String brend;
    private String cpu;
    private double displaySize;

    Notebook() {
    }
    public Notebook(Integer ramVolume, Integer storageVolume, String OSver, String color, String brend, String cpu, double displaySize) {
        this.ramVolume = ramVolume;
        this.storageVolume = storageVolume;
        this.OSver = OSver;
        this.color = color;
        this.brend = brend;
        this.cpu = cpu;
        this.displaySize = displaySize;
    }

    public Integer getramVolume() {
        return ramVolume;
    }

    public void setramVolume(Integer ramVolume) {
        this.ramVolume = ramVolume;
    }

    public int getstorageVolume() {
        return storageVolume;
    }

    public void setstorageVolume(int storageVolume) {
        this.storageVolume = storageVolume;
    }

    public String getOSver() {
        return OSver;
    }

    public void setOSver(String OSver) {
        this.OSver = OSver;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getCPU() {
        return cpu;
    }

    public void setCPU(String brend) {
        this.cpu = cpu;
    }

    public double getdisplaySize() {
        return displaySize;
    }

    public void setdisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

     public String toString(){
        StringBuilder sb_nb = new StringBuilder();
        sb_nb.append("Ноутбук от ");
        sb_nb.append(this.brend);
        sb_nb.append(" с характеристиками:");
        sb_nb.append(" Объем оперативной памяти: ");
        sb_nb.append(this.ramVolume);
        sb_nb.append(" Гб");
        sb_nb.append(", Объем хранилища: ");
        sb_nb.append(this.storageVolume);
        sb_nb.append(" Гб");
        sb_nb.append(", ОС: ");
        sb_nb.append(this.OSver);
        sb_nb.append(", Цвет корпуса: ");
        sb_nb.append(this.color);
        sb_nb.append(", Процессор: ");
        sb_nb.append(this.cpu);
        sb_nb.append(", Диагональ дисплея: ");
        sb_nb.append(this.displaySize);
        sb_nb.append('"');
        sb_nb.append(System.lineSeparator());
        return sb_nb.toString();

    }
}