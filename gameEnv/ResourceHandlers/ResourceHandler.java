package gameEnv.ResourceHandlers;

import java.util.ArrayList;

public class ResourceHandler {
    private ArrayList<ResourceAmount> resources;

    public ResourceHandler() {
        resources = new ArrayList<>();
    }

    public void harvest() { 
        for(ResourceAmount r : resources) {
            if(r!=null) System.out.println(r);
        }
    }

    public void addResource(double a, Resource r) {
        resources.add(new ResourceAmount(a, r));
    }




    public class ResourceAmount {
        private double amount;
        private Resource resource;

        public ResourceAmount(double a, Resource r) {
            amount = a;
            resource = r;
        }

        public void harvest() {

        }

        public String toString() {
            return resource + " for " + amount;
        }
    }
}
