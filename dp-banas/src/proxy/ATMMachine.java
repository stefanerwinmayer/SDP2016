package proxy;

public class ATMMachine implements GetATMData {
    // Adding these fields to avoid compile errors

    private ATMState hasCard;
    private ATMState noCard;
    private ATMState hasCorrectPin;
    private ATMState atmOutOfMoney;
    private ATMState atmState;
    private int cashInMachine;

    public ATMState getYesCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasPin() {
        return hasCorrectPin;
    }

    public ATMState getNoCashState() {
        return atmOutOfMoney;
    }

    // NEW STUFF

    public ATMState getATMState() {
        return atmState;
    }

    public int getCashInMachine() {
        return cashInMachine;
    }
}