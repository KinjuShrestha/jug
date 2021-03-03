//Super Potato Game Station is a game station in which this Java Project  

import java.io.Serializable;


public class VideoGameStation implements MyInterface1,Serializable,Comparable<VideoGameStation>{
    
    
    //ans 1
    //instance variables
    
    String gameStation;
    String videoGame;
    String customerName;
    String customerType;
    String bookingDate;
     int duration;
     int hourlyRate;
     boolean availableStatus;
    
   
    //ans 2
    //constructors
    
   public VideoGameStation(String game,String video,int rate){
        this.gameStation=game;
        this.videoGame=video;
        this.customerName="";
        this.customerType="";
        this.bookingDate="";
        this.duration=0;
        this.hourlyRate=rate;
        this.availableStatus=true;
    } 
        
     //ans 3
     //method to return values
   
    
    public String getgameStation(){return gameStation;}
        
    public String getvideoGame(){return videoGame;}
    
    
    public String getcustomerName(){return customerName;}
    
  
    public String getcustomerType(){return customerType;}
    
    
    public String getbookingDate(){return bookingDate;}
    
    
    public int getduration(){return duration;}
    
   
    public int gethourlyRate(){return hourlyRate;}
    
     
    public boolean getavailableStatus(){return availableStatus;}
       
       
       
   
       //ans 4
       //method to set values
       
    public void setcustomerType(String customerType){
         this.customerType=customerType;
         }
    public void sethourlyRate(int hourlyRate){
            this.hourlyRate=hourlyRate;
        }
        
   
    //ans 5
    //method to create booking scenario
        
        public void booking(String name,String type,String date,int duration ){
            this.customerName=name;
            this.customerType=type;
            this.bookingDate=date;
            this.duration=duration;
            
            if(availableStatus==true){
            
                System.out.println("Name of the customer:"+customerName);
                System.out.println("Customer Type:"+customerType);
                System.out.println("Booking Date:"+bookingDate);
                System.out.println("Duration:"+duration);
                this.availableStatus=false;
            }
            else{
                System.out.println("The game station is not free today. Sorry!!");
                System.out.println("The Game station will be free for booking after:"+duration+"at"+bookingDate);
                
            }
    }

            
            //ans 6
            //method to show booking availibility
            
           public void status(){
            if(availableStatus==true){
                    System.out.println("The game station is available");
            }
            else{
                    this.customerName="";
                    this.customerType="";
                    this.bookingDate="";
                    this.duration=0;
                    this.availableStatus=true;
            }
    }        
    
    //ans 7
      //method to show result
       public void showResult(){
        System.out.println("Game Station Name:"+gameStation);
        System.out.println("Hourly Rate:"+hourlyRate);
    }
    
    //method for Question 15//
    @Override
    public int compareTo(VideoGameStation var)
    {
            int result=0;
            int result1=this.customerName.compareToIgnoreCase(var.customerName);
            int result2=this.gameStation.compareToIgnoreCase(var.gameStation);
            
            if(result1!=0){
                result=result1;
            }
            else{
                if(result2!=0){
                    result=result2;
                }
            }
            return(result); 
        }
}











    




   
