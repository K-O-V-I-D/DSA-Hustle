class Solution{
    static int setKthBit(int N,int K){
        if(N>=0){
            int bitmask=1<<K;
            return N | bitmask;
        }else{
            return N;
        }
    }
}
