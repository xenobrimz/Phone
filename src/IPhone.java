public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        return ringTone + ". IPhone " + versionNumber + " is getting a call";
    }
    
    @Override
    public String unlock() {
        return "Unlocking IPhone " + versionNumber + " via finger print";
    }

    @Override
    public void displayInfo() {
            System.out.println("IPhone " + versionNumber + " from " + carrier+"\n" +
                "Current power:" + powerPercentage + "\n" +
                "Current ringtone:" + ringTone
            );   
    }
}