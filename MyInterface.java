public interface MyInterface
{
     //MyInterface for GameParlour//
       
     public void addNewObj(String gameStation,String videoGame,int hourlyRate);
       
     public void removeObj(int index);
       
     public void reserveGameStation(int index,String customerName,String customerType,String bookingDate,int duration);

     public void makeStationFree(int index);
       
     public void listStation();
       
     public void findList(String search,int maxHourlyRate);
    
     public void sort();
    }    
    
    

