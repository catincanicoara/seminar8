package Observer;

public class CarOS implements OS{
    private String lastUpdate;
    @Override
    public void update(String update) {
        if(!this.lastUpdate.equals(update)){
            this.lastUpdate = update;
        }
    }
    public void printLastUpdate(){
        System.out.println(lastUpdate);
    }

    //-lastUpdate : String
    //+update()
    //+printLastUpdate()
}
