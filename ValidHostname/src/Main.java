import java.util.ArrayList;
import java.util.List;

public class Main {

    //PART 5
    private void deploy(List<System> systems, List<Cluster> clusters) {
        clusters.get(0).addSystem(systems.get(0));
        clusters.get(0).addSystem(systems.get(1));
        clusters.get(0).addSystem(systems.get(2));
        clusters.get(0).addSystem(systems.get(3));
        clusters.get(0).addSystem(systems.get(4));
        clusters.get(0).addSystem(systems.get(5));
        //you can try out more test cases
    }

    public static void main(String[] args) {
        java.lang.System.out.println("Hello World!");
        System hostName = new System("goo24213");
        java.lang.System.out.println("Hostname: " + hostName.toString());
        List<System> systems = new ArrayList<>();
        systems.add(new System("goo1"));
        systems.add(new System("goo2"));
        systems.add(new System("goo3"));
        systems.add(new System("goo4"));
        systems.add(new System("goo5"));
        systems.add(new System("goo6"));
        List<Cluster> clusters = new ArrayList<>();
        clusters.add(new Cluster("google0"));
        clusters.add(new Cluster("google1"));
        clusters.add(new Cluster("google2"));
        clusters.add(new Cluster("google3"));
        Main main = new Main();
        main.deploy(systems, clusters);
    }

}
