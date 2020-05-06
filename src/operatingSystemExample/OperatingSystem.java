package operatingSystemExample;

import java.util.Date;

public class OperatingSystem {

    private int backupNumber = 0;
    private Date backupData;

    public void createBackup() {
        this.backupNumber++;
        this.backupData = new Date();
        System.out.println("Utworzono backup nr: " + this.backupNumber + " z data: " + this.backupData);
    }

    public OperatingSystemMemento save() {
        System.out.println("Zapisano backup nr: " + backupNumber + " z data: " + backupData);
        return new OperatingSystemMemento(this.backupNumber, this.backupData);
    }

    public void load (OperatingSystemMemento operatingSystemMemento) {
        this.backupNumber = operatingSystemMemento.getBackupNumber();
        this.backupData = operatingSystemMemento.getBackupData();
        System.out.println("Wczytano backup nr: " + backupNumber + " z data: " + backupData);
    }
}
