package Encapsulation;

class Account {
    private long acc_No;
    private String name, email;
    private float amount;

    public long getAcc_No(){
        return acc_No;
    }
    public void setAcc_No(long acc_No){
        this.acc_No=acc_No;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public float getAmount(){
        return amount;
    }
    public void setAmount(float amount){
        this.amount=amount;
    }
}
