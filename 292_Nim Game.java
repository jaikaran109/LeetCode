class Solution {
    public boolean canWinNim(int n) {
        if (n%4!=0){
            return true;
        }
        return false;
    }
}


// dekho iss game me jo last me stone nikalega vo jeet jayeaga thik 
// toh ab tm log bologe ye logic samjh nhi aaya kyu 4 se rem check kr rhe h 
// dhyan do agr hm optimal gameplay kr rhe h to usme hrdm try krenge ki opp. pe n 4 ka multiple aaye kyuki phir vo kuch bhi remove krega winner tm hi hoge 


//EXAMPLE 
// n = 9 
// step 1 : tm 1 ball choose kroge ki opponent pe n 4 ka multiple aaye 
// step 2 : maan lo ki opp.  ne 1 se 3 tk kuch bhi select liya (ex 3)
// step 3 : next time tm phir balls select kr ke n 4 ka multiple lete aana( ex 1)
// last possibility : ab last me n 4 hoga aur opponent agr isme se kuch bhi choose krta h ( 1 se 3 tk) last me minimum 1 ball rah jayegi aur tm jeet jaoge 
