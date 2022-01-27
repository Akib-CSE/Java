package blood_donation;

public class Blood_Info {
    private String bloodGroup;
    private String lastDate;
    private int totalDonate;

    public Blood_Info(String bloodGroup, String lastDate, int totalDonate) {
        this.bloodGroup = bloodGroup;
        this.lastDate = lastDate;
        this.totalDonate = totalDonate;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public int getTotalDonate() {
        return totalDonate;
    }

    public void setTotalDonate(int totalDonate) {
        this.totalDonate = totalDonate;
    }

    @Override
    public String toString() {
        return "Blood_Info{" + "bloodGroup=" + bloodGroup + ", lastDate=" + lastDate + ", totalDonate=" + totalDonate + '}';
    }
    
    
}
