public class AtomController {
    private int inputNumbersOfAtoms(String mess){
        return InputValid.inputInt(mess, 0);
    }
    private Atom inputAtom(){
        int number = InputValid.inputInt("Input number: ", 0);
        String sysbol = InputValid.inputString("Input symbol: ", "[0-9a-zA-Z ]+", "Just contain characters or number");
        String fullname = InputValid.inputString("Input weight: ", "[a-zA-Z ]+", "Just contain characters");
        Double weight = InputValid.inputDouble("Input weight: ", 0, 100);
        return new Atom(number, sysbol, fullname, weight);
    }



    private Atom[] inputInformationAtoms(int size){
        Atom[] m = new Atom[size];
        for (int i = 0; i<size; i++){
            m[i] = inputAtom();
        }
        return m;
    }
    private void displayInformationAtoms(int size){
        Atom[] atoms = inputInformationAtoms(size);
        System.out.format("%10s| %20s| %30s|\n", "Structure", "Name", "Weight");

        for (Atom a: atoms) {
            a.display();
        }
    }

    public void executeMolecule(){
        System.out.println("-----------     Q3.2     --------------");
        int size = inputNumbersOfAtoms("Input number of Atoms:");
        displayInformationAtoms(size);
    }

}
