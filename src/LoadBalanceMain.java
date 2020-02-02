public class LoadBalanceMain {
    public static void main(String[] args) {
        loadBalance();
    }

    public static void loadBalance() {
        IpPool ipPool = new IpPool();
        //Demo of first variant
//        doGetServer(new LoadBalancer(ipPool, 1));
        //Demo of second variant
        doGetServer(new LoadBalancer(ipPool, 2));
    }


    public static void doGetServer(LoadBalancer loadBalancer) {
        if(loadBalancer.getServerList().size() > 0){
            doGetServer(loadBalancer, loadBalancer.getServerList().size());
        }
        else{
            doGetServer(loadBalancer, 1);
        }
    }

    private static void doGetServer(LoadBalancer loadBalancer, int queryTimes) {
        if(queryTimes > 1){
            for (int i = 0; i < queryTimes; i++) {
                    String serverId = loadBalancer.getServerList().get(i);
                    System.out.println(String.format("[%s] index:%s,%s", loadBalancer.getClass().getSimpleName(), i, serverId));
                }
        }
        else{
            String serverId = loadBalancer.getSingleServer();
            System.out.println(String.format("[%s] index:%s,%s", loadBalancer.getClass().getSimpleName(), 1, serverId));
        }
    }
}