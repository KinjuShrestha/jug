    //Answer of Question number 8//
     import java.util.List; 
     import java.util.ArrayList;
     import java.util.Collections;
     import java.util.Comparator;
     public class GameParlour implements MyInterface {
           //Creating ArrayList for object of videoGameStation class//
            ArrayList<VideoGameStation> ab=new ArrayList<>();
            
           //Answer of Question number 9//
           //Method to add new object//
         public void addNewObj(String gameStation,String videoGame,int hourlyRate)
         {
             this.ab.add(new VideoGameStation(gameStation,videoGame,hourlyRate));
            
        }
         //Answer of Question number 10//
         //Method to remove Object//
        public void removeObj(int index)
        {
             if(index<ab.size()){
              ab.remove(index);
            
             }
            else{
            
              System.out.println("Index number is not found.");
             }
         }
         //Answer of question number 11//
         //Method to get gamestation and reserve gamestation//
        public void reserveGameStation(int index,String customerName,String customerType,String bookingDate,int duration)
        {
            if(index<ab.size()){
                VideoGameStation var=ab.get(index);
                var.booking(customerName,customerType,bookingDate,duration);
                ab.set(index,var);
               }
            else{
               System.out.println("The index number is not valid");
        }
         }
         //Answer of question number 12//
         //Method to get gamestation and make game station free//
        @Override
         public void makeStationFree(int index)
         {
           if(index<ab.size()){
                 for(int i=0;i<ab.size();i++){
                     VideoGameStation temp=ab.get(index);
                     temp.status();
                     ab.set(index,temp);
                
                }
            }
            else{
                 System.out.println("The index number is not valid");
            }
         }
        //Answer of Question number 13//
        //Method to list available game station//
        @Override
        public void listStation()
        {
            for(int i=0;i<ab.size();i++){
                if(ab.get(i).availableStatus==true){
                    System.out.println("Index number is:"+i);
                    
                    ab.get(i).showResult();
               
                }
            }    
        }    
        
        //Answer of Question number 14//
        //method to find//
        public void findList(String find,int maxRate)
        {
            for(int i=0;i<ab.size();i++){
                    if(ab.get(i).availableStatus==true && ab.get(i).getgameStation().contains(find) && 
                    ab.get(i).gethourlyRate()<=maxRate){
                    System.out.println("Index number is:"+i);
                    ab.get(i).showResult();
                }
                else{
                    System.out.println("Invalid search");
                }
            }
        }    
        
        
        
        //Answer of question number 15//
        //method to sort characters//
        @Override
        public void sort(){
            Collections.sort(ab);  
            
               for(VideoGameStation temp: ab){
                
                System.out.println("Customer Name:"+temp.getcustomerName());
                System.out.println("Video Game Station Name:"+temp.getgameStation());
            }
            }
        
}    
        
        
    
    
