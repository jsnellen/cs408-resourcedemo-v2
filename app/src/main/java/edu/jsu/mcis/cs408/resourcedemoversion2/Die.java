package edu.jsu.mcis.cs408.resourcedemoversion2;

public class Die {

    public enum DieValue {

        ACE, DEUCE, TREY, CATER, CINQUE, SICE;
        private static DieValue[] vals = values();

        public int getLevel() {
            return (this.ordinal() + 1);
        }

        public DieValue next() {
            return vals[(this.ordinal() + 1) % vals.length];
        }

    };

    private DieValue value;

    public Die() {
        this.value = DieValue.ACE;
    }

    public void next() {
        value = value.next();
    }

    public DieValue getValue() { return value; }

}