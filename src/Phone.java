public abstract class Phone {
    protected String versionNumber;
    protected int powerPercentage;
    protected String carrier;
    protected String ringTone;
    public Phone(String versionNumber, int powerPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.powerPercentage = powerPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
  
    public abstract void displayInfo();

}
