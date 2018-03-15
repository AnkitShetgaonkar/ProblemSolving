
import java.util.ArrayList;
import java.util.List;

//PART 2
public class Cluster {

    private String name;
    private String regex = "^[a-zA-Z][\\w]+$";
    private List<System> mSystemList  = new ArrayList<>();
    private static int SYSTEM_COUNT = 5;

    public Cluster(String name) {
        if(name.matches(regex)) {
            this.name = name;
            java.lang.System.out.println("Created hostname successfully");
            return;
        }
        java.lang.System.out.println("Creation of hostname failed");
        this.name = "INVALID";
    }

    //PART 3
    public boolean addSystem(System system){
        if(mSystemList.size()<SYSTEM_COUNT){
            mSystemList.add(system);
            java.lang.System.out.println("Added successfully");
            return true;
        }
        java.lang.System.out.println("Crossed limit of "+SYSTEM_COUNT+
                " systems for this cluster cloud not add "+system.toString());
        return false;
    }
    //PART 3
    public void removeSystem(System system){
        system.unSetCluster();
        mSystemList.remove(system);
    }
}
