package operatingSystemExample;

import java.util.Date;

public class OperatingSystemMemento {

    private int backupNumber;
    private Date backupData;

    public OperatingSystemMemento(int backupNumber, Date backupData) {
        this.backupNumber = backupNumber;
        this.backupData = backupData;
    }

    public int getBackupNumber() {
        return backupNumber;
    }

    public Date getBackupData() {
        return backupData;
    }
}
