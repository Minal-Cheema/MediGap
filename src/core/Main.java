package core;

public class Main {

    public static void main(String[] args) {

        DrugGraph graph = new DrugGraph();

        DrugLoader.load("drugs.csv", graph);

        graph.printAllDrugs();

        }
    }
