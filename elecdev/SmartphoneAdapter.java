package elecdev;

public class SmartphoneAdapter implements PowerOutlet {
    private final Smartphone smartphone;

    public SmartphoneAdapter(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public void plugIn() {
        smartphone.chargePhone();
    }
}