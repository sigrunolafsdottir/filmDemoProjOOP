package sprint1.Interface;

public interface Vara {

    int moms = 25;

    public int getPrice();

    public void setPrice(int price);

    default int getMoms(){
        return moms;
    }
}
