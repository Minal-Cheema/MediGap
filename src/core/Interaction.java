package core;
public class Interaction{
    private Drug drug1;
    private Drug drug2;
    private int severity;
    private String description;
    
    public Interaction(Drug drug1, Drug drug2, int severity, String description){
        this.drug1 = drug1;
        this.drug2 = drug2;
        this.severity = severity;
        this.description = description;
    }
    public Drug getDrug1(){
    return drug1;
    }
    public Drug getDrug2(){
        return drug2;
    }
    public int getSeverity(){
        return severity;
    }
    public String getDescription(){
        return description;
    }
    public String toString(){
        return drug1.getGenericName() + " + " + drug2.getGenericName() + " + " + " | Severity: " + severity + " / 10 " + " | " + description; 
    }
}
