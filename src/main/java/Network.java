import java.util.*;

public class Network {
    private String name;
    private ArrayList<IConnect> devices;

    public Network(String name){
        this.devices = new ArrayList<IConnect>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

    public void connect(IConnect device){
        if (numberOfConnectionsRemaining() > 0) {
            devices.add(device);
        }
    }

    public void disconnectAll(){
        devices.clear();
    }

    public int numberOfConnectionsRemaining() {
        return (5 - devices.size());
    }

}