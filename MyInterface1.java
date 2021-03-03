    
    public interface MyInterface1
    {
     
         
        public String getgameStation();
        
        public String getvideoGame();
        
        public String getcustomerName();
        
        public String getcustomerType();
        
        public String getbookingDate();
        
        public int getduration();
        
        public int gethourlyRate();
        
        public boolean getavailableStatus();
        
        public void setcustomerType(String customerType);
        
        public void sethourlyRate(int hourlyRate);
        
        public void booking(String customerName,String customerType,String bookingDate,int duration );
        
        public void status();
        
        public void showResult();
        
        public int compareTo(VideoGameStation var);
    }
