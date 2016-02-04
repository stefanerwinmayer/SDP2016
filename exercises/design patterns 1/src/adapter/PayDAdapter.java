package adapter;

/**
 * Created by stefanm on 04/02/2016.
 */
public class PayDAdapter implements PayD {
    Xpay adaptee;

    public PayDAdapter(Xpay adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String getCustCardNo() {
        return adaptee.getCreditCardNo();
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        adaptee.setCreditCardNo(custCardNo);
    }

    @Override
    public String getCardOwnerName() {
        return adaptee.getCustomerName();
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        adaptee.setCustomerName(cardOwnerName);
    }

    @Override
    public String getCardExpMonthDate() {
        return adaptee.getCardExpMonth();
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        adaptee.setCardExpMonth(cardExpMonthDate);
    }

    @Override
    public Integer getCVVNo() {
        return (int)adaptee.getCardCVVNo();
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        adaptee.setCardCVVNo(cVVNo.shortValue());
    }

    @Override
    public Double getTotalAmount() {
        return adaptee.getAmount();
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        adaptee.setAmount(totalAmount);
    }

}
