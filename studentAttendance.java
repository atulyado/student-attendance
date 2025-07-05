class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        int latestreak =0;
         int m = s.length();
        for(int i=0;i<m;i++){
            int c = s.charAt(i);
            if(c == 'A'){//check if there how many absent there are if more than two it will return false
                absent++;
                if(absent >= 2){
                    return false;
                }
            }
            if(c == 'L'){// check how many late there are if more than 3 it return false
                latestreak++;
                if(latestreak >= 3){
                    return false;
                }
                }else{
                    latestreak = 0;//and here it reset the streak cause we need Three consecutive days
            }
        }
        return true;
        }
    }
