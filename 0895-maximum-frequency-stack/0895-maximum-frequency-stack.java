class FreqStack {
    HashMap<Integer,Deque> mstacks;
    HashMap<Integer, Integer> freqmap;
    public FreqStack() {
        mstacks =new HashMap<>();
        freqmap=new HashMap<>();
    }
    int maxfreq=0;
    public void push(int val) {
        freqmap.put(val,freqmap.getOrDefault(val,0)+1);
        int freq=freqmap.get(val);
        
        if(maxfreq<freq)
        {
            maxfreq=freq;
        }
        
        Deque<Integer> stack=new ArrayDeque<>();
        if(mstacks.containsKey(freq))
        {
            stack=mstacks.get(freq);
        }
        stack.push(val);
        mstacks.put(freq,stack);
    }
    public int pop() {
        
        int ans=(int)mstacks.get(maxfreq).pop();
        freqmap.put(ans,freqmap.getOrDefault(ans,0)-1);
        if(mstacks.get(maxfreq).size()==0)
        {
            mstacks.remove(maxfreq);
            maxfreq--;
        }
        return ans;
        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */