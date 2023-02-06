public class RlVariable {
    public static void main(String[] args) {
        RLVariables secret = new RLVariables();
        secret.displaySecret();
    }
}
class RLVariables {
    private int mySecretNumber = 10;

    public int getMySecretNumber() {
        return mySecretNumber;
    }

    public void setMySecretNumber(int mySecretNumber) {
        this.mySecretNumber = mySecretNumber;
    }

    public void displaySecret() {
        this.mySecretNumber = 45;
        System.out.println("Local Variable: "+mySecretNumber);
    }


}