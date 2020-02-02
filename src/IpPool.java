import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class IpPool {
    public static Map<String, Float> ipMap = new ConcurrentHashMap<>();

    static {
        ipMap.put("192.168.1.1", 0.80f);
        ipMap.put("192.168.1.2", 0.80f);
        ipMap.put("192.168.1.3", 0.85f);
        ipMap.put("192.168.1.4", 0.83f);
        ipMap.put("192.168.1.5", 0.84f);
        ipMap.put("192.168.1.6", 0.90f);
        ipMap.put("192.168.1.7", 0.79f);
        ipMap.put("192.168.1.8", 0.78f);
        ipMap.put("192.168.1.9", 0.92f);
        ipMap.put("192.168.1.10", 0.83f);
    }

}

