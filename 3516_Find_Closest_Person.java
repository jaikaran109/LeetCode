class Solution {
    public int findClosest(int x, int y, int z) {
        int person1 = 0;
        int person2 = 0;
        person1 = Math.abs(x-z);
        person2 = Math.abs(y-z);
        if (person1 < person2){
            return 1;
        }else if(person1 > person2){
            return 2;
        }else{
            return 0;
        }
    }
}
