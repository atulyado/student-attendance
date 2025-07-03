class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        int latestreak =0;
         int m = s.length();
        for(int i=0;i<m;i++){
            int c = s.charAt(i);
            if(c == 'A'){
                absent++;
                if(absent >= 2){
                    return false;
                }
            }
            if(c == 'L'){
                latestreak++;
                if(latestreak >= 3){
                    return false;
                }
                }else{
                    latestreak = 0;
            }
        }
        return true;
        }
    }
