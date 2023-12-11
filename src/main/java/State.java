import java.util.Objects;

public class State {
    private int numberofmissionariesLeft;
    private int numberofmissionariesRight;
    private  int numberofcannibalsLeft;
    private int numberofcannibalsRight;
    private  BoatStatus boatStatus;


    public State(int numberofmissionariesLeft, int numberofmissionariesRight, int numberofcannibalsLeft, int numberofcannibalsRight, BoatStatus boatStatus) {
        this.numberofmissionariesLeft = numberofmissionariesLeft;
        this.numberofmissionariesRight = numberofmissionariesRight;
        this.numberofcannibalsLeft = numberofcannibalsLeft;
        this.numberofcannibalsRight = numberofcannibalsRight;
        this.boatStatus = boatStatus;
    }

    public int getNumberofmissionariesLeft() {
        return numberofmissionariesLeft;
    }

    public void setNumberofmissionariesLeft(int numberofmissionariesLeft) {
        this.numberofmissionariesLeft = numberofmissionariesLeft;
    }

    public int getNumberofmissionariesRight() {
        return numberofmissionariesRight;
    }

    public void setNumberofmissionariesRight(int numberofmissionariesRight) {
        this.numberofmissionariesRight = numberofmissionariesRight;
    }

    public int getNumberofcannibalsLeft() {
        return numberofcannibalsLeft;
    }

    public void setNumberofcannibalsLeft(int numberofcannibalsLeft) {
        this.numberofcannibalsLeft = numberofcannibalsLeft;
    }

    public int getNumberofcannibalsRight() {
        return numberofcannibalsRight;
    }

    public void setNumberofcannibalsRight(int numberofcannibalsRight) {
        this.numberofcannibalsRight = numberofcannibalsRight;
    }

    public BoatStatus getBoatStatus() {
        return boatStatus;
    }

    public void setBoatStatus(BoatStatus boatStatus) {
        this.boatStatus = boatStatus;
    }

    public boolean isvalid(){

        int total = numberofmissionariesLeft + numberofmissionariesRight + numberofcannibalsLeft +numberofcannibalsRight ;
        int totalLeft = numberofmissionariesLeft+ numberofcannibalsLeft;
        int totalRight = numberofmissionariesRight + numberofcannibalsRight ;
        if (total <= 6) {
            return true;
        }

        if ((numberofmissionariesLeft >= 0 && numberofmissionariesLeft<= 3 && numberofmissionariesRight >= 0 && numberofmissionariesRight <= 3)) {
            return true;
        }

        if ((numberofmissionariesLeft == 0 || numberofmissionariesLeft >= numberofcannibalsLeft)) {
            return true;
        }

        if ((numberofmissionariesRight == 0 || numberofmissionariesRight >= numberofcannibalsRight)) {
            return true;
        }

        if (((boatStatus ==BoatStatus.Left && totalLeft > 0) || (boatStatus == BoatStatus.Right && totalRight > 0))) {
            return true;
        }

        return false;
    }
    public boolean isGoal() {
        if (numberofmissionariesLeft != 0&& numberofcannibalsLeft != 0&& numberofmissionariesRight != 3 && numberofcannibalsRight != 3 && boatStatus != BoatStatus.Right) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof State)) {
            return false;
        }

        State otherState = (State) object;

        if (numberofmissionariesRight != otherState.getNumberofmissionariesLeft()) {
            return false;
        }

        if (numberofcannibalsLeft  != otherState.getNumberofcannibalsLeft()) {
            return false;
        }

        if (numberofmissionariesRight!= otherState.numberofmissionariesRight) {
            return false;
        }

        if (numberofcannibalsLeft!= otherState.getNumberofcannibalsRight()) {
            return false;
        }

        if (!Objects.equals(boatStatus, otherState.getBoatStatus())) {
            return false;
        }

        return true;
    }

}
