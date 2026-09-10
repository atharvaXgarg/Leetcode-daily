class Solution {
    public String convertDateToBinary(String date) {
       int year=Integer.parseInt(date.substring(0,4));
       int month=Integer.parseInt(date.substring(5,7));
       int day=Integer.parseInt(date.substring(8,10));
       // now binary string conversion
       return (Integer.toString(year,2)+"-"+Integer.toString(month,2)+"-"+Integer.toString(day,2));
    // String[] parts = date.split("-");
    //     return Integer.toBinaryString(Integer.parseInt(parts[0])) + "-" +
    //            Integer.toBinaryString(Integer.parseInt(parts[1])) + "-" +
    //            Integer.toBinaryString(Integer.parseInt(parts[2]));
    }
}
