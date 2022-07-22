public class Programmer {
    protected int numProgrammer;

    public Programmer() {
        numProgrammer = 1;
        employ();
    }

    public Programmer(int numProgrammer) {
        this.numProgrammer = numProgrammer;
        employ();
    }

    protected void employ() {
        System.out.println(numProgrammer + " programmer");
    }
}