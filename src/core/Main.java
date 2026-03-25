package core;

public class Main {

    public static void main(String[] args) {

        DrugGraph graph = new DrugGraph();

        Drug paracetamol = new Drug("Paracetamol", "Panadol", "Analgesic");
        Drug aspirin = new Drug("Aspirin", "Disprin", "Blood Thinner");
        Drug ibuprofen = new Drug("Ibuprofen", "Brufen", "NSAID");
        Drug warfarin = new Drug("Warfarin", "Coumadin", "Anticoagulant");

        graph.addDrug(paracetamol);
        graph.addDrug(aspirin);
        graph.addDrug(ibuprofen);
        graph.addDrug(warfarin);

        graph.addInteraction(aspirin, ibuprofen, 7,
            "Combined use increases risk of gastrointestinal bleeding");
        graph.addInteraction(aspirin, warfarin, 9,
            "Severe bleeding risk - avoid combination");
        graph.addInteraction(ibuprofen, warfarin, 8,
            "Ibuprofen increases Warfarin effect causing dangerous bleeding");

        graph.printAllDrugs();

        System.out.println("\nInteractions for Aspirin:");
        System.out.println("-------------------------");
        for (Interaction i : graph.getInteractions("Aspirin")) {
            System.out.println(i);
        }
    }
}