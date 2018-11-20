
class Solution {
    public boolean judgeCircle(String moves) {
        boolean iscircle = false;
        int[] point = {0, 0};
        for (int i = 0; i < moves.length(); i++) {
            char s = moves.charAt(i);
            switch (s){
                case 'U':point[0]+=1;break;
                case 'D':point[0]-=1;break;
                case 'L':point[1]+=1;break;
                case 'R':point[1]-=1;break;
            }
        }
        if (point[0]==0 && point[1]==0){
            iscircle = true;
        }
        return iscircle;
    }
}