public class MoleculeController {
    private int inputNumbersOfMolecules(String mess){
        return InputValid.inputInt(mess, 0);
    }
    private Molecule inputMolecule(){
        String structure = InputValid.inputString("Input structure: ", "[0-9a-zA-Z ]+", "Just contain characters or number");
        String name = InputValid.inputString("Input name: ", "[0-9a-zA-Z ]+", "Just contain characters or number");
        Double weight = InputValid.inputDouble("Input weight: ", 0, 100);

        return new Molecule(structure, name, weight);
    }



    private Molecule[] inputInformationMolecules(int size){
        Molecule[] m = new Molecule[size];
        for (int i = 0; i<size; i++){
           m[i] = inputMolecule();
        }
        return m;
    }
    private void displayInformationMolecules(int size){
        Molecule[] molecules = inputInformationMolecules(size);
        System.out.format("%10s| %20s| %30s|\n", "Structure", "Name", "Weight");

        for (Molecule m: molecules) {
            m.display();
        }
    }

    public void executeMolecule(){
        System.out.println("-----------     Q3.1     --------------");
        int size = inputNumbersOfMolecules("Input number of Molecules:");
        displayInformationMolecules(size);
    }

}
