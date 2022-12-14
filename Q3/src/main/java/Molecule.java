
public class Molecule {
    private String structure;
    private String name;
    private double weight;

    public Molecule() {
    }

    public Molecule(String structure, String name, double weight) {
        this.structure = structure;
        this.name = name;
        this.weight = weight;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void display(){
        System.out.format("%10s| %20s| %30.2f|\n", this.structure, this.name, this.weight);
    }
}
