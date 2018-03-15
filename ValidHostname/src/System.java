public class System {

    private String name;
    private Cluster mCluster;
    //PART 1
    public System(String name){
        String regex = "^[a-zA-Z][\\w]+$";
        if(name.matches(regex)) {
            this.name = name;
            java.lang.System.out.println("Created hostname successfully");
            return;
        }
        java.lang.System.out.println("Creation of hostname failed");
        this.name = "INVALID";
    }

    @Override
    public String toString() {
        return name;
    }

    //PART 4
    public void setCluster(Cluster cluster){
        this.mCluster = cluster;
    }

    //PART 4
    public void unSetCluster(){
        this.mCluster = null;
    }
}
