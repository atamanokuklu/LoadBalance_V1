public class Request {

    private IpPool ipPool;
    private int variant;

    public Request(IpPool ipPool, int variant){

    }

    public int getVariant(){
        return variant;
    }

    public IpPool getIpPool() {
        return ipPool;
    }
}
