public class InternetRadio implements IConnect {

    public String connect(String data) {
        return "connecting to network: " + data;
    }

    public String tune() {
        return "Radio Six";
    }

}
