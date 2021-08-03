public class Galaxy extends Phone implements Ringable{
    public Galaxy(String versionNumber, int powerPercentage, String carrier, String ringTone){
        super(versionNumber,powerPercentage,carrier,ringTone);
        this.versionNumber = versionNumber;
        this.powerPercentage = powerPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }

    @Override
    public String ring() {
        return ringTone + ". Galaxy " + versionNumber + " is getting a call";
    }
    
    @Override
    public String unlock() {
        return "Unlocking Galaxy " + versionNumber + " via finger print";
    }

    @Override
    public void displayInfo() {
            System.out.println("Galaxy " + versionNumber + " from " + carrier+"\n" +
                "Current power:" + powerPercentage + "\n" +
                "Current ringtone:" + ringTone
            );   
    }
}
