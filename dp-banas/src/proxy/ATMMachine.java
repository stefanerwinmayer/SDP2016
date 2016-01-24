package proxy;

public class ATMMachine implements GetATMData {


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