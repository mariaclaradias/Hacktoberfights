class centuryFromYear{


  public static int centuryFromYear(int year) {
    int resp = 0;
    if(year%100==0){
        resp = year/100;
    }else{
        resp = (year/100) + 1;
    }
    return resp;
  }

  public static void main(String[] args) {
      System.out.println(centuryFromYear(2000));
  }
}
