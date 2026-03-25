package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DrugGraph {
    private Map<String, Drug> drugs;
    private Map<String, List<Interaction>> adjacencyList;
    public DrugGraph(){
         drugs = new HashMap<>();
         adjacencyList = new HashMap<>();
    }
    public void addDrug(Drug drug){
        drugs.put(drug.getGenericName().toLowerCase(), drug);
        adjacencyList.put(drug.getGenericName().toLowerCase(), new ArrayList<>());
    }
    public void addInteraction(Drug drug1, Drug drug2,int severity, String description){
        Interaction interaction = new Interaction(drug1, drug2, severity, description);
        adjacencyList.get(drug1.getGenericName().toLowerCase()).add(interaction);
        adjacencyList.get(drug2.getGenericName().toLowerCase()).add(interaction);
    }
     public List<Interaction> getInteractions(String drugName) {
        return adjacencyList.getOrDefault(drugName.toLowerCase(), new ArrayList<>());
    }
     public Drug getDrug(String genericName) {
        return drugs.get(genericName.toLowerCase());
    }
    public void printAllDrugs() {
        System.out.println("\nRegistered Drugs:");
        System.out.println("-----------------");
        for (Drug drug : drugs.values()) {
            System.out.println(drug);
        }
    }
}
